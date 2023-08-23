package br.com.uoutec.community.ediacaran.plugins.mock;

import br.com.uoutec.community.ediacaran.plugins.PluginPropertyOption;
import javax.annotation.Generated;

public class PluginPropertyOptionMock extends PluginPropertyOption{

	@Generated("SparkTools")
	private PluginPropertyOptionMock(Builder builder) {
		super(builder.value, builder.description);
	}

	public PluginPropertyOptionMock(String value, String description) {
		super(value, description);
	}

	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	@Generated("SparkTools")
	public static final class Builder {
		private String value;
		private String description;

		private Builder() {
		}

		public Builder withValue(String value) {
			this.value = value;
			return this;
		}

		public Builder withDescription(String description) {
			this.description = description;
			return this;
		}

		public PluginPropertyOptionMock build() {
			return new PluginPropertyOptionMock(this);
		}
	}

}
