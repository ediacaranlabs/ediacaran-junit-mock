package br.com.uoutec.community.ediacaran.plugins.mock;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import br.com.uoutec.ediacaran.core.plugins.PluginProperty;
import br.com.uoutec.ediacaran.core.plugins.PluginPropertyOption;
import br.com.uoutec.ediacaran.core.plugins.PluginPropertyType;
import br.com.uoutec.ediacaran.core.plugins.StaticPluginOptionsResolver;

public class PluginPropertyMock extends PluginProperty{

	@Generated("SparkTools")
	private PluginPropertyMock(Builder builder) {
		super(builder.code, builder.description, builder.comment, builder.name, builder.type, 
				builder.optionsClass, new StaticPluginOptionsResolver(builder.options), builder.allowEmpty, builder.min, 
				builder.rows, builder.max, builder.regex, builder.order, builder.protectedValue);
	}

	public PluginPropertyMock(String code, String description, String comment, String name, PluginPropertyType type,
			String optionsClass, List<PluginPropertyOption> options, boolean empty, short rows, short min, short max, String regex, short order,
			boolean protectedValue) {
		super(code, description, comment, name, type, optionsClass, new StaticPluginOptionsResolver(options), 
				empty, rows, min, max, regex, order, protectedValue);
	}

	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	@Generated("SparkTools")
	public static final class Builder {
		private String code;
		private String description;
		private String comment;
		private String name;
		private PluginPropertyType type;
		private List<PluginPropertyOption> options = new ArrayList<>();
		private String optionsClass;
		private short rows;
		private short min;
		private short max;
		private String regex;
		private short order;
		private boolean protectedValue;
		private boolean allowEmpty;

		private Builder() {
		}

		public Builder withCode(String code) {
			this.code = code;
			return this;
		}

		public Builder withDescription(String description) {
			this.description = description;
			return this;
		}

		public Builder withOptionsClass(String optionsClass) {
			this.optionsClass = optionsClass;
			return this;
		}
		public Builder withComment(String comment) {
			this.comment = comment;
			return this;
		}

		public Builder withName(String name) {
			this.name = name;
			return this;
		}

		public Builder withType(PluginPropertyType type) {
			this.type = type;
			return this;
		}

		public Builder withOption(PluginPropertyOption option) {
			this.options.add(option);
			return this;
		}

		public Builder withRows(short rows) {
			this.rows = rows;
			return this;
		}
		
		public Builder withMin(short min) {
			this.min = min;
			return this;
		}

		public Builder withMax(short max) {
			this.max = max;
			return this;
		}

		public Builder withRegex(String regex) {
			this.regex = regex;
			return this;
		}

		public Builder withOrder(short order) {
			this.order = order;
			return this;
		}

		public Builder withProtectedValue(boolean protectedValue) {
			this.protectedValue = protectedValue;
			return this;
		}

		public Builder withAllowEmpty(boolean allowEmpty) {
			this.allowEmpty = allowEmpty;
			return this;
		}

		public PluginPropertyMock build() {
			return new PluginPropertyMock(this);
		}
	}

}
