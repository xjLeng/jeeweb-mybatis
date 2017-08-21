package cn.ileng.modules.sys.service.impl;

import cn.ileng.core.common.service.impl.CommonServiceImpl;
import cn.ileng.modules.sys.entity.Role;
import cn.ileng.modules.sys.mapper.RoleMapper;
import cn.ileng.modules.sys.service.IRoleService;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("roleService")
public class RoleServiceImpl extends CommonServiceImpl<RoleMapper, Role> implements IRoleService {

	@Override
	public List<Role> findListByUserId(String userid) {
		return baseMapper.findRoleByUserId(userid);
	}

}
