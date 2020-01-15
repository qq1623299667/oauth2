package com.example.oauth2core.validate.core.sms;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DefaultSmsCodeSender implements SmsCodeSender {
    @Override
    public void send(String mobile, String code) {
        log.info("向手机: {} 发送短信验证码: {} ",mobile,code);
    }
}
