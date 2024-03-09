package br.com.uoutec.community.ediacaran.plugins.mock;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.Generated;

import br.com.uoutec.ediacaran.core.plugins.PluginConfigurationImp;
import br.com.uoutec.ediacaran.core.plugins.PluginConfigurationMetadata;
import br.com.uoutec.ediacaran.core.plugins.PluginProperty;
import br.com.uoutec.ediacaran.core.plugins.PluginPropertyValue;

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

		public Builder withValues(Map<PluginProperty,PluginPropertyValue> values) {
			for(Entry<PluginProperty,PluginPropertyValue> e: values.entrySet()) {
				values.put(e.getKey(), e.getValue());
			}
			return this;
		}
		
		public PluginConfigurationMock build() {
			return new PluginConfigurationMock(this);
		}
	}


}
