package com.jiang.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.jiang.springcloud.entity.CommonResult;
import com.jiang.springcloud.entity.Payment;

/**
 * @author jiang
 * @create 2022-01-09-5:21 下午
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception){
        return new CommonResult(444,"按客户自定义global-----1");
    }

    public static CommonResult handlerException2(BlockException exception){
        return new CommonResult(444,"按客户自定义global------2");
    }

}
