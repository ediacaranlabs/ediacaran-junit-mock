package br.com.uoutec.community.ediacaran.plugins.mock;

import javax.annotation.Generated;

import br.com.uoutec.ediacaran.core.security.PermissionType;
import br.com.uoutec.ediacaran.core.security.SecurityPermissionRequest;

public class SecurityPermissionRequestMock extends SecurityPermissionRequest{

	@Generated("SparkTools")
	private SecurityPermissionRequestMock(Builder builder) {
		this.permission = builder.permission;
		this.name = builder.name;
		this.actions = builder.actions;
	}

	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	@Generated("SparkTools")
	public static final class Builder {
		private PermissionType permission;
		private String name;
		private String actions;

		private Builder() {
		}

		public Builder withPermission(PermissionType permission) {
			this.permission = permission;
			return this;
		}

		public Builder withName(String name) {
			this.name = name;
			return this;
		}

		public Builder withActions(String actions) {
			this.actions = actions;
			return this;
		}

		public SecurityPermissionRequestMock build() {
			return new SecurityPermissionRequestMock(this);
		}
	}

}
