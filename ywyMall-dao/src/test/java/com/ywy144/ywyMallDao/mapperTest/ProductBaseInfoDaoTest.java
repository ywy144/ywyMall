package com.ywy144.ywyMallDao.mapperTest;

import com.ywy144.ywyMallCommon.dto.productManagement.ProductBaseInfoQueryDto;
import com.ywy144.ywyMallCommon.utils.YwyListUtils;
import com.ywy144.ywyMallDao.dao.ProductBaseInfoDao;
import com.ywy144.ywyMallDao.entity.ProductBaseInfo;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
public class ProductBaseInfoDaoTest {

    @Resource
    private ProductBaseInfoDao productBaseInfoDao;

    @Test
    public void queryByConditionTest() {
        ProductBaseInfoQueryDto productBaseInfoQueryDto = new ProductBaseInfoQueryDto.Builder().
                firstLevelCategory(1).
                build();
        YwyListUtils.printListOnMultipleLines(productBaseInfoDao.queryByCondition(productBaseInfoQueryDto));
    }

    @Test
    public void queryByConditionTest2() {
        YwyListUtils.printListOnMultipleLines(productBaseInfoDao.queryByCondition(null));
    }

    @Test
    public void queryByIdsTest() {
        List<Integer> ids = List.of(1,2,3,4,5,6,7,8,9,10);
        YwyListUtils.printListOnMultipleLines(productBaseInfoDao.queryByIds(ids));
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
        System.out.println(productBaseInfoDao.insert(productBaseInfo));
    }

    @Test
    public void batchInsertTest() {
        ProductBaseInfo productBaseInfo = new ProductBaseInfo.Builder()
                .productId("000102")
                .productName("prod000102")
                .brand("brand34")
                .status(1)
                .firstLevelCategory(21)
                .secondLevelCategory(102)
                .creationTime(new Date())
                .updateTime(new Date())
                .isDeleted(0)
                .build();
        System.out.println(productBaseInfoDao.batchInsert(List.of(productBaseInfo)));
    }

    @Test
    public void batchDeleteByIdsTest() {
        List<Integer> list = List.of(101, 102);
        System.out.println(productBaseInfoDao.batchDeleteByIds(list));
    }

    @Test
    public void updateRowTest() {
        ProductBaseInfo productBaseInfo = new ProductBaseInfo.Builder()
                .productId("114514")
                .build();
        System.out.println(productBaseInfoDao.updateRow(productBaseInfo));
    }
}
