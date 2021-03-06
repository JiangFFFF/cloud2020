package com.jiang.springcloud.alibaba.controller;

import com.jiang.springcloud.alibaba.domain.CommonResult;
import com.jiang.springcloud.alibaba.service.AccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author jiang
 * @create 2022-01-10-9:45 下午
 */
@RestController
public class AccountController {
    @Resource
    AccountService accountService;

    @RequestMapping("/account/decrease")
    public CommonResult decrease(@RequestParam("userId")Long userId, @RequestParam("money")BigDecimal money){
        accountService.decrease(userId, money);
        return new CommonResult(200,"扣减账户余额成功!");
    }
}
