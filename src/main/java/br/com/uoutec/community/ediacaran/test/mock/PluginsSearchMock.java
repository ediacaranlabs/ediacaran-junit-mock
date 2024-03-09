package br.com.uoutec.community.ediacaran.test.mock;

import java.util.List;

import br.com.uoutec.application.io.Path;
import br.com.uoutec.ediacaran.core.plugins.PluginException;
import br.com.uoutec.ediacaran.core.plugins.PluginPath;
import br.com.uoutec.ediacaran.core.plugins.PluginsSearch;

public class PluginsSearchMock implements PluginsSearch{


	@Override
	public List<PluginPath> getPlugins(Path basePath) throws PluginException {
		return null;
	}

	@Override
	public List<PluginPath> getPlugins(Path basePath, PluginsSearchFilter filter) throws PluginException {
		return null;
	}

}
