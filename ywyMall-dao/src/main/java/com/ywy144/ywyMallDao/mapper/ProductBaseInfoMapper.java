package com.ywy144.ywyMallDao.mapper;

import static com.ywy144.ywyMallDao.mapper.ProductBaseInfoDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.ywy144.ywyMallDao.entity.ProductBaseInfo;
import jakarta.annotation.Generated;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.CommonCountMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonDeleteMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonUpdateMapper;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface ProductBaseInfoMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, productId, productName, brand, status, firstLevelCategory, secondLevelCategory, creationTime, updateTime, isDeleted);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @Options(useGeneratedKeys=true,keyProperty="row.id")
    int insert(InsertStatementProvider<ProductBaseInfo> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultipleWithGeneratedKeys")
    @Options(useGeneratedKeys=true,keyProperty="records.id")
    int insertMultiple(@Param("insertStatement") String insertStatement, @Param("records") List<ProductBaseInfo> records);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ProductBaseInfoResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="product_id", property="productId", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_name", property="productName", jdbcType=JdbcType.VARCHAR),
        @Result(column="brand", property="brand", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="first_level_category", property="firstLevelCategory", jdbcType=JdbcType.INTEGER),
        @Result(column="second_level_category", property="secondLevelCategory", jdbcType=JdbcType.INTEGER),
        @Result(column="creation_time", property="creationTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="is_deleted", property="isDeleted", jdbcType=JdbcType.INTEGER)
    })
    List<ProductBaseInfo> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ProductBaseInfoResult")
    Optional<ProductBaseInfo> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, productBaseInfo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, productBaseInfo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(ProductBaseInfo row) {
        return MyBatis3Utils.insert(this::insert, row, productBaseInfo, c ->
            c.map(productId).toProperty("productId")
            .map(productName).toProperty("productName")
            .map(brand).toProperty("brand")
            .map(status).toProperty("status")
            .map(firstLevelCategory).toProperty("firstLevelCategory")
            .map(secondLevelCategory).toProperty("secondLevelCategory")
            .map(creationTime).toProperty("creationTime")
            .map(updateTime).toProperty("updateTime")
            .map(isDeleted).toProperty("isDeleted")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<ProductBaseInfo> records) {
        return MyBatis3Utils.insertMultipleWithGeneratedKeys(this::insertMultiple, records, productBaseInfo, c ->
            c.map(productId).toProperty("productId")
            .map(productName).toProperty("productName")
            .map(brand).toProperty("brand")
            .map(status).toProperty("status")
            .map(firstLevelCategory).toProperty("firstLevelCategory")
            .map(secondLevelCategory).toProperty("secondLevelCategory")
            .map(creationTime).toProperty("creationTime")
            .map(updateTime).toProperty("updateTime")
            .map(isDeleted).toProperty("isDeleted")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(ProductBaseInfo row) {
        return MyBatis3Utils.insert(this::insert, row, productBaseInfo, c ->
            c.map(productId).toPropertyWhenPresent("productId", row::getProductId)
            .map(productName).toPropertyWhenPresent("productName", row::getProductName)
            .map(brand).toPropertyWhenPresent("brand", row::getBrand)
            .map(status).toPropertyWhenPresent("status", row::getStatus)
            .map(firstLevelCategory).toPropertyWhenPresent("firstLevelCategory", row::getFirstLevelCategory)
            .map(secondLevelCategory).toPropertyWhenPresent("secondLevelCategory", row::getSecondLevelCategory)
            .map(creationTime).toPropertyWhenPresent("creationTime", row::getCreationTime)
            .map(updateTime).toPropertyWhenPresent("updateTime", row::getUpdateTime)
            .map(isDeleted).toPropertyWhenPresent("isDeleted", row::getIsDeleted)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<ProductBaseInfo> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, productBaseInfo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<ProductBaseInfo> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, productBaseInfo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<ProductBaseInfo> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, productBaseInfo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<ProductBaseInfo> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, productBaseInfo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(ProductBaseInfo row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(productId).equalTo(row::getProductId)
                .set(productName).equalTo(row::getProductName)
                .set(brand).equalTo(row::getBrand)
                .set(status).equalTo(row::getStatus)
                .set(firstLevelCategory).equalTo(row::getFirstLevelCategory)
                .set(secondLevelCategory).equalTo(row::getSecondLevelCategory)
                .set(creationTime).equalTo(row::getCreationTime)
                .set(updateTime).equalTo(row::getUpdateTime)
                .set(isDeleted).equalTo(row::getIsDeleted);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ProductBaseInfo row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(productId).equalToWhenPresent(row::getProductId)
                .set(productName).equalToWhenPresent(row::getProductName)
                .set(brand).equalToWhenPresent(row::getBrand)
                .set(status).equalToWhenPresent(row::getStatus)
                .set(firstLevelCategory).equalToWhenPresent(row::getFirstLevelCategory)
                .set(secondLevelCategory).equalToWhenPresent(row::getSecondLevelCategory)
                .set(creationTime).equalToWhenPresent(row::getCreationTime)
                .set(updateTime).equalToWhenPresent(row::getUpdateTime)
                .set(isDeleted).equalToWhenPresent(row::getIsDeleted);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(ProductBaseInfo row) {
        return update(c ->
            c.set(productId).equalTo(row::getProductId)
            .set(productName).equalTo(row::getProductName)
            .set(brand).equalTo(row::getBrand)
            .set(status).equalTo(row::getStatus)
            .set(firstLevelCategory).equalTo(row::getFirstLevelCategory)
            .set(secondLevelCategory).equalTo(row::getSecondLevelCategory)
            .set(creationTime).equalTo(row::getCreationTime)
            .set(updateTime).equalTo(row::getUpdateTime)
            .set(isDeleted).equalTo(row::getIsDeleted)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(ProductBaseInfo row) {
        return update(c ->
            c.set(productId).equalToWhenPresent(row::getProductId)
            .set(productName).equalToWhenPresent(row::getProductName)
            .set(brand).equalToWhenPresent(row::getBrand)
            .set(status).equalToWhenPresent(row::getStatus)
            .set(firstLevelCategory).equalToWhenPresent(row::getFirstLevelCategory)
            .set(secondLevelCategory).equalToWhenPresent(row::getSecondLevelCategory)
            .set(creationTime).equalToWhenPresent(row::getCreationTime)
            .set(updateTime).equalToWhenPresent(row::getUpdateTime)
            .set(isDeleted).equalToWhenPresent(row::getIsDeleted)
            .where(id, isEqualTo(row::getId))
        );
    }
}