package com.jiang.springcloud.alibaba.service.Impl;

import com.jiang.springcloud.alibaba.dao.OrderDao;
import com.jiang.springcloud.alibaba.domain.Order;
import com.jiang.springcloud.alibaba.service.AccountService;
import com.jiang.springcloud.alibaba.service.OrderService;
import com.jiang.springcloud.alibaba.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author jiang
 * @create 2022-01-10-4:40 下午
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;

    @Resource
    private StorageService storageService;

    @Resource
    private AccountService accountService;

    /**
     * 创建订单->调用库存服务扣减库存->调用账户服务扣减账户余额->修改订单状态
     * 简单说：下订单->扣库存->减余额->改状态
     */
    @Override
    @GlobalTransactional(name="fsp-create-order",rollbackFor = Exception.class)
    public void create(Order order) {
        log.info("----->开始新建订单");
        //1、新建订单
        orderDao.create(order);

        log.info("----->订单微服务开始调用库存，做扣减Count");
        //2、扣减库存
        storageService.decrease(order.getProductId(),order.getCount());
        log.info("----->订单微服务开始调用库存，做扣减End");

        log.info("----->订单微服务开始调用账户，账户余额做扣减Money");
        //3、扣减账户
        accountService.decrease(order.getUserId(),order.getMoney());
        log.info("----->订单微服务开始调用账户，账户余额做扣减End");

        //4、修改订单状态，从0-1，1代表完成
        log.info("----->开始修改订单状态");
        orderDao.update(order.getUserId(),0);
        log.info("----->修改订单状态End");

        log.info("----->下订单结束！！！");

    }
}
