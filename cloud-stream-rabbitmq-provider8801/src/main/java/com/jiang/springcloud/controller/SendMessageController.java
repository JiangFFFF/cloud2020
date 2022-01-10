package com.jiang.springcloud.controller;

import com.jiang.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author jiang
 * @create 2022-01-04-10:08 下午
 */
@RestController
public class SendMessageController {

    @Resource
    private IMessageProvider messageProvider;

    @GetMapping(value="/sendMessage")
    public String senMessage(){
        return messageProvider.send();
    }
}
