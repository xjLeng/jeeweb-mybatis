package cn.ileng.modules.sys.service;

import java.util.List;

import cn.ileng.core.common.service.ITreeCommonService;
import cn.ileng.modules.sys.entity.Organization;

/**
 * @Title:
 * @Description:
 * @author jwcg
 * @date 2014-12-20 21:33:51
 * @version V1.0
 *
 */
public interface IOrganizationService extends ITreeCommonService<Organization, String> {
	/**
	 * 通过用户ID查找角色
	 */
	public List<Organization> findListByUserId(String userid);
}
