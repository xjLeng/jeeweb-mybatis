package cn.ileng.modules.sms.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.ileng.core.common.controller.BaseCRUDController;
import cn.ileng.core.security.shiro.authz.annotation.RequiresPathPermission;
import cn.ileng.modules.sms.entity.SmsTemplate;

/**
 * @Title: 短信模版
 * @Description: 短信模版
 * @author xuejian
 * @date 2017-08-23 09:42:23
 * @version V1.0
 *
 */
@Controller
@RequestMapping("${admin.url.prefix}/sms/smstemplate")
@RequiresPathPermission("sms:smstemplate")
public class SmsTemplateController extends BaseCRUDController<SmsTemplate, String> {

}
