package com.jiang.springcloud.service;

/**
 * @author jiang
 * @create 2022-01-10-6:16 下午
 */
public interface StorageService {

    /**
     * 扣减库存
     * @param productId
     * @param count
     */
    void decrease(Long productId,Integer count);
}
