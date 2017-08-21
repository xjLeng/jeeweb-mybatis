package cn.ileng.core.disruptor.sms;

import com.lmax.disruptor.WorkHandler;

import cn.ileng.core.utils.sms.data.SmsResult;
import cn.ileng.core.utils.sms.sender.SmsSender;

/**
 *
 * All rights Reserved, Designed By www.ileng.cn
 *
 * @title: SmsHandler.java
 * @package cn.ileng.core.disruptor.sms
 * @description: 内容消费者
 * @author: ileng
 * @date: 2017年6月7日 下午11:20:32
 * @version V1.0
 * @copyright: 2017 www.ileng.cn Inc. All rights reserved.
 *
 */
public class SmsHandler implements WorkHandler<SmsEvent> {
	private SmsSender smsSender;
	private SmsDao smsDao;

	public SmsHandler(SmsSender smsSender, SmsDao smsDao) {
		this.smsSender = smsSender;
		this.smsDao = smsDao;
	}

	@Override
	public void onEvent(SmsEvent event) throws Exception {
		SmsResult smsResult = smsSender.send(event.getSmsData().getPhone(), event.getSmsData().getSmsTemplate(),
				event.getSmsData().getDatas());
		if (event.getHandlerCallBack() != null) {
			event.getHandlerCallBack().onResult(smsResult);
		}

		if (smsDao != null) {
			smsDao.doResult(event.getId(), event.getSmsData(), smsResult);
		}
	}

}