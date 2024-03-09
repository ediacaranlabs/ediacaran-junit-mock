package br.com.uoutec.community.ediacaran.test.mock;

@SuppressWarnings("unused")
public class TomcatServerBootstrapBuilder {
/*
	private ExecutorService pluginExecutorService;
	
	private PluginManagerData pluginManagerData;
	
	private SecurityPolicyManager securityPolicyManager;
	
	private PluginConfigurationFileReader pluginConfigurationFileReader;
	
	private PluginConfigurationFileWriter pluginConfigurationFileWriter;
	
	private PluginsSuppliersFactory pluginsSuppliersFactory;
	
	private VarParserConfiguration varParser;
	
	private EdiacaranListenerManager listenerManager;

	private PluginInitializer pluginInitializer;
	
	private ExportImportPlugins exportImportPlugins;
	
	private PluginClassLoaderFactory pluginClassLoaderFactory;
	
	private ClassLoader parentClassLoader;
	
	private PluginInstaller pluginInstaller;
	
	private PluginManager pluginManager;

	private PluginsLoader pluginLoader;

	private Map<Object, Class<?>[]> entities;
	
	private Set<Resource> resources;
	
	private Set<EdiacaranEventListener> ediacaranEventListener;
	
	private Set<PluginsSearch> pluginsSearch;
	
	@Generated("SparkTools")
	private TomcatServerBootstrapBuilder(Builder builder) {
		this.pluginExecutorService = builder.pluginExecutorService;
		this.pluginManagerData = builder.pluginManagerData;
		this.securityPolicyManager = builder.securityPolicyManager;
		this.pluginConfigurationFileReader = builder.pluginConfigurationFileReader;
		this.pluginConfigurationFileWriter = builder.pluginConfigurationFileWriter;
		this.pluginsSuppliersFactory = builder.pluginsSuppliersFactory;
		this.varParser = builder.varParser;
		this.listenerManager = builder.listenerManager;
		this.pluginInitializer = builder.pluginInitializer;
		this.exportImportPlugins = builder.exportImportPlugins;
		this.pluginClassLoaderFactory = builder.pluginClassLoaderFactory;
		this.parentClassLoader = builder.parentClassLoader;
		this.pluginInstaller = builder.pluginInstaller;
		this.pluginManager = builder.pluginManager;
		this.pluginLoader = builder.pluginLoader;
		this.entities = builder.entities;
		this.resources = builder.resources;
		this.ediacaranEventListener = builder.ediacaranEventListener;
		this.pluginsSearch = builder.pluginsSearch;
	}
	
	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	@Generated("SparkTools")
	public static final class Builder {
		private ExecutorService pluginExecutorService;
		private PluginManagerData pluginManagerData;
		private SecurityPolicyManager securityPolicyManager;
		private PluginConfigurationFileReader pluginConfigurationFileReader;
		private PluginConfigurationFileWriter pluginConfigurationFileWriter;
		private PluginsSuppliersFactory pluginsSuppliersFactory;
		private VarParserConfiguration varParser;
		private EdiacaranListenerManager listenerManager;
		private PluginInitializer pluginInitializer;
		private ExportImportPlugins exportImportPlugins;
		private PluginClassLoaderFactory pluginClassLoaderFactory;
		private ClassLoader parentClassLoader;
		private PluginInstaller pluginInstaller;
		private PluginManager pluginManager;
		private PluginsLoader pluginLoader;
		private Map<Object, Class<?>[]> entities;
		private Set<Resource> resources;
		private Set<EdiacaranEventListener> ediacaranEventListener;
		private Set<PluginsSearch> pluginsSearch;
		
		private Builder() {
		}

		public Builder withPluginExecutorService(ExecutorService pluginExecutorService) {
			this.pluginExecutorService = pluginExecutorService;
			return this;
		}

		public Builder withPluginManagerData(PluginManagerData pluginManagerData) {
			this.pluginManagerData = pluginManagerData;
			return this;
		}

		public Builder withSecurityPolicyManager(SecurityPolicyManager securityPolicyManager) {
			this.securityPolicyManager = securityPolicyManager;
			return this;
		}

		public Builder withPluginConfigurationFileReader(PluginConfigurationFileReader pluginConfigurationFileReader) {
			this.pluginConfigurationFileReader = pluginConfigurationFileReader;
			return this;
		}

		public Builder withPluginConfigurationFileWriter(PluginConfigurationFileWriter pluginConfigurationFileWriter) {
			this.pluginConfigurationFileWriter = pluginConfigurationFileWriter;
			return this;
		}

		public Builder withPluginsSuppliersFactory(PluginsSuppliersFactory pluginsSuppliersFactory) {
			this.pluginsSuppliersFactory = pluginsSuppliersFactory;
			return this;
		}

		public Builder withVarParser(VarParserConfiguration varParser) {
			this.varParser = varParser;
			return this;
		}

		public Builder withListenerManager(EdiacaranListenerManager listenerManager) {
			this.listenerManager = listenerManager;
			return this;
		}

		public Builder withPluginInitializer(PluginInitializer pluginInitializer) {
			this.pluginInitializer = pluginInitializer;
			return this;
		}

		public Builder withExportImportPlugins(ExportImportPlugins exportImportPlugins) {
			this.exportImportPlugins = exportImportPlugins;
			return this;
		}

		public Builder withPluginClassLoaderFactory(PluginClassLoaderFactory pluginClassLoaderFactory) {
			this.pluginClassLoaderFactory = pluginClassLoaderFactory;
			return this;
		}

		public Builder withParentClassLoader(ClassLoader parentClassLoader) {
			this.parentClassLoader = parentClassLoader;
			return this;
		}

		public Builder withPluginInstaller(PluginInstaller pluginInstaller) {
			this.pluginInstaller = pluginInstaller;
			return this;
		}

		public Builder withPluginManager(PluginManager pluginManager) {
			this.pluginManager = pluginManager;
			return this;
		}

		public Builder withPluginLoader(PluginsLoader pluginLoader) {
			this.pluginLoader = pluginLoader;
			return this;
		}

		public Builder addEntity(Object value, Class<?> ... types) {
			if(this.entities == null) {
				this.entities = new HashMap<>();
			}
			
			this.entities.put(value, types);
			
			return this;
		}

		public Builder addResource(Resource value) {
			if(this.resources == null) {
				this.resources = new HashSet<>();
			}
			this.resources.add(value);
			return this;
		}

		public Builder addListener(EdiacaranEventListener e) {
			if(this.ediacaranEventListener == null) {
				this.ediacaranEventListener = new HashSet<>();
			}
			this.ediacaranEventListener.add(e);
			
			return this;
		}

		public Builder addPluginSearch(PluginsSearch e) {
			
			if(this.pluginsSearch == null) {
				this.pluginsSearch =new HashSet<>();
			}
			
			return this;
		}

		public EdiacaranBootstrap build() {
			
			TomcatServerBootstrap pm = new TomcatServerBootstrap();
			
			pm.setExportImportPlugins(exportImportPlugins);
			pm.setListenerManager(listenerManager);
			pm.setParentClassLoader(parentClassLoader);
			pm.setPluginClassLoaderFactory(pluginClassLoaderFactory);
			pm.setPluginConfigurationFileReader(pluginConfigurationFileReader);
			pm.setPluginConfigurationFileWriter(pluginConfigurationFileWriter);
			pm.setPluginExecutorService(pluginExecutorService);
			pm.setPluginInitializer(pluginInitializer);
			pm.setPluginInstaller(pluginInstaller);
			pm.setPluginInstaller(pluginInstaller);
			pm.setPluginManager(pluginManager);
			pm.setPluginManagerData(pluginManagerData);
			pm.setPluginsLoader(pluginLoader);
			pm.setPluginsSuppliersFactory(pluginsSuppliersFactory);
			pm.setSecurityPolicyManager(securityPolicyManager);
			pm.setVarParser(varParser);
			
			if(entities != null) {
				for(Entry<Object, Class<?>[]> e: entities.entrySet()) {
					pm.addEntity(e.getKey(), e.getValue());
				}
			}
			
			if(resources != null) {
				for(Resource e: resources) {
					pm.addResource(e);
				}
			}
			
			if(ediacaranEventListener != null) {
				for(EdiacaranEventListener e: ediacaranEventListener) {
					pm.addListener(e);
				}
			}
			else {
				pm.addListener(new TomcatRegisterContainerEventListener());
				pm.addListener(new TomcatContextListener());
				pm.addListener(new ActiveRequestContextBridgeListener());
				pm.addListener(new ActiveSessionContextBridgeListener());
			}
			
			if(pluginsSearch != null) {
				for(PluginsSearch e: pluginsSearch) {
					pm.addPluginSearch(e);
				}
			}
			
			return pm;
		}
		
	}
*/
}
