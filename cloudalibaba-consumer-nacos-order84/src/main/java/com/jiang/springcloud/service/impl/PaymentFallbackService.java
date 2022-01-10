package com.jiang.springcloud.service.impl;

import com.jiang.springcloud.entity.CommonResult;
import com.jiang.springcloud.entity.Payment;
import com.jiang.springcloud.service.PaymentService;
import org.springframework.stereotype.Component;

/**
 * @author jiang
 * @create 2022-01-09-9:27 下午
 */
@Component
public class PaymentFallbackService implements PaymentService {

    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444,"服务降级返回,-------PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
