package br.com.uoutec.community.ediacaran.test.mock;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.uoutec.application.bean.Bean;
import br.com.uoutec.application.bean.BeanPropertyAnnotation;
import br.com.uoutec.ediacaran.core.BeanFactory;
import br.com.uoutec.ediacaran.core.EdiacaranBootstrapException;

public class MockBeanDiscover {
	
	public Map<Class<?>, Object> getMocks(Class<?> clazz, String pluginContext){
		
		Map<Class<?>, Object> map = new HashMap<Class<?>, Object>();
		
		Object[] testObject = new Object[1];
		
		Bean bean = new Bean(clazz);
		List<BeanPropertyAnnotation> props = bean.getProperties();
		
		for(BeanPropertyAnnotation p: props) {
			if(p.isAnnotationPresent(Mock.class)) {
				BeanFactory bf = new BeanFactory() {
					
					@Override
					public Object getInstance() {
						try {
							ClassLoader cl = Thread.currentThread().getContextClassLoader();
							
							if(testObject[0] == null) {
								Class<?> testType = cl.loadClass(clazz.getName());
								testObject[0]     = testType.getConstructor().newInstance();
							}
							
							Bean testBean        = new Bean(testObject[0]);
							Object propertyValue = testBean.get(p.getName());
							
							if(propertyValue != null) {
								return propertyValue;
							}
							
							Class<?> mockFactory = cl.loadClass(MockBeanFactory.class.getName());
							Class<?> type        = cl.loadClass(p.getType().getName());
							Object factory       = mockFactory.getConstructor().newInstance();
							
							mockFactory.getMethod("setType", Class.class).invoke(factory, type);
							return mockFactory.getMethod("getInstance").invoke(factory);
							
						}
						catch(Throwable ex) {
							throw new EdiacaranBootstrapException(ex);
						}
					}

					@Override
					public boolean acceptPluginContext(String value) {
						
						Mock mock = p.getAnnotation(Mock.class);
						
						if(mock != null) {
							if(mock.value().isEmpty() || value.equals(mock.value())) {
								return true;
							}
						}
						
						return pluginContext == null || value.equals(pluginContext);
					}
					
				};
				
				map.put(p.getDeclaredType(), bf);
			}
		}
		
		return map;
	}
	
}
