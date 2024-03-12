package br.com.uoutec.community.ediacaran.test.mock;

import java.util.Optional;
import java.util.Set;

import br.com.uoutec.application.bean.Bean;
import br.com.uoutec.application.bean.BeanException;
import br.com.uoutec.application.security.SecurityPermission;
import br.com.uoutec.ediacaran.core.EdiacaranBootstrapException;

public class SecurityPermissionsDiscover {
	
	@SuppressWarnings("unchecked")
	public Optional<Set<SecurityPermission>> getSecurityPermissions(Class<?> clazz){
		try {
			Object o = clazz.getConstructor().newInstance();
			Bean bean = new Bean(o, clazz);
			return Optional.of((Set<SecurityPermission>) bean.get("securityPermissions"));
		}
		catch(BeanException ex) {
			return Optional.empty();
		}
		catch(Throwable ex) {
			throw new EdiacaranBootstrapException(ex);
		}
		
	}
	
}
