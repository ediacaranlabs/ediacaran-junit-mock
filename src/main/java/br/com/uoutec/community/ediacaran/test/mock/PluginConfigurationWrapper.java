package br.com.uoutec.community.ediacaran.test.mock;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

import br.com.uoutec.ediacaran.core.plugins.PluginConfiguration;
import br.com.uoutec.ediacaran.core.plugins.PluginConfigurationImp;
import br.com.uoutec.ediacaran.core.plugins.PluginConfigurationMetadata;
import br.com.uoutec.ediacaran.core.plugins.PluginProperty;

public class PluginConfigurationWrapper extends PluginConfigurationImp {

	private PluginConfiguration obj;

	private PluginConfigurationMetadata metadata;
	
	public PluginConfigurationWrapper(PluginConfiguration obj, PluginConfigurationMetadata metadata) {
		super(metadata, new HashMap<>());
		this.obj = obj;
		this.metadata = metadata;
	}
	
	public PluginConfigurationMetadata getMetadata() {
		return metadata == null? obj.getMetadata() : metadata;
	}

	public PluginProperty getPropertyMetadata(String value) {
		return obj.getPropertyMetadata(value);
	}

	public String getRawValue(String property) {
		return obj.getRawValue(property);
	}

	public String getString(String property) {
		return obj.getString(property);
	}

	public boolean getBoolean(String property) {
		return obj.getBoolean(property);
	}

	public void setValue(String property, boolean value) {
		obj.setValue(property, value);
	}

	public int getInt(String property) {
		return obj.getInt(property);
	}

	public void setValue(String property, int value) {
		obj.setValue(property, value);
	}

	public long getLong(String property) {
		return obj.getLong(property);
	}

	public void setValue(String property, long value) {
		obj.setValue(property, value);
	}

	public double getDouble(String property) {
		return obj.getDouble(property);
	}

	public void setValue(String property, double value) {
		obj.setValue(property, value);
	}

	public float getFloat(String property) {
		return obj.getFloat(property);
	}

	public void setValue(String property, float value) {
		obj.setValue(property, value);
	}

	public BigDecimal getNumber(String property) {
		return obj.getNumber(property);
	}

	public void setValue(String property, Number value) {
		obj.setValue(property, value);
	}

	public String getValue(String property) {
		return obj.getValue(property);
	}

	public void setValue(String property, String value) {
		obj.setValue(property, value);
	}

	public List<String> getRawValues(String property) {
		return obj.getRawValues(property);
	}

	public void setStrings(String property, List<String> value) {
		obj.setStrings(property, value);
	}

	public List<String> getStrings(String property) {
		return obj.getStrings(property);
	}

	public List<Boolean> getBooleans(String property) {
		return obj.getBooleans(property);
	}

	public void setBooleans(String property, List<Boolean> values) {
		obj.setBooleans(property, values);
	}

	public List<Integer> getInts(String property) {
		return obj.getInts(property);
	}

	public void setInts(String property, List<Integer> values) {
		obj.setInts(property, values);
	}

	public List<Long> getLongs(String property) {
		return obj.getLongs(property);
	}

	public void setLongs(String property, List<Long> values) {
		obj.setLongs(property, values);
	}

	public List<Double> getDoubles(String property) {
		return obj.getDoubles(property);
	}

	public void setDoubles(String property, List<Double> values) {
		obj.setDoubles(property, values);
	}

	public List<Float> getFloats(String property) {
		return obj.getFloats(property);
	}

	public void setFloats(String property, List<Float> values) {
		obj.setFloats(property, values);
	}

	public List<BigDecimal> getNumbers(String property) {
		return obj.getNumbers(property);
	}

	public void setNumbers(String property, List<Number> values) {
		obj.setNumbers(property, values);
	}

	@Override
	public int hashCode() {
		return obj.hashCode();
	}

	@Override
	public boolean equals(Object e) {
		return obj.equals(e);
	}
	
}
