package br.com.uoutec.community.ediacaran.test.mock;

import org.mockito.Mockito;

import br.com.uoutec.community.ediacaran.BeanFactory;

public class MockBeanFactory implements BeanFactory{

	private Class<?> type;
	
	public void setType(Class<?> type) {
		this.type = type;
	}
	
	@Override
	public Object getInstance() {
		return Mockito.mock(type);
	}
	
}
