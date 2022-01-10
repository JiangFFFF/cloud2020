package com.jiang.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author jiang
 * @create 2022-01-10-6:02 下午
 */
@Mapper
public interface StorageDao {

    /**
     * 扣减库存
     * @param productId
     * @param count
     */
    public abstract void decrease(@Param("productId")Long productId,@Param("count")Integer count);
}
