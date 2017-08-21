package cn.ileng.modules.sys.service.impl;

import cn.ileng.core.common.service.impl.CommonServiceImpl;
import cn.ileng.modules.sys.entity.UserOrganization;
import cn.ileng.modules.sys.mapper.UserOrganizationMapper;
import cn.ileng.modules.sys.service.IUserOrganizationService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Service("userOrganizationService")
public class UserOrganizationServiceImpl extends CommonServiceImpl<UserOrganizationMapper, UserOrganization>
		implements IUserOrganizationService {

}
