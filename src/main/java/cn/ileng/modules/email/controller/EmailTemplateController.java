package cn.ileng.modules.email.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.ileng.core.common.controller.BaseCRUDController;
import cn.ileng.core.security.shiro.authz.annotation.RequiresPathPermission;
import cn.ileng.modules.email.entity.EmailTemplate;

/**
 * @Title: 邮件发送模板
 * @Description: 邮件发送模板
 * @author xuejian
 * @date 2017-08-16 11:25:44
 * @version V1.0
 *
 */
@Controller
@RequestMapping("${admin.url.prefix}/email/emailtemplate")
@RequiresPathPermission("email:emailtemplate")
public class EmailTemplateController extends BaseCRUDController<EmailTemplate, String> {

}
