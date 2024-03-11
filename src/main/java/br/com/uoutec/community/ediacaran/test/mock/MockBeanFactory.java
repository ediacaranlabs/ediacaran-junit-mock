package br.com.uoutec.community.ediacaran.test.mock;

import java.util.Map;

import org.mockito.Mockito;

import br.com.uoutec.application.bean.Bean;
import br.com.uoutec.ediacaran.core.BeanFactory;

public class MockBeanFactory implements BeanFactory{

	private Class<?> type;
	
	private Map<Object,Object> cache;
	
	private String property;
	
	private String context;
	
	public MockBeanFactory(Class<?> type, String property, String context, Map<Object,Object> cache) {
		this.type = type;
		this.property = property;
		this.cache = cache;
		this.context = context;
	}
	
	@Override
	public Object getInstance() {
		try {
			if(property != null) {
				return getInstance(property);
			}
			
			return getInstance(type);
		}
		catch(Throwable ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	public boolean acceptPluginContext(String value) {
		return value.equals(context) || context == null || context.isEmpty();
	}

	private Object getInstance(Class<?> type) throws Exception {
		
		if(cache.containsKey(getID("@"))) {
			return cache.get(getID("@@"));
		}
		
		ClassLoader cl = Thread.currentThread().getContextClassLoader();
		
		Class<?> contextType = cl.loadClass(type.getName());
		Object obj = contextType.getConstructor().newInstance();
		
		Bean bean = new Bean(obj, contextType);
		
		cache.put(getID("@"), bean);
		cache.put(getID("@@"), obj);
		
		return obj;
	}
	
	private Object getInstance(String name) throws Exception {
	
		if(cache.containsKey(getID(name))) {
			return cache.get(getID(name));
		}
		
		Bean bean = (Bean)cache.get(getID("@"));
		Object obj = bean.get(getID(name));
		
		if(obj == null) {
			obj = Mockito.mock(bean.getProperty(name).getType());
		}
		
		cache.put(getID(name), bean);
		
		return obj;
	}
	
	private String getID(String name) {
		return context + "::" + name;
	}
	
}
