package ${packageName}<#if moduleName?exists><#if moduleName!=''>.${moduleName}</#if></#if>.service;

import cn.ileng.core.common.service.ITreeCommonService;
import ${packageName}<#if moduleName?exists><#if moduleName!=''>.${moduleName}</#if></#if>.entity.${entityName?cap_first};

/**
 * @Title: ${functionName}
 * @Description: ${functionDesc}
 * @author ${functionAuthor}
 * @date ${time}
 * @version V1.0
 *
 */
public interface I${entityName?cap_first}Service extends ITreeCommonService<${entityName?cap_first},String>{

}

