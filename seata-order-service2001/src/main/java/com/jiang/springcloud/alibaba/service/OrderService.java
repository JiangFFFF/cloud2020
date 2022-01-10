package com.jiang.springcloud.alibaba.service;

import com.jiang.springcloud.alibaba.domain.Order;
import org.springframework.stereotype.Service;

/**
 * @author jiang
 * @create 2022-01-10-4:38 下午
 */

public interface OrderService {
    void create(Order order);


}
