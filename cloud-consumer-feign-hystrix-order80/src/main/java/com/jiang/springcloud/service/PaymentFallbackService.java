package com.jiang.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author jiang
 * @create 2022-01-02-9:47 下午
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String PaymentInfo_OK(Integer id) {
        return "----PaymentFallbackService fall back-PaymentInfo_OK,*^o^*";
    }

    @Override
    public String PaymentInfo_TimeOut(Integer id) {
        return "----PaymentFallbackService fall back-PaymentInfo_TimeOut,*^o^*";
    }
}
