package cn.ileng.modules.sms.service.impl;

import cn.ileng.core.disruptor.sms.SmsEvent.SmsHandlerCallBack;
import cn.ileng.core.disruptor.sms.SmsHelper;
import cn.ileng.core.utils.SpringContextHolder;
import cn.ileng.core.utils.sms.data.SmsResult;
import cn.ileng.modules.sms.entity.SmsTemplate;
import cn.ileng.modules.sms.service.ISmsSendService;
import cn.ileng.modules.sms.service.ISmsTemplateService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.mapper.EntityWrapper;

/**
 * @Title: 短信模版
 * @Description: 短信模版
 * @author ileng
 * @date 2017-06-08 10:50:52
 * @version V1.0
 *
 */
@Transactional
@Service("smsSendService")
public class SmsSendServiceImpl implements ISmsSendService {
	@Autowired
	private ISmsTemplateService smsTemplateService;

	@Override
	public void sendAsyncSmsByCode(String phone, String code, String... datas) {
		sendAsyncSmsByCode(phone, code, null, datas);
	}

	@Override
	public void sendAsyncSmsByCode(String phone, String code, SmsHandlerCallBack callBack, String... datas) {
		SmsTemplate smsTemplate = smsTemplateService.selectOne(new EntityWrapper<SmsTemplate>().eq("code", code));
		String templateContent = smsTemplate.getTemplateContent();
		String templateId = smsTemplate.getTemplateId();
		cn.ileng.core.utils.sms.data.SmsTemplate template = cn.ileng.core.utils.sms.data.SmsTemplate.newTemplate(templateId, templateContent);
		SpringContextHolder.getBean(SmsHelper.class).sendAsyncSms(phone, template, callBack, datas);
	}

	@Override
	public SmsResult sendSyncSmsByCode(String phone, String code, String... datas) {
		SmsTemplate smsTemplate = smsTemplateService.selectOne(new EntityWrapper<SmsTemplate>().eq("code", code));
		String templateContent = smsTemplate.getTemplateContent();
		String templateId = smsTemplate.getTemplateId();
		cn.ileng.core.utils.sms.data.SmsTemplate template = cn.ileng.core.utils.sms.data.SmsTemplate.newTemplate(templateId, templateContent);
		return SpringContextHolder.getBean(SmsHelper.class).sendSyncSms(phone, template, datas);
	}

	@Override
	public void sendAsyncSmsByContent(String phone, String content, String... datas) {
		sendAsyncSmsByContent(phone, content, null, datas);
	}

	@Override
	public void sendAsyncSmsByContent(String phone, String content, SmsHandlerCallBack callBack, String... datas) {
		cn.ileng.core.utils.sms.data.SmsTemplate template = cn.ileng.core.utils.sms.data.SmsTemplate.newTemplateByContent(content);
		SpringContextHolder.getBean(SmsHelper.class).sendAsyncSms(phone, template, callBack, datas);
	}

	@Override
	public SmsResult sendSyncSmsByContent(String phone, String content, String... datas) {
		cn.ileng.core.utils.sms.data.SmsTemplate template = cn.ileng.core.utils.sms.data.SmsTemplate.newTemplateByContent(content);
		return SpringContextHolder.getBean(SmsHelper.class).sendSyncSms(phone, template, datas);
	}

}
