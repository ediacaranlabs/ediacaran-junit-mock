package br.com.uoutec.community.ediacaran.test.mock;

import br.com.uoutec.application.bean.Bean;
import br.com.uoutec.application.bean.BeanException;
import br.com.uoutec.ediacaran.core.EdiacaranBootstrap;
import br.com.uoutec.ediacaran.core.EdiacaranBootstrapException;

public class EdiacaranBootstrapDiscover {

	public EdiacaranBootstrap getEdiacaranBootstrap(Class<?> clazz){
		try {
			ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
			clazz = classLoader.loadClass(clazz.getName());
			Object o = clazz.getConstructor().newInstance();
			Bean bean = new Bean(o, clazz);
			return (EdiacaranBootstrap) bean.get("ediacaranBootstrap");
		}
		catch(BeanException ex) {
			return null;
		}
		catch(Throwable ex) {
			throw new EdiacaranBootstrapException(ex);
		}
		
	}
	
}
