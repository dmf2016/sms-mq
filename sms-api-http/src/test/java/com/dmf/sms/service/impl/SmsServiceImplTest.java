package com.dmf.sms.service.impl;

import static org.junit.Assert.*;

import javax.jms.Destination;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dmf.sms.service.SmsService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring/application-activemq.xml")
public class SmsServiceImplTest {
	@Autowired
	private SmsService smsService;
	@Autowired
	@Qualifier("queueDestination")
	private Destination destination;

	@Test
	public void testSendMessage() {
		for (int i = 0; i < 2; i++) {
			smsService.sendMessage(destination, "你好，生产者！这是消息：" + (i + 1));
		}
	}
}
