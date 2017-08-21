package cn.ileng.core.disruptor.sms;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.ileng.core.utils.sms.data.SmsResult;

/**
 *
 * All rights Reserved, Designed By www.ileng.cn
 *
 * @title: SmsDao.java
 * @package cn.ileng.core.disruptor.sms
 * @description: 短信dao
 * @author: ileng
 * @date: 2017年6月8日 上午8:42:47
 * @version V1.0
 * @copyright: 2017 www.ileng.cn Inc. All rights reserved.
 *
 */
public interface SmsDao {
	/**
	 *
	 * @title: doStart
	 * @description:初始化回调
	 * @return: void
	 */
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public void doStart();

	/**
	 *
	 * @title: doShutdown
	 * @description:关闭
	 * @return: void
	 */
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public void doShutdown();

	/**
	 *
	 * @title: doShutdown
	 * @description:发送短信
	 * @return: void
	 */
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public void doSend(String eventId, SmsData smsData);

	/**
	 *
	 * @title: doShutdown
	 * @description:响应
	 * @return: void
	 */
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public void doResult(String eventId, SmsData smsData, SmsResult smsResult);
}