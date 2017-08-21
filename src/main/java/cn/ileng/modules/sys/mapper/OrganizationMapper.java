package cn.ileng.modules.sys.mapper;

import java.util.List;

import cn.ileng.core.common.mapper.BaseTreeMapper;
import cn.ileng.modules.sys.entity.Organization;

public interface OrganizationMapper extends BaseTreeMapper<Organization> {

	/**
	 *
	 * @title: findListByUserId
	 * @description: 通过用户查找组织机构
	 * @param userId
	 * @return
	 * @return: List<Organization>
	 */
	List<Organization> findListByUserId(String userId);
}