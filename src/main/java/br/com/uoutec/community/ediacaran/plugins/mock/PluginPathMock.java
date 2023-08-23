package br.com.uoutec.community.ediacaran.plugins.mock;

import java.io.File;

import br.com.uoutec.community.ediacaran.plugins.PluginPath;
import javax.annotation.Generated;

public class PluginPathMock extends PluginPath{

	@Generated("SparkTools")
	private PluginPathMock(Builder builder) {
		super(builder.code, builder.supplier, builder.base, builder.config, builder.libPath, builder.classesPath);
	}

	public PluginPathMock(String code, String supplier, File base, File config, File libPath, File classesPath) {
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
		private File base;
		private File config;
		private File libPath;
		private File classesPath;

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

		public Builder withBase(File base) {
			this.base = base;
			return this;
		}

		public Builder withConfig(File config) {
			this.config = config;
			return this;
		}

		public Builder withLibPath(File libPath) {
			this.libPath = libPath;
			return this;
		}

		public Builder withClassesPath(File classesPath) {
			this.classesPath = classesPath;
			return this;
		}

		public PluginPathMock build() {
			return new PluginPathMock(this);
		}
	}

}
