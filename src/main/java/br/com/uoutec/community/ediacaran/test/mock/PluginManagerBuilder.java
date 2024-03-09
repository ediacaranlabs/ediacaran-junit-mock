package br.com.uoutec.community.ediacaran.test.mock;

import java.util.concurrent.ExecutorService;

import br.com.uoutec.application.io.Path;
import br.com.uoutec.ediacaran.core.PluginManager;
import br.com.uoutec.ediacaran.core.PluginManagerData;
import br.com.uoutec.ediacaran.core.PluginManagerImp;
import br.com.uoutec.ediacaran.core.SecurityPolicyManager;
import br.com.uoutec.ediacaran.core.VarParserConfiguration;
import br.com.uoutec.ediacaran.core.plugins.PluginConfigurationFileWriter;
import br.com.uoutec.ediacaran.core.plugins.PluginInitializer;
import br.com.uoutec.ediacaran.core.plugins.PluginInstaller;
import br.com.uoutec.ediacaran.core.plugins.PluginsLoader;
import javax.annotation.Generated;

@SuppressWarnings("unused")
public class PluginManagerBuilder {

	private Class<? extends PluginManager> pluginManagerType;
	
	private ExecutorService executorService;
	
	private PluginManagerData pluginManagerData;

	private Long time;
	
	private PluginInitializer pluginInitializer;

	private SecurityPolicyManager securityPolicyManager;
	
	private PluginsLoader pluginsLoader;
	
	private PluginConfigurationFileWriter pluginConfigurationFileWriter;
	
	private PluginInstaller pluginInstaller;
	
	private Path basePath;
	
	private VarParserConfiguration varParser;

	@Generated("SparkTools")
	private PluginManagerBuilder(Builder builder) {
		this.pluginManagerType = builder.pluginManagerType;
		this.executorService = builder.executorService;
		this.pluginManagerData = builder.pluginManagerData;
		this.time = builder.time;
		this.pluginInitializer = builder.pluginInitializer;
		this.securityPolicyManager = builder.securityPolicyManager;
		this.pluginsLoader = builder.pluginsLoader;
		this.pluginConfigurationFileWriter = builder.pluginConfigurationFileWriter;
		this.pluginInstaller = builder.pluginInstaller;
		this.basePath = builder.basePath;
		this.varParser = builder.varParser;
	}

	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	@Generated("SparkTools")
	public static final class Builder {
		private Class<? extends PluginManager> pluginManagerType;
		private ExecutorService executorService;
		private PluginManagerData pluginManagerData;
		private Long time;
		private PluginInitializer pluginInitializer;
		private SecurityPolicyManager securityPolicyManager;
		private PluginsLoader pluginsLoader;
		private PluginConfigurationFileWriter pluginConfigurationFileWriter;
		private PluginInstaller pluginInstaller;
		private Path basePath;
		private VarParserConfiguration varParser;

		private Builder() {
		}

		public Builder withPluginManagerType(Class<? extends PluginManager> pluginManagerType) {
			this.pluginManagerType = pluginManagerType;
			return this;
		}

		public Builder withExecutorService(ExecutorService executorService) {
			this.executorService = executorService;
			return this;
		}

		public Builder withPluginManagerData(PluginManagerData pluginManagerData) {
			this.pluginManagerData = pluginManagerData;
			return this;
		}

		public Builder withTime(Long time) {
			this.time = time;
			return this;
		}

		public Builder withPluginInitializer(PluginInitializer pluginInitializer) {
			this.pluginInitializer = pluginInitializer;
			return this;
		}

		public Builder withSecurityPolicyManager(SecurityPolicyManager securityPolicyManager) {
			this.securityPolicyManager = securityPolicyManager;
			return this;
		}

		public Builder withPluginsLoader(PluginsLoader pluginsLoader) {
			this.pluginsLoader = pluginsLoader;
			return this;
		}

		public Builder withPluginConfigurationFileWriter(PluginConfigurationFileWriter pluginConfigurationFileWriter) {
			this.pluginConfigurationFileWriter = pluginConfigurationFileWriter;
			return this;
		}

		public Builder withPluginInstaller(PluginInstaller pluginInstaller) {
			this.pluginInstaller = pluginInstaller;
			return this;
		}

		public Builder withBasePath(Path basePath) {
			this.basePath = basePath;
			return this;
		}

		public Builder withVarParser(VarParserConfiguration varParser) {
			this.varParser = varParser;
			return this;
		}

		public PluginManager build() {
			
			PluginManager pm = getInstance();
			
			pm.setBasePath(this.basePath);
			pm.setExecutorService(this.executorService);
			pm.setPluginConfigurationFileWriter(this.pluginConfigurationFileWriter);
			pm.setPluginInitializer(this.pluginInitializer);
			pm.setPluginManagerData(this.pluginManagerData);
			pm.setPluginsLoader(this.pluginsLoader);
			pm.setSecurityPolicyManager(this.securityPolicyManager);
			pm.setUpdateFrequency(this.time);
			pm.setVarParser(this.varParser);
			return pm;
		}
		
		private PluginManager getInstance() {
			try {
				if(this.pluginManagerType == null) {
					return new PluginManagerImp();
				}
				else {
					return this.pluginManagerType.getConstructor().newInstance();
				}
			}
			catch(Throwable ex) {
				throw new RuntimeException(ex);
			}
		}
		
	}
	

}
