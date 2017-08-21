package cn.ileng.modules.sys.service.impl;

import cn.ileng.core.common.service.impl.CommonServiceImpl;
import cn.ileng.modules.sys.entity.RoleMenu;
import cn.ileng.modules.sys.mapper.RoleMenuMapper;
import cn.ileng.modules.sys.service.IRoleMenuService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("roleMenuService")
public class RoleMenuServiceImpl extends CommonServiceImpl<RoleMenuMapper,RoleMenu> implements IRoleMenuService {

}
