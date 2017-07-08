package com.dmf.sms.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class SmsMessages {
    private BigDecimal id;

    private String content;

    private String sign;

    private String phone;

    private Date sendTime;

    private String sendMit;

    private Date respTime;

    private String respReport;

    private Integer status;

    private Date mdate;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public String getSendMit() {
        return sendMit;
    }

    public void setSendMit(String sendMit) {
        this.sendMit = sendMit == null ? null : sendMit.trim();
    }

    public Date getRespTime() {
        return respTime;
    }

    public void setRespTime(Date respTime) {
        this.respTime = respTime;
    }

    public String getRespReport() {
        return respReport;
    }

    public void setRespReport(String respReport) {
        this.respReport = respReport == null ? null : respReport.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getMdate() {
        return mdate;
    }

    public void setMdate(Date mdate) {
        this.mdate = mdate;
    }
}