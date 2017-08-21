package cn.ileng.modules.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.ileng.core.common.controller.BaseCRUDController;
import cn.ileng.core.security.shiro.authz.annotation.RequiresPathPermission;
import cn.ileng.modules.sys.entity.Log;

/**
 *
 * All rights Reserved, Designed By www.ileng.cn
 *
 * @title: 系统日志
 * @package cn.ileng.modules.sys.controller
 * @description: 系统日志
 * @author: ileng
 * @date: 2017年5月29日 下午11:35:26
 * @version V1.0
 * @copyright: 2017 www.ileng.cn Inc. All rights reserved.
 *
 */
@Controller
@RequestMapping("${admin.url.prefix}/sys/log")
@RequiresPathPermission("sys:log")
public class LogController extends BaseCRUDController<Log, String> {

}
