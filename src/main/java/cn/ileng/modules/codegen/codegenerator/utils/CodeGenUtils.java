package cn.ileng.modules.codegen.codegenerator.utils;

import cn.ileng.core.utils.PropertiesUtil;

public class CodeGenUtils {

	public static String getDbType() {
		PropertiesUtil propertiesUtil = new PropertiesUtil("dbconfig.properties");
		String dbType = propertiesUtil.getString("connection.dbType");
		return dbType.toLowerCase();
	}
}
