package com.globlehi.talking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author Philemon Globlehi <philemon.globlehi@gmail.com>
 */
@Service
public class SmsSenderService {
    private final TwilioSmsSender twilioSmsSender;

    @Autowired
    public SmsSenderService(@Qualifier("twilio") TwilioSmsSender twilioSmsSender) {
        this.twilioSmsSender = twilioSmsSender;
    }

    public void sendSms(SmsRequest smsRequest) {
        twilioSmsSender.sendSms(smsRequest);
    }
}
