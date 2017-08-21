package cn.ileng.modules.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.ileng.core.common.controller.BaseTreeController;
import cn.ileng.core.security.shiro.authz.annotation.RequiresPathPermission;
import cn.ileng.modules.sys.entity.Menu;

@Controller
@RequestMapping("${admin.url.prefix}/sys/menu")
@RequiresPathPermission("sys:menu")
public class MenuController extends BaseTreeController<Menu, String> {

}
