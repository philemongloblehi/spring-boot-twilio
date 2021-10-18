package com.globlehi.talking.controller;

import com.globlehi.talking.service.SmsRequest;
import com.globlehi.talking.service.SmsSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author Philemon Globlehi <philemon.globlehi@gmail.com>
 */
@RestController
@RequestMapping("api/v1/sms")
public class SmsSenderController {
    private final SmsSenderService smsSenderService;

    @Autowired
    public SmsSenderController(SmsSenderService smsSenderService) {
        this.smsSenderService = smsSenderService;
    }

    @PostMapping
    public void sendSms(@Valid @RequestBody SmsRequest smsRequest) {
        smsSenderService.sendSms(smsRequest);
    }
}
