package com.dmf.sms.service;

import javax.jms.Destination;

/**
 * 短信服务层
 * @ClassName: SmsService
 * @Description: TODO
 * @author: dmf
 * @date: 2017年7月8日 上午11:46:43
 */
public interface SmsService {
	/**
	 * 短信放入生产者队列
	 * @Title: sendMessage
	 * @Description: TODO
	 * @param destination
	 * @param message
	 * @return: void
	 */
	public void sendMessage(Destination destination, final String message);
}
