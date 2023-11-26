package br.com.uoutec.community.ediacaran.plugins.mock;

import javax.annotation.Generated;

import br.com.uoutec.application.io.Path;
import br.com.uoutec.community.ediacaran.plugins.PluginPath;

public class PluginPathMock extends PluginPath{

	@Generated("SparkTools")
	private PluginPathMock(Builder builder) {
		super(builder.code, builder.supplier, builder.base, builder.config, builder.libPath, builder.classesPath);
	}

	public PluginPathMock(String code, String supplier, Path base, Path config, Path libPath, Path classesPath) {
		super(code, supplier, base, config, libPath, classesPath);
	}

	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	@Generated("SparkTools")
	public static final class Builder {
		private String code;
		private String supplier;
		private Path base;
		private Path config;
		private Path libPath;
		private Path classesPath;

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

		public PluginPathMock build() {
			return new PluginPathMock(this);
		}
	}

}
