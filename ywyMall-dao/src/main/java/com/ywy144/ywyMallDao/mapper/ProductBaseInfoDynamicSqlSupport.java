package com.ywy144.ywyMallDao.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;
import java.util.List;

import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class ProductBaseInfoDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final ProductBaseInfo productBaseInfo = new ProductBaseInfo();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = productBaseInfo.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> productId = productBaseInfo.productId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> productName = productBaseInfo.productName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> brand = productBaseInfo.brand;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> status = productBaseInfo.status;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> firstLevelCategory = productBaseInfo.firstLevelCategory;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> secondLevelCategory = productBaseInfo.secondLevelCategory;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> creationTime = productBaseInfo.creationTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> updateTime = productBaseInfo.updateTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> isDeleted = productBaseInfo.isDeleted;

    public static List<SqlColumn> allColumns() {
        return List.of(id, productId, productName, brand, status, firstLevelCategory, secondLevelCategory, creationTime, updateTime, isDeleted);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class ProductBaseInfo extends AliasableSqlTable<ProductBaseInfo> {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> productId = column("product_id", JDBCType.VARCHAR);

        public final SqlColumn<String> productName = column("product_name", JDBCType.VARCHAR);

        public final SqlColumn<String> brand = column("brand", JDBCType.VARCHAR);

        public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);

        public final SqlColumn<Integer> firstLevelCategory = column("first_level_category", JDBCType.INTEGER);

        public final SqlColumn<Integer> secondLevelCategory = column("second_level_category", JDBCType.INTEGER);

        public final SqlColumn<Date> creationTime = column("creation_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> updateTime = column("update_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> isDeleted = column("is_deleted", JDBCType.INTEGER);

        public ProductBaseInfo() {
            super("product_base_info", ProductBaseInfo::new);
        }
    }
}