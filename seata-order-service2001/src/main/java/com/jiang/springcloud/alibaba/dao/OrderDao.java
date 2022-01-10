package com.jiang.springcloud.alibaba.dao;

import com.jiang.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author jiang
 * @create 2022-01-10-4:11 下午
 */
@Mapper
public interface OrderDao {
    //1、新建订单
    public abstract void create(Order order);

    //2、修改订单状态
    void update(@Param("userId")Long userId,@Param("status")Integer status);
}
