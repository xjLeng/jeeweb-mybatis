package cn.ileng.modules.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.ileng.core.common.controller.BaseTreeController;
import cn.ileng.core.security.shiro.authz.annotation.RequiresPathPermission;
import cn.ileng.modules.sys.entity.Organization;

@Controller
@RequestMapping("${admin.url.prefix}/sys/organization")
@RequiresPathPermission("sys:organization")
public class OrganizationController extends BaseTreeController<Organization, String> {

}
