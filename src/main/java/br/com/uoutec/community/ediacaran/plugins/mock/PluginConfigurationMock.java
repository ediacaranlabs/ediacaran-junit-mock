package br.com.uoutec.community.ediacaran.plugins.mock;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import br.com.uoutec.community.ediacaran.plugins.PluginConfigurationImp;
import br.com.uoutec.community.ediacaran.plugins.PluginConfigurationMetadata;
import br.com.uoutec.community.ediacaran.plugins.PluginProperty;
import br.com.uoutec.community.ediacaran.plugins.PluginPropertyValue;

public class PluginConfigurationMock extends PluginConfigurationImp{

	@Generated("SparkTools")
	private PluginConfigurationMock(Builder builder) {
		super(builder.pluginConfigurationMetadata, builder.values);
	}

	public PluginConfigurationMock(PluginConfigurationMetadata pluginConfigurationMetadata,
			Map<PluginProperty, PluginPropertyValue> values) {
		super(pluginConfigurationMetadata, values);
	}

	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	@Generated("SparkTools")
	public static final class Builder {
		private PluginConfigurationMetadata pluginConfigurationMetadata;
		private Map<PluginProperty, PluginPropertyValue> values = new HashMap<PluginProperty, PluginPropertyValue>();

		private Builder() {
		}

		public Builder withPluginConfigurationMetadata(PluginConfigurationMetadata pluginConfigurationMetadata) {
			this.pluginConfigurationMetadata = pluginConfigurationMetadata;
			return this;
		}

		public Builder withValue(PluginProperty prop, PluginPropertyValue value) {
			values.put(prop, value);
			return this;
		}

		public PluginConfigurationMock build() {
			return new PluginConfigurationMock(this);
		}
	}


}
