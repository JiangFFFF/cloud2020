package com.jiang.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author jiang
 * @create 2022-01-10-5:40 下午
 */
@Configuration
@MapperScan("com.jiang.springcloud.alibaba.dao")
public class MyBatisConfig {
}
