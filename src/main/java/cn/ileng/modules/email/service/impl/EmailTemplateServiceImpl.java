package cn.ileng.modules.email.service.impl;

import cn.ileng.core.common.service.impl.CommonServiceImpl;
import cn.ileng.modules.email.mapper.EmailTemplateMapper;
import cn.ileng.modules.email.entity.EmailTemplate;
import cn.ileng.modules.email.service.IEmailTemplateService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Title: 邮件发送模板
 * @Description: 邮件发送模板
 * @author xuejian
 * @date 2017-08-16 11:25:44
 * @version V1.0
 *
 */
@Transactional
@Service("emailTemplateService")
public class EmailTemplateServiceImpl  extends CommonServiceImpl<EmailTemplateMapper,EmailTemplate> implements  IEmailTemplateService {

}
