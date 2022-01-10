package com.jiang.springcloud.service.impl;

import com.jiang.springcloud.dao.PaymentDao;
import com.jiang.springcloud.entity.Payment;
import com.jiang.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author jiang
 * @create 2021-12-28-10:01 下午
 */

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
