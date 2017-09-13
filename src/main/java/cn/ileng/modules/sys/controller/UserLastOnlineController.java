package cn.ileng.modules.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.ileng.core.common.controller.BaseCRUDController;
import cn.ileng.core.security.shiro.authz.annotation.RequiresPathPermission;
import cn.ileng.modules.sys.entity.UserLastOnline;

/**
 * @author ileng
 * @version V1.0
 * @Title: 最后在线情况
 * @Description: 最后在线情况
 * @date 2017-05-15 08:18:21
 */
@Controller
@RequestMapping("${admin.url.prefix}/sys/lastOnline")
@RequiresPathPermission("sys:userlastonline")
public class UserLastOnlineController extends BaseCRUDController<UserLastOnline, Long> {

}
