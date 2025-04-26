package com.ywy144.ywyMallDao;

import com.alibaba.druid.pool.DruidDataSource;
import com.ywy144.ywyMallDao.repo.ProductBaseInfoRepo;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@MapperScan("com.ywy144.ywyMallDao.mapper")
class YwyMallDaoApplicationTests {

    @Autowired
    DruidDataSource dataSource;
    @Autowired
    ProductBaseInfoRepo productBaseInfoRepo;

    @Test
    void contextLoads() {
        System.out.println(productBaseInfoRepo.findById(1L));
    }

}
