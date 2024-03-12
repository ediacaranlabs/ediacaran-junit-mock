package br.com.uoutec.community.ediacaran.test.mock;

import java.util.HashSet;
import java.util.Optional;
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
		
		if(!pluginConfiguration.getMetadata().getCode().equals(pluginContext)) {
			return super.loadPermissions(pluginConfiguration);
		}
		
		
		SecurityPermissionsDiscover spd = new SecurityPermissionsDiscover();
		Optional<Set<SecurityPermission>> per = spd.getSecurityPermissions(testClass);
		
		if(per.isPresent()) {
			Set<SecurityPermissionStatus> sps = new HashSet<>();
			for(SecurityPermission sp: per.get()) {
				sps.add(toSecurityPermissionStatus(sp));
			}
			return sps;
		}
		
		return super.loadPermissions(pluginConfiguration);
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
