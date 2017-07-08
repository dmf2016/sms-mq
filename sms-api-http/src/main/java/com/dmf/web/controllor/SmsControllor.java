package com.dmf.web.controllor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dmf.sms.service.SmsService;

import common.pojo.TaotaoResult;

/**
 * 短信接口
 * @ClassName: SmsControllor
 * @Description: TODO
 * @author: dmf
 * @date: 2017年7月8日 上午11:31:37
 */
@Controller
@RequestMapping("/sms")
public class SmsControllor {
	@Autowired
	private SmsService smsService;

	@RequestMapping("/content/{contentCid}")
	@ResponseBody
	public TaotaoResult contentCacheSync(@PathVariable Long contentCid) {
		// TaotaoResult result = redisService.syncContent(contentCid);
		// return result;
		return null;
	}
}
