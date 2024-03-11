package br.com.uoutec.community.ediacaran.test.mock;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.uoutec.application.bean.Bean;
import br.com.uoutec.application.bean.BeanPropertyAnnotation;
import br.com.uoutec.ediacaran.core.BeanFactory;

public class MockBeanDiscover {
	
	public Map<Class<?>, Object> getMocks(Class<?> clazz, String pluginContext){
		
		Map<Class<?>, Object> map = new HashMap<Class<?>, Object>();
		
		Bean bean = new Bean(clazz);
		
		List<BeanPropertyAnnotation> props = bean.getProperties();
		Map<String, Map<Object,Object>> cache = new HashMap<>();
		
		for(BeanPropertyAnnotation p: props) {
			
			if(p.isAnnotationPresent(Mock.class)) {
				Mock mock = p.getAnnotation(Mock.class);
				String context = mock.value().trim();
				
				Map<Object,Object> c = cache.get(context);
				
				if(c == null) {
					c = new HashMap<>();
					cache.put(context, c);
				}
				
				BeanFactory factory = new MockBeanFactory(clazz, p.getName(), context, c);
				map.put(p.getDeclaredType(), factory);
			}
			
		}
		
		return map;
	}
	
}
