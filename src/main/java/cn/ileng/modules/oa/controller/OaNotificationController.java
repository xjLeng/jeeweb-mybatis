package cn.ileng.modules.oa.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.ileng.core.common.controller.BaseCRUDController;
import cn.ileng.core.security.shiro.authz.annotation.RequiresPathPermission;
import cn.ileng.modules.oa.entity.OaNotification;

/**
 * @Title: 通知公告
 * @Description: 通知公告
 * @author ileng
 * @date 2017-06-10 17:15:17
 * @version V1.0
 *
 */
@Controller
@RequestMapping("${admin.url.prefix}/oa/oanotification")
@RequiresPathPermission("oa:oanotification")
public class OaNotificationController extends BaseCRUDController<OaNotification, String> {

}
