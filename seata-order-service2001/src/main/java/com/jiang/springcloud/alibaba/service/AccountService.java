package com.jiang.springcloud.alibaba.service;

import com.jiang.springcloud.alibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author jiang
 * @create 2022-01-10-5:21 下午
 */
@FeignClient(value="seata-account-service")
public interface AccountService {

    @PostMapping(value="/account/decrease")
    CommonResult decrease(@RequestParam("userId")Long UserId, @RequestParam("money") BigDecimal money);
}
