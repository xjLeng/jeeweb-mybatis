package cn.ileng.modules.sys.service.impl;

import cn.ileng.core.common.service.impl.CommonServiceImpl;
import cn.ileng.modules.sys.entity.UserRole;
import cn.ileng.modules.sys.mapper.UserRoleMapper;
import cn.ileng.modules.sys.service.IUserRoleService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("userRoleService")
public class UserRoleServiceImpl extends CommonServiceImpl<UserRoleMapper,UserRole> implements IUserRoleService {

}
