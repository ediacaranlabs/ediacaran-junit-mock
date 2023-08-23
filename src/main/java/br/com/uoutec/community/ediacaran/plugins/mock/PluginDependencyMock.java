package br.com.uoutec.community.ediacaran.plugins.mock;

import br.com.uoutec.community.ediacaran.plugins.PluginDependency;
import br.com.uoutec.community.ediacaran.plugins.PluginVersion;
import br.com.uoutec.community.ediacaran.plugins.VersionComparator;
import javax.annotation.Generated;

public class PluginDependencyMock extends PluginDependency{

	@Generated("SparkTools")
	private PluginDependencyMock(Builder builder) {
		super(builder.supplier, builder.code, builder.version, builder.optional, builder.regex, builder.comparator);
	}

	public PluginDependencyMock(String supplier, String code, PluginVersion version, boolean optional, boolean regex,
			VersionComparator comparator) {
		super(supplier, code, version, optional, regex, comparator);
	}

	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	@Generated("SparkTools")
	public static final class Builder {
		private String supplier;
		private String code;
		private PluginVersion version;
		private boolean optional;
		private boolean regex;
		private VersionComparator comparator;

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

		public Builder withVersion(PluginVersion version) {
			this.version = version;
			return this;
		}

		public Builder withOptional(boolean optional) {
			this.optional = optional;
			return this;
		}

		public Builder withRegex(boolean regex) {
			this.regex = regex;
			return this;
		}

		public Builder withComparator(VersionComparator comparator) {
			this.comparator = comparator;
			return this;
		}

		public PluginDependencyMock build() {
			return new PluginDependencyMock(this);
		}
	}

}
