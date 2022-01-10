package com.jiang.springcloud.controller;

import com.jiang.springcloud.domain.CommonResult;
import com.jiang.springcloud.service.StorageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author jiang
 * @create 2022-01-10-6:20 下午
 */
@RestController
public class StorageController {

    @Resource
    private StorageService storageService;

    @RequestMapping("/storage/decrease")
    public CommonResult decrease(Long productId,Integer count){
        storageService.decrease(productId, count);
        return new CommonResult(200,"库存扣减成功！");
    }
}
