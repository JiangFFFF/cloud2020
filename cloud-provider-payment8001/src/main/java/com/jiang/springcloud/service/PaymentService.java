package com.jiang.springcloud.service;

import com.jiang.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author jiang
 * @create 2021-12-28-10:00 下午
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
