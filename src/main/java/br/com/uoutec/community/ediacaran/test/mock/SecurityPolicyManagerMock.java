package br.com.uoutec.community.ediacaran.test.mock;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.annotation.Generated;

import br.com.uoutec.application.security.SecurityPermission;
import br.com.uoutec.ediacaran.core.SecurityPolicyManagerImp;
import br.com.uoutec.ediacaran.core.plugins.PluginConfiguration;
import br.com.uoutec.ediacaran.core.plugins.PluginException;
import br.com.uoutec.ediacaran.core.security.PermissionType;
import br.com.uoutec.ediacaran.core.security.SecurityPermissionStatus;

public class SecurityPolicyManagerMock 
	extends SecurityPolicyManagerImp {

	private Map<String, Set<SecurityPermission>> permissions;

	private boolean loadAllPermissions;
	
	@Generated("SparkTools")
	private SecurityPolicyManagerMock(Builder builder) {
		this.permissions = builder.permissions;
		this.loadAllPermissions = builder.loadAllPermissions;
	}
	
	public Set<SecurityPermissionStatus> loadPermissions(PluginConfiguration pluginConfiguration) {
		
		Set<SecurityPermissionStatus> result = new HashSet<>();
		
		if(loadAllPermissions) {
			result.addAll(super.loadPermissions(pluginConfiguration));
		}
		
		Set<SecurityPermission> override = 
				permissions.get(pluginConfiguration.getMetadata().getCode());
		
		if(override != null) {
			for(SecurityPermission sp: override) {
				result.add(toSecurityPermissionStatus(sp));
			}
		}
		
		return result;
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
	
	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	@Generated("SparkTools")
	public static final class Builder {
		private Map<String, Set<SecurityPermission>> permissions = new HashMap<String, Set<SecurityPermission>>();
		private boolean loadAllPermissions;
		
		private Builder() {
		}

		public Builder withLoadAllPermissions(boolean value) {
			this.loadAllPermissions = value;
			return this;
		}
		
		public Builder withPermission(String context, SecurityPermission permission) {
			Set<SecurityPermission> set = permissions.get(context);
			
			if(set == null) {
				set = new HashSet<>();
				permissions.put(context, set);
			}
			
			set.add(permission);
			return this;
		}

		public SecurityPolicyManagerMock build() {
			return new SecurityPolicyManagerMock(this);
		}
	}
	
}
