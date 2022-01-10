package com.jiang.springcloud.alibaba.service;

import com.jiang.springcloud.alibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author jiang
 * @create 2022-01-10-5:12 下午
 */
@FeignClient(value = "seata-storage-service")
public interface StorageService {

    /**
     * 订单从seata-storage-service这个微服务中找到/storage/decrease这个方法完成对某种商品的数量的扣减
     * @param productId
     * @param count
     * @return
     */
    @PostMapping(value="/storage/decrease")
    CommonResult decrease(@RequestParam("productId")Long productId,@RequestParam("count")Integer count);
}
