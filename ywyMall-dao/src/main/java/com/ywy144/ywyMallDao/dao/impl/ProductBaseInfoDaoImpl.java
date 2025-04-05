package com.ywy144.ywyMallDao.dao.impl;

import com.ywy144.ywyMallCommon.dto.productManagement.ProductBaseInfoQueryDto;
import com.ywy144.ywyMallDao.dao.ProductBaseInfoDao;
import com.ywy144.ywyMallDao.entity.ProductBaseInfo;
import com.ywy144.ywyMallDao.mapper.ProductBaseInfoDynamicSqlSupport;
import com.ywy144.ywyMallDao.mapper.ProductBaseInfoMapper;
import jakarta.annotation.Resource;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;

import static org.mybatis.dynamic.sql.SqlBuilder.*;

@Repository
public class ProductBaseInfoDaoImpl implements ProductBaseInfoDao {

    @Resource
    ProductBaseInfoMapper productBaseInfoMapper;

    @Override
    public List<ProductBaseInfo> queryByCondition(ProductBaseInfoQueryDto productBaseInfoQueryDto) {
        if(productBaseInfoQueryDto == null)
            return Collections.emptyList();
        SelectStatementProvider selectStatement =
                select(ProductBaseInfoDynamicSqlSupport.allColumns())
                        .from(ProductBaseInfoDynamicSqlSupport.productBaseInfo)
                        .where(ProductBaseInfoDynamicSqlSupport.id, isEqualToWhenPresent(productBaseInfoQueryDto.getId()))
                        .and(ProductBaseInfoDynamicSqlSupport.productId, isEqualToWhenPresent(productBaseInfoQueryDto.getProductId()))
                        .and(ProductBaseInfoDynamicSqlSupport.productName, isEqualToWhenPresent(productBaseInfoQueryDto.getProductName()))
                        .and(ProductBaseInfoDynamicSqlSupport.brand, isEqualToWhenPresent(productBaseInfoQueryDto.getBrand()))
                        .and(ProductBaseInfoDynamicSqlSupport.status, isEqualToWhenPresent(productBaseInfoQueryDto.getStatus()))
                        .and(ProductBaseInfoDynamicSqlSupport.firstLevelCategory, isEqualToWhenPresent(productBaseInfoQueryDto.getFirstLevelCategory()))
                        .and(ProductBaseInfoDynamicSqlSupport.secondLevelCategory, isEqualToWhenPresent(productBaseInfoQueryDto.getSecondLevelCategory()))
                        .build()
                        .render(RenderingStrategies.MYBATIS3);
        return productBaseInfoMapper.selectMany(selectStatement);
    }

    @Override
    public List<ProductBaseInfo> queryByIds(List<Integer> ids) {
        if(CollectionUtils.isEmpty(ids)) {
            return Collections.emptyList();
        }
        SelectStatementProvider selectStatement =
                select(ProductBaseInfoDynamicSqlSupport.allColumns())
                        .from(ProductBaseInfoDynamicSqlSupport.productBaseInfo)
                        .where(ProductBaseInfoDynamicSqlSupport.id, isIn(ids))
                        .build()
                        .render(RenderingStrategies.MYBATIS3);
        return productBaseInfoMapper.selectMany(selectStatement);
    }

    @Override
    public int insert(ProductBaseInfo productBaseInfo) {
        return productBaseInfoMapper.insertSelective(productBaseInfo);
    }

    @Override
    public int batchInsert(List<ProductBaseInfo> list) {
        return productBaseInfoMapper.insertMultiple(list);
    }

    @Override
    public int batchDeleteByIds(List<Integer> ids) {
        if(CollectionUtils.isEmpty(ids)) {
            return 0;
        }
        return productBaseInfoMapper.delete(c -> c.where(ProductBaseInfoDynamicSqlSupport.id, isIn(ids)));
    }

    @Override
    public int updateRow(ProductBaseInfo row) {
        return productBaseInfoMapper.updateByPrimaryKeySelective(row);
    }
}
