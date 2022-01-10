package com.jiang.springcloud.alibaba.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author jiang
 * @create 2022-01-10-9:42 下午
 */
public interface AccountService {
    /**
     * 扣减账户余额
     * @param userId
     * @param money
     */
    void decrease(@RequestParam("userId")Long userId, @RequestParam("money")BigDecimal money);
}
