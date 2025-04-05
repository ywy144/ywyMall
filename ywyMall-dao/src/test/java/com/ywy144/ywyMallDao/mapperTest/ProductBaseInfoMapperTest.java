package com.ywy144.ywyMallDao.mapperTest;

import com.ywy144.ywyMallDao.mapper.ProductBaseInfoMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductBaseInfoMapperTest {

    @Autowired
    private ProductBaseInfoMapper productBaseInfoMapper;

    @Test
    public void selectByPrimaryKeyTest() {
        System.out.println(productBaseInfoMapper.selectByPrimaryKey(1).get());
    }
}
