package br.com.uoutec.community.ediacaran.plugins.mock;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import br.com.uoutec.ediacaran.core.VarParser;
import br.com.uoutec.ediacaran.core.plugins.PluginPropertyValue;

public class PluginPropertyValueBuilder extends PluginPropertyValue{

	@Generated("SparkTools")
	private PluginPropertyValueBuilder(Builder builder) {
		super(builder.varParser);
		this.values = builder.values;
	}

	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	@Generated("SparkTools")
	public static final class Builder {
		private VarParser varParser;
		private List<String> values = new ArrayList<>();

		private Builder() {
		}

		public Builder withVarParser(VarParser varParser) {
			this.varParser = varParser;
			return this;
		}

		public Builder withValue(String value) {
			this.values.add(value);
			return this;
		}

		public Builder withValues(String ... values) {
			for(String value: values) {
				this.values.add(value);
			}
			return this;
		}
		
		public PluginPropertyValueBuilder build() {
			return new PluginPropertyValueBuilder(this);
		}
	}

}
