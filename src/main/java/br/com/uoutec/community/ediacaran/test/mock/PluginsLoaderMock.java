package br.com.uoutec.community.ediacaran.test.mock;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Generated;

import br.com.uoutec.application.io.Path;
import br.com.uoutec.ediacaran.core.VarParser;
import br.com.uoutec.ediacaran.core.plugins.PluginConfiguration;
import br.com.uoutec.ediacaran.core.plugins.PluginConfigurationFileReader;
import br.com.uoutec.ediacaran.core.plugins.PluginParserException;
import br.com.uoutec.ediacaran.core.plugins.PluginsLoader;
import br.com.uoutec.ediacaran.core.plugins.PluginsSearch;
import br.com.uoutec.ediacaran.core.plugins.PluginsSearch.PluginsSearchFilter;

public class PluginsLoaderMock implements PluginsLoader {

	private PluginConfigurationFileReader pluginConfigurationFileReader;

	private Set<PluginConfiguration> pluginConfiguration;
	
	private Set<PluginsSearch> pluginsSearch;

	@Generated("SparkTools")
	private PluginsLoaderMock(Builder builder) {
		this.pluginConfigurationFileReader = builder.pluginConfigurationFileReader;
		this.pluginConfiguration = builder.pluginConfiguration;
		this.pluginsSearch = builder.pluginsSearch;
	}

	@Override
	public PluginConfigurationFileReader getPluginConfigurationFileReader() {
		return pluginConfigurationFileReader;
	}

	@Override
	public void setPluginConfigurationFileReader(PluginConfigurationFileReader pluginConfigurationFileReader) {
		this.pluginConfigurationFileReader = pluginConfigurationFileReader;
	}

	@Override
	public void add(PluginsSearch ps) {
	}

	@Override
	public void remove(PluginsSearch ps) {
	}

	@Override
	public void clear() {
	}

	@Override
	public PluginsSearch[] getPluginsSearch() {
		return pluginsSearch.stream().toArray(PluginsSearch[]::new);
	}

	@Override
	public List<PluginConfiguration> loadPlugins(Path basePath, VarParser vars) throws PluginParserException {
		return new ArrayList<>(pluginConfiguration);
	}

	@Override
	public List<PluginConfiguration> loadPlugins(Path basePath, VarParser vars, PluginsSearchFilter filter)
			throws PluginParserException {
		return new ArrayList<>(pluginConfiguration);
	}
	
	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	@Generated("SparkTools")
	public static final class Builder {
		private PluginConfigurationFileReader pluginConfigurationFileReader;
		private Set<PluginConfiguration> pluginConfiguration;
		private Set<PluginsSearch> pluginsSearch;

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

		public PluginsLoaderMock build() {
			return new PluginsLoaderMock(this);
		}
	}
	
}
