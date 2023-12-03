package br.com.uoutec.community.ediacaran.plugins.mock;

import javax.annotation.Generated;

import br.com.uoutec.ediacaran.core.plugins.PluginConfiguration;
import br.com.uoutec.ediacaran.core.plugins.PluginType;

public class PluginTypeMock implements PluginType{

	private Class<?> type;
	
	private Package packageName;
	
	private Package[] packagesName;

	private Package[] parentPackages;

	private ClassLoader classLoader;

	private ClassLoader[] parentClassLoader;

	private PluginConfiguration configuration;

	@Generated("SparkTools")
	private PluginTypeMock(Builder builder) {
		this.type = builder.type;
		this.packageName = builder.packageName;
		this.packagesName = builder.packagesName;
		this.parentPackages = builder.parentPackages;
		this.classLoader = builder.classLoader;
		this.parentClassLoader = builder.parentClassLoader;
		this.configuration = builder.configuration;
	}

	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	@Generated("SparkTools")
	public static final class Builder {
		private Class<?> type;
		private Package packageName;
		private Package[] packagesName;
		private Package[] parentPackages;
		private ClassLoader classLoader;
		private ClassLoader[] parentClassLoader;
		private PluginConfiguration configuration;

		private Builder() {
		}

		public Builder withType(Class<?> type) {
			this.type = type;
			return this;
		}

		public Builder withPackageName(Package packageName) {
			this.packageName = packageName;
			return this;
		}

		public Builder withPackagesName(Package[] packagesName) {
			this.packagesName = packagesName;
			return this;
		}

		public Builder withParentPackages(Package[] parentPackages) {
			this.parentPackages = parentPackages;
			return this;
		}

		public Builder withClassLoader(ClassLoader classLoader) {
			this.classLoader = classLoader;
			return this;
		}

		public Builder withParentClassLoader(ClassLoader[] parentClassLoader) {
			this.parentClassLoader = parentClassLoader;
			return this;
		}

		public Builder withConfiguration(PluginConfiguration configuration) {
			this.configuration = configuration;
			return this;
		}

		public PluginTypeMock build() {
			return new PluginTypeMock(this);
		}
	}

	@Override
	public Class<?> getType() {
		return type;
	}

	@Override
	public Package getPackage() {
		return packageName;
	}

	@Override
	public Package[] getPackages() {
		return packagesName;
	}

	@Override
	public Package[] getParentPackages() {
		return parentPackages;
	}

	@Override
	public ClassLoader getClassLoader() {
		return classLoader;
	}

	@Override
	public ClassLoader[] getParentClassLoader() {
		return parentClassLoader;
	}

	@Override
	public PluginConfiguration getConfiguration() {
		return configuration;
	}

}
