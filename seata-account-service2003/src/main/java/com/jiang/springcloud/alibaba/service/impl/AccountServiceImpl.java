package com.jiang.springcloud.alibaba.service.impl;

import com.jiang.springcloud.alibaba.dao.AccountDao;
import com.jiang.springcloud.alibaba.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/**
 * @author jiang
 * @create 2022-01-10-9:43 下午
 */
@Service
@Slf4j
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountDao accountDao;

    @Override
    public void decrease(Long userId, BigDecimal money) {
        log.info("----->account-service中扣减账户余额开始");

        //模拟超时异常，全局事务回滚
        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        accountDao.decrease(userId, money);
        log.info("----->account-service中扣减账户余额结束");
    }
}
