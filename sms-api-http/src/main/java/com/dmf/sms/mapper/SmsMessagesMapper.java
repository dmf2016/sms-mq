package com.dmf.sms.mapper;

import com.dmf.sms.pojo.SmsMessages;
import com.dmf.sms.pojo.SmsMessagesExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsMessagesMapper {
    int countByExample(SmsMessagesExample example);

    int deleteByExample(SmsMessagesExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(SmsMessages record);

    int insertSelective(SmsMessages record);

    List<SmsMessages> selectByExample(SmsMessagesExample example);

    SmsMessages selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") SmsMessages record, @Param("example") SmsMessagesExample example);

    int updateByExample(@Param("record") SmsMessages record, @Param("example") SmsMessagesExample example);

    int updateByPrimaryKeySelective(SmsMessages record);

    int updateByPrimaryKey(SmsMessages record);
}