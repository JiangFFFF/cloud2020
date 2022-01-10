package com.jiang.springcloud.alibaba.controller;

import com.jiang.springcloud.alibaba.domain.CommonResult;
import com.jiang.springcloud.alibaba.domain.Order;
import com.jiang.springcloud.alibaba.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.checkerframework.checker.units.qual.C;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author jiang
 * @create 2022-01-10-5:36 下午
 */
@RestController
@Slf4j
public class OrderController {
    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order){
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}
