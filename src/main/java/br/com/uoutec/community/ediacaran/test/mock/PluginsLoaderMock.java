package br.com.uoutec.community.ediacaran.test.mock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.annotation.Generated;

import br.com.uoutec.application.io.Path;
import br.com.uoutec.ediacaran.core.VarParser;
import br.com.uoutec.ediacaran.core.plugins.MutablePluginConfiguration;
import br.com.uoutec.ediacaran.core.plugins.PluginConfiguration;
import br.com.uoutec.ediacaran.core.plugins.PluginConfigurationFileReader;
import br.com.uoutec.ediacaran.core.plugins.PluginParserException;
import br.com.uoutec.ediacaran.core.plugins.PluginsLoaderImp;
import br.com.uoutec.ediacaran.core.plugins.PluginsSearch;
import br.com.uoutec.ediacaran.core.plugins.PluginsSearch.PluginsSearchFilter;

public class PluginsLoaderMock extends PluginsLoaderImp {

	private Map<String, Map<String,String>> properties = new HashMap<>();
	
	private Set<PluginConfiguration> pluginConfiguration;

	private boolean loadAllPlugins;
	
	@Generated("SparkTools")
	private PluginsLoaderMock(Builder builder) {
		super(builder.pluginsSearch, builder.pluginConfigurationFileReader);
		super.setPluginConfigurationFileReader(builder.pluginConfigurationFileReader);
		this.pluginConfiguration = builder.pluginConfiguration;
		this.loadAllPlugins = builder.loadAllPlugins;
		this.properties = builder.properties;
	}

	@Override
	public List<PluginConfiguration> loadPlugins(Path basePath, VarParser vars) throws PluginParserException {
		Set<PluginConfiguration> p = new HashSet<>();
		
		if(loadAllPlugins) {
			p.addAll(super.loadPlugins(basePath, vars));
		}
		
		p.addAll(pluginConfiguration);
		
		overrideProperties(p);
		
		return new ArrayList<>(p);
	}

	@Override
	public List<PluginConfiguration> loadPlugins(Path basePath, VarParser vars, PluginsSearchFilter filter)
			throws PluginParserException {
		Set<PluginConfiguration> p = new HashSet<>();
		
		if(loadAllPlugins) {
			p.addAll(super.loadPlugins(basePath, vars, filter));
		}
		
		for(PluginConfiguration pc: pluginConfiguration) {
			if(filter.accept(pc.getMetadata().getPath())) {
				p.add(pc);
			}
		}
		
		overrideProperties(p);
		
		return new ArrayList<>(p);
	}
	
	private void overrideProperties(Set<PluginConfiguration> set) {
		for(PluginConfiguration pc: set) {
			Map<String,String> props = properties.get(pc.getMetadata().getCode());
			
			if(props != null) {
				for(Entry<String,String> prop: props.entrySet()) {
					if(prop.getValue() != null) {
						pc.setValue(prop.getKey(), prop.getValue());
					}
				}
				((MutablePluginConfiguration)pc).updateValues();
			}
		}
	}
	
	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	@Generated("SparkTools")
	public static final class Builder {
		private PluginConfigurationFileReader pluginConfigurationFileReader;
		private Set<PluginConfiguration> pluginConfiguration = new HashSet<>();
		private Set<PluginsSearch> pluginsSearch = new HashSet<>();
		private boolean loadAllPlugins;
		private Map<String, Map<String,String>> properties = new HashMap<>();
		
		private Builder() {
		}

		public Builder withPluginConfigurationFileReader(PluginConfigurationFileReader pluginConfigurationFileReader) {
			this.pluginConfigurationFileReader = pluginConfigurationFileReader;
			return this;
		}

		public Builder addPluginConfiguration(PluginConfiguration pluginConfiguration) {
			if(this.pluginConfiguration == null) {
				this.pluginConfiguration = new HashSet<>();
			}
			
			this.pluginConfiguration.add(pluginConfiguration);
			return this;
		}
		
		public Builder addPluginsSearch(PluginsSearch pluginsSearch) {
			if(this.pluginsSearch == null) {
				this.pluginsSearch = new HashSet<>();
			}
			
			this.pluginsSearch.add(pluginsSearch);
			return this;
		}

		public Builder withLoadAllPlugins(boolean loadAllPlugins) {
			this.loadAllPlugins = loadAllPlugins;
			return this;
		}

		public Builder withProperty(String code, String property, String value) {
			
			Map<String,String> props = properties.get(code);
			
			if(props == null) {
				props = new HashMap<>();
				properties.put(code, props);
			}
			
			if(property == null) {
				throw new NullPointerException("property");
			}
			
			props.put(property, value);
			
			return this;
		}
		public PluginsLoaderMock build() {
			return new PluginsLoaderMock(this);
		}
	}
	
}
