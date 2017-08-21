package cn.ileng.modules.codegen.codegenerator.utils;

import cn.ileng.core.mapper.JaxbMapper;
import cn.ileng.modules.codegen.codegenerator.xml.definition.Definition;

public class DefinitionUtils {
	public static DefinitionUtils definitionUtils = null;
	public Definition definition = null;

	public static DefinitionUtils getDefinitionUtils() {
		if (definitionUtils == null) {
			definitionUtils = new DefinitionUtils();
		}
		return definitionUtils;
	}

	public Definition getDefinition() {
		return definition;
	}

	public DefinitionUtils() {
		String dbType = CodeGenUtils.getDbType().toLowerCase();
		definition = JaxbMapper.fromLocation("codegen/mapper/" + dbType + "_definition.xml", Definition.class);
	}
}
