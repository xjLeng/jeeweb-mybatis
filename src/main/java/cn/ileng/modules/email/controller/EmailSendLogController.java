package cn.ileng.modules.email.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.ileng.core.common.controller.BaseCRUDController;
import cn.ileng.core.security.shiro.authz.annotation.RequiresPathPermission;
import cn.ileng.modules.email.entity.EmailSendLog;

/**
 * @Title: 邮件发送日志
 * @Description: 邮件发送日志
 * @author ileng
 * @date 2017-06-10 07:46:06
 * @version V1.0
 *
 */
@Controller
@RequestMapping("${admin.url.prefix}/email/emailsendlog")
@RequiresPathPermission("email:emailsendlog")
public class EmailSendLogController extends BaseCRUDController<EmailSendLog, String> {

}
