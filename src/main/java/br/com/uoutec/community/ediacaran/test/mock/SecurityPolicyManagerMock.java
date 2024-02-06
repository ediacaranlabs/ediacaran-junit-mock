package br.com.uoutec.community.ediacaran.test.mock;

import java.util.HashSet;
import java.util.Set;

import br.com.uoutec.application.security.SecurityPermission;
import br.com.uoutec.ediacaran.core.SecurityPolicyManagerImp;
import br.com.uoutec.ediacaran.core.plugins.PluginConfiguration;
import br.com.uoutec.ediacaran.core.plugins.PluginException;
import br.com.uoutec.ediacaran.core.security.PermissionType;
import br.com.uoutec.ediacaran.core.security.SecurityPermissionStatus;

public class SecurityPolicyManagerMock 
	extends SecurityPolicyManagerImp {

	private String pluginContext;
	
	private Class<?> testClass;
	
	public SecurityPolicyManagerMock(String pluginContext, Class<?> testClass) {
		this.pluginContext = pluginContext;
		this.testClass = testClass;
	}
	
	public Set<SecurityPermissionStatus> loadPermissions(PluginConfiguration pluginConfiguration) {
		if(!pluginConfiguration.getMetadata().getCode().equals(pluginContext))
			return super.loadPermissions(pluginConfiguration);
		
		Set<SecurityPermissionStatus> sps = new HashSet<>();
		
		SecurityPermissionsDiscover spd = new SecurityPermissionsDiscover();
		for(SecurityPermission sp: spd.getSecurityPermissions(testClass)) {
			sps.add(toSecurityPermissionStatus(sp));
		}
		
		return sps;
	}
	
	private SecurityPermissionStatus toSecurityPermissionStatus(SecurityPermission value) {
		
		for(PermissionType pt: PermissionType.values()) {
			SecurityPermissionStatus st = null;
			if((st = pt.toSecurityPermissionStatus(value)) != null) {
				return st;
			}
		}
		
		throw new PluginException(String.valueOf(value));
	}
	
}
