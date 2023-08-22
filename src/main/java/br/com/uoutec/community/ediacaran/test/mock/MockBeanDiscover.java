package br.com.uoutec.community.ediacaran.test.mock;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.uoutec.application.bean.Bean;
import br.com.uoutec.application.bean.BeanPropertyAnnotation;
import br.com.uoutec.community.ediacaran.BeanFactory;
import br.com.uoutec.community.ediacaran.EdiacaranBootstrapException;

public class MockBeanDiscover {
	
	public Map<Class<?>, Object> getMocks(Class<?> clazz){
		
		Map<Class<?>, Object> map = new HashMap<Class<?>, Object>();
		
		Bean bean = new Bean(clazz);
		List<BeanPropertyAnnotation> props = bean.getProperties();
		
		for(BeanPropertyAnnotation p: props) {
			if(p.isAnnotationPresent(Mock.class)) {
				BeanFactory bf = new BeanFactory() {
					
					@Override
					public Object getInstance() {
						try {
							ClassLoader cl = Thread.currentThread().getContextClassLoader();
							
							Class<?> testType    = cl.loadClass(clazz.getName());
							Object testObject    = testType.getConstructor().newInstance();
							Bean testBean        = new Bean(testObject);
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
						return mock.value().isEmpty() || value.equals(mock.value());
					}
				};
				
				map.put(p.getDeclaredType(), bf);
			}
		}
		
		return map;
	}
	
}
