package com.dmf.sms.dto;

/**
 * 短信发送请求参数
 * @ClassName: SmsSendRequest
 * @Description: TODO
 * @author: dmf
 * @date: 2017年7月8日 下午12:15:14
 */
public class SmsSendRequest {
	/** 手机号 **/
	private String phoneNumbers;
	/** 签名 **/
	private String signName;
	/** 短信内容 **/
	private String content;
	/** 外部流水号 **/
	private String outId;

	public String getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(String phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	public String getSignName() {
		return signName;
	}
	public void setSignName(String signName) {
		this.signName = signName;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getOutId() {
		return outId;
	}
	public void setOutId(String outId) {
		this.outId = outId;
	}
}
