package com.ywy144.ywyMallService.productManagement.service.impl;

import com.ywy144.ywyMallCommon.dto.productManagement.ProductBaseInfoQueryDto;
import com.ywy144.ywyMallCommon.object.BaseResult;
import com.ywy144.ywyMallCommon.object.ResultCode;
import com.ywy144.ywyMallDao.dao.ProductBaseInfoDao;
import com.ywy144.ywyMallService.productManagement.service.ProductBaseInfoService;
import com.ywy144.ywyMallDao.entity.ProductBaseInfo;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductBaseInfoServiceImpl implements ProductBaseInfoService {

//    @Resource
//    private ProductBaseInfoDao productBaseInfoDao;
//
//    @Override
//    public BaseResult<List<ProductBaseInfo>> queryByCondition(ProductBaseInfoQueryDto productBaseInfoQueryDTO) {
//        return BaseResult.success(productBaseInfoDao.queryByCondition(productBaseInfoQueryDTO));
//    }
//
//    @Override
//    public BaseResult<List<ProductBaseInfo>> queryByIds(List<Integer> ids) {
//        return BaseResult.success(productBaseInfoDao.queryByIds(ids));
//    }
//
//    @Override
//    public BaseResult<Object> insert(ProductBaseInfo productBaseInfo) {
//        try {
//            Integer result = productBaseInfoDao.insert(productBaseInfo);
//            return BaseResult.success(result);
//        } catch (RuntimeException exception) {
//            return BaseResult.failure(ResultCode.FAILED.getCode(), exception.getCause());
//        }
//    }
}
