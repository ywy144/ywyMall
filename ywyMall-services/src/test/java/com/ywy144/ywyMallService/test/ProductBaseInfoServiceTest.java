package com.ywy144.ywyMallService.test;

import com.ywy144.ywyMallCommon.dto.productManagement.ProductBaseInfoQueryDto;
import com.ywy144.ywyMallDao.entity.ProductBaseInfo;
import com.ywy144.ywyMallService.productManagement.service.ProductBaseInfoService;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
public class ProductBaseInfoServiceTest {

    @Resource
    private ProductBaseInfoService productBaseInfoService;

    @Test
    public void queryByConditionTest() {
        ProductBaseInfoQueryDto productBaseInfoQueryDto = new ProductBaseInfoQueryDto.Builder().
                firstLevelCategory(1).
                build();
        System.out.println(productBaseInfoService.queryByCondition(productBaseInfoQueryDto));
    }

    @Test
    public void queryByIdsTest() {
        List<Integer> ids = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(productBaseInfoService.queryByIds(ids));
    }

    @Test
    public void insertTest() {
        ProductBaseInfo productBaseInfo = new ProductBaseInfo.Builder()
                .productId("000101")
                .productName("prod000101")
                .brand("brand34")
                .status(1)
                .firstLevelCategory(21)
                .secondLevelCategory(101)
                .creationTime(new Date())
                .updateTime(new Date())
                .isDeleted(0)
                .build();
        System.out.println(productBaseInfoService.insert(productBaseInfo));
    }
}
