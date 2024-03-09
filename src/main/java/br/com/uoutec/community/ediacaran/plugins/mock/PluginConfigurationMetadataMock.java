package br.com.uoutec.community.ediacaran.plugins.mock;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Generated;

import br.com.uoutec.ediacaran.core.plugins.PluginConfigurationMetadata;
import br.com.uoutec.ediacaran.core.plugins.PluginDependency;
import br.com.uoutec.ediacaran.core.plugins.PluginPath;
import br.com.uoutec.ediacaran.core.plugins.PluginProperty;
import br.com.uoutec.ediacaran.core.plugins.PluginVersion;
import br.com.uoutec.ediacaran.core.security.SecurityPermissionRequest;

public class PluginConfigurationMetadataMock extends PluginConfigurationMetadata{

	@Generated("SparkTools")
	private PluginConfigurationMetadataMock(Builder builder) {
		super(builder.supplier, builder.code, builder.name, builder.group, builder.subgroup, builder.version,
				builder.path, builder.pluginInstaller, builder.properties, builder.dependencies,
				builder.securityPermissionRequests);
	}

	public PluginConfigurationMetadataMock(String supplier, String code, String name, String group, String subgroup,
			PluginVersion version, PluginPath path, String pluginInstaller, List<PluginProperty> properties,
			Set<PluginDependency> dependencies, Set<SecurityPermissionRequest> securityPermissionRequests) {
		super(supplier, code, name, group, subgroup, version, path, pluginInstaller, properties, dependencies,
				securityPermissionRequests);
	}

	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	@Generated("SparkTools")
	public static final class Builder {
		private String supplier;
		private String code;
		private String name;
		private String group;
		private String subgroup;
		private PluginVersion version;
		private PluginPath path;
		private String pluginInstaller;
		private List<PluginProperty> properties = new ArrayList<>();
		private Set<PluginDependency> dependencies = new HashSet<>();
		private Set<SecurityPermissionRequest> securityPermissionRequests = new HashSet<>();

		private Builder() {
		}

		public Builder withSupplier(String supplier) {
			this.supplier = supplier;
			return this;
		}

		public Builder withCode(String code) {
			this.code = code;
			return this;
		}

		public Builder withName(String name) {
			this.name = name;
			return this;
		}

		public Builder withGroup(String group) {
			this.group = group;
			return this;
		}

		public Builder withSubgroup(String subgroup) {
			this.subgroup = subgroup;
			return this;
		}

		public Builder withVersion(PluginVersion version) {
			this.version = version;
			return this;
		}

		public Builder withPath(PluginPath path) {
			this.path = path;
			return this;
		}

		public Builder withPluginInstaller(String pluginInstaller) {
			this.pluginInstaller = pluginInstaller;
			return this;
		}

		public Builder withProperty(PluginProperty property) {
			this.properties.add(property);
			return this;
		}

		public Builder withProperties(PluginProperty ... properties) {
			for(PluginProperty property: properties) {
				this.properties.add(property);
			}
			return this;
		}
		
		public Builder withDependency(PluginDependency dependency) {
			this.dependencies.add(dependency);
			return this;
		}

		public Builder withSecurityPermissionRequest(SecurityPermissionRequest securityPermissionRequest) {
			this.securityPermissionRequests.add(securityPermissionRequest);
			return this;
		}

		public PluginConfigurationMetadataMock build() {
			return new PluginConfigurationMetadataMock(this);
		}
	}

}
