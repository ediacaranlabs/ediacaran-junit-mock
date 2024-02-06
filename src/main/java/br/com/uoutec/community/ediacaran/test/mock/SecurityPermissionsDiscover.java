package br.com.uoutec.community.ediacaran.test.mock;

import java.util.HashSet;
import java.util.Set;

import br.com.uoutec.application.bean.Bean;
import br.com.uoutec.application.bean.BeanException;
import br.com.uoutec.application.security.AllSecurityPermission;
import br.com.uoutec.application.security.SecurityPermission;
import br.com.uoutec.ediacaran.core.EdiacaranBootstrapException;

public class SecurityPermissionsDiscover {
	
	@SuppressWarnings("serial")
	private Set<SecurityPermission> defaultPermissions = new HashSet<SecurityPermission>() {{
		add(new AllSecurityPermission());
	}};
	
	@SuppressWarnings("unchecked")
	public Set<SecurityPermission> getSecurityPermissions(Class<?> clazz){
		
		
		try {
			Object o = clazz.getConstructor().newInstance();
			Bean bean = new Bean(o, clazz);
			return (Set<SecurityPermission>) bean.get("securityPermissions");
		}
		catch(BeanException ex) {
			return defaultPermissions;
		}
		catch(Throwable ex) {
			throw new EdiacaranBootstrapException(ex);
		}
		
	}
	
}
