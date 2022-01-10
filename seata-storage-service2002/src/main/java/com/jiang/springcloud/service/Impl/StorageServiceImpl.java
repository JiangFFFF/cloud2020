package com.jiang.springcloud.service.Impl;

import com.jiang.springcloud.dao.StorageDao;
import com.jiang.springcloud.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author jiang
 * @create 2022-01-10-6:17 下午
 */
@Service
@Slf4j
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageDao storageDao;

    @Override
    public void decrease(Long productId, Integer count) {
        log.info("----->storage-service扣减库存开始");
        storageDao.decrease(productId,count);
        log.info("----->storage-service扣减库存结束");
    }
}
