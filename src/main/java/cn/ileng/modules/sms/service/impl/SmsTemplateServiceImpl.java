package cn.ileng.modules.sms.service.impl;

import cn.ileng.core.common.service.impl.CommonServiceImpl;
import cn.ileng.modules.sms.mapper.SmsTemplateMapper;
import cn.ileng.modules.sms.entity.SmsTemplate;
import cn.ileng.modules.sms.service.ISmsTemplateService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Title: 短信模版
 * @Description: 短信模版
 * @author xuejian
 * @date 2017-08-23 09:42:23
 * @version V1.0
 *
 */
@Transactional
@Service("smsTemplateService")
public class SmsTemplateServiceImpl  extends CommonServiceImpl<SmsTemplateMapper,SmsTemplate> implements  ISmsTemplateService {

}
