package br.com.uoutec.community.ediacaran.plugins.mock;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.annotation.Generated;

import br.com.uoutec.application.io.Path;
import br.com.uoutec.ediacaran.core.plugins.PluginConfiguration;
import br.com.uoutec.ediacaran.core.plugins.PluginConfigurationMetadata;
import br.com.uoutec.ediacaran.core.plugins.PluginDependency;
import br.com.uoutec.ediacaran.core.plugins.PluginPath;
import br.com.uoutec.ediacaran.core.plugins.PluginProperty;
import br.com.uoutec.ediacaran.core.plugins.PluginPropertyType;
import br.com.uoutec.ediacaran.core.plugins.PluginPropertyValue;
import br.com.uoutec.ediacaran.core.plugins.PluginVersion;
import br.com.uoutec.ediacaran.core.plugins.VersionComparator;
import br.com.uoutec.ediacaran.core.security.PermissionType;
import br.com.uoutec.ediacaran.core.security.SecurityPermissionRequest;

@SuppressWarnings("unused")
public class PluginConfigurationBuilder {

	private String code;
	
	private String supplier;
	
	private String name;
	
	private String installer;
	
	private Path base;
	
	private Path config;
	
	private Path libPath;
	
	private Path classesPath;

	private Map<PluginProperty, PluginPropertyValue> properties = new HashMap<>();
	
	private Set<PluginDependency> dependencies = new HashSet<>();
	
	private Set<SecurityPermissionRequest> securityPermissionRequests = new HashSet<>();
	
	@Generated("SparkTools")
	private PluginConfigurationBuilder(Builder builder) {
		this.code = builder.code;
		this.supplier = builder.supplier;
		this.name = builder.name;
		this.installer = builder.installer;
		this.base = builder.base;
		this.config = builder.config;
		this.libPath = builder.libPath;
		this.classesPath = builder.classesPath;
	}

	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	@Generated("SparkTools")
	public static final class Builder {
		private String code;
		private String supplier;
		private String name;
		private String installer;
		private Path base;
		private Path config;
		private Path libPath;
		private Path classesPath;
		private Map<PluginProperty, PluginPropertyValue> properties = new HashMap<>();
		private Set<PluginDependency> dependencies = new HashSet<>();
		private Set<SecurityPermissionRequest> securityPermissionRequests = new HashSet<>();

		private Builder() {
		}

		public Builder withCode(String code) {
			this.code = code;
			return this;
		}

		public Builder withSupplier(String supplier) {
			this.supplier = supplier;
			return this;
		}

		public Builder withName(String name) {
			this.name = name;
			return this;
		}

		public Builder withInstaller(String installer) {
			this.installer = installer;
			return this;
		}

		public Builder withBase(Path base) {
			this.base = base;
			return this;
		}

		public Builder withConfig(Path config) {
			this.config = config;
			return this;
		}

		public Builder withLibPath(Path libPath) {
			this.libPath = libPath;
			return this;
		}

		public Builder withClassesPath(Path classesPath) {
			this.classesPath = classesPath;
			return this;
		}

		public Builder withPluginProperty(PluginProperty property, String ... values) {
			this.properties.put(property, PluginPropertyValueBuilder.builder().withValues(values).build());
			return this;
		}

		public Builder withPluginProperty(String code, PluginPropertyType type, String ... values) {
			
			PluginProperty pluginProperty =
				PluginPropertyMock.builder()
				.withCode(code)
				.withType(type)
			.build();
			
			this.properties.put(pluginProperty, PluginPropertyValueBuilder.builder().withValues(values).build());
			return this;
		}

		public Builder withPluginDependency(PluginDependency pluginDependency) {
			this.dependencies.add(pluginDependency);
			return this;
		}

		public Builder withPluginProperty(String code,String supplier, boolean regex, PluginVersion version,
				VersionComparator comparator, boolean optional) {
			
			PluginDependency pluginDependency =
					PluginDependencyMock.builder()
						.withCode(code)
						.withComparator(comparator)
						.withOptional(optional)
						.withRegex(regex)
						.withSupplier(supplier)
						.withVersion(version)
					.build();
			
			this.dependencies.add(pluginDependency);
			return this;
		}

		public Builder withSecurityPermission(SecurityPermissionRequest securityPermissionRequest) {
			this.securityPermissionRequests.add(securityPermissionRequest);
			return this;
		}

		public Builder withSecurityPermission(String name, PermissionType permission, String actions) {
			
			SecurityPermissionRequest securityPermissionRequest =
					SecurityPermissionRequestMock.builder()
						.withActions(actions)
						.withName(name)
						.withPermission(permission)
					.build();
			
			this.securityPermissionRequests.add(securityPermissionRequest);
			return this;
		}
		
		public PluginConfiguration build() {
			
			PluginPath pluginPath = PluginPathMock.builder()
					.withBase(base)
					.withConfig(config)
					.withCode(code)
					.withSupplier(supplier)
				.build();
			
			PluginConfigurationMetadata pluginConfigurationMetadata = 
					PluginConfigurationMetadataMock.builder()
						.withPath(pluginPath)
						.withCode(code)
						.withSupplier(supplier)
						.withName(name)
						.withPluginInstaller(installer)
						.withProperties(properties.keySet().stream().toArray(PluginProperty[]::new))
						.withDependencies(dependencies.stream().toArray(PluginDependency[]::new))
					.build();
					
			PluginConfiguration pluginConfiguration =
					PluginConfigurationMock.builder()
						.withPluginConfigurationMetadata(pluginConfigurationMetadata)
						.withValues(properties)
					.build();
			
			return pluginConfiguration;
		}
	}
	
	
}
