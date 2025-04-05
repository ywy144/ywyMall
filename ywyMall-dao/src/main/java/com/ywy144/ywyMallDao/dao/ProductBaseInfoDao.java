package com.ywy144.ywyMallDao.dao;

import com.ywy144.ywyMallCommon.dto.productManagement.ProductBaseInfoQueryDto;
import com.ywy144.ywyMallDao.entity.ProductBaseInfo;

import java.util.List;

public interface ProductBaseInfoDao {

    List<ProductBaseInfo> queryByCondition(ProductBaseInfoQueryDto productBaseInfoQueryDTO);

    List<ProductBaseInfo> queryByIds(List<Integer> ids);

    int insert(ProductBaseInfo productBaseInfo);

    int batchInsert(List<ProductBaseInfo> list);

    int batchDeleteByIds(List<Integer> ids);

    int updateRow(ProductBaseInfo row);
}
