package cn.ileng.core.disruptor.email;

import com.lmax.disruptor.EventFactory;

/**
 *
 * All rights Reserved, Designed By www.ileng.cn
 *
 * @title: LongEventFactory.java
 * @package cn.ileng.core.disruptor.sms
 * @description: 定义事件工厂
 * @author: ileng
 * @date: 2017年6月7日 下午11:18:32
 * @version V1.0
 * @copyright: 2017 www.ileng.cn Inc. All rights reserved.
 *
 */
public class EmailEventFactory implements EventFactory<EmailEvent> {
	public EmailEvent newInstance() {
		return new EmailEvent();
	}
}