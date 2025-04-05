package com.ywy144.ywyMallDao.entity;

import jakarta.annotation.Generated;
import java.util.Date;

public class ProductBaseInfo {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String productId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String productName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String brand;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer status;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer firstLevelCategory;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer secondLevelCategory;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date creationTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date updateTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer isDeleted;

    private ProductBaseInfo(Builder builder){
        productId = builder.productId;
        productName = builder.productName;
        brand = builder.brand;
        status = builder.status;
        firstLevelCategory = builder.firstLevelCategory;
        secondLevelCategory = builder.secondLevelCategory;
        creationTime = builder.creationTime;
        updateTime = builder.updateTime;
        isDeleted = builder.isDeleted;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getProductId() {
        return productId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getProductName() {
        return productName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getBrand() {
        return brand;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getStatus() {
        return status;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setStatus(Integer status) {
        this.status = status;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getFirstLevelCategory() {
        return firstLevelCategory;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setFirstLevelCategory(Integer firstLevelCategory) {
        this.firstLevelCategory = firstLevelCategory;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getSecondLevelCategory() {
        return secondLevelCategory;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSecondLevelCategory(Integer secondLevelCategory) {
        this.secondLevelCategory = secondLevelCategory;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getCreationTime() {
        return creationTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getUpdateTime() {
        return updateTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getIsDeleted() {
        return isDeleted;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public ProductBaseInfo(Integer id, String productId, String productName, String brand, Integer status, Integer firstLevelCategory, Integer secondLevelCategory, Date creationTime, Date updateTime, Integer isDeleted) {
        this.id = id;
        this.productId = productId;
        this.productName = productName;
        this.brand = brand;
        this.status = status;
        this.firstLevelCategory = firstLevelCategory;
        this.secondLevelCategory = secondLevelCategory;
        this.creationTime = creationTime;
        this.updateTime = updateTime;
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return "ProductBaseInfo{" +
                "id=" + id +
                ", productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", brand='" + brand + '\'' +
                ", status=" + status +
                ", firstLevelCategory=" + firstLevelCategory +
                ", secondLevelCategory=" + secondLevelCategory +
                ", creationTime=" + creationTime +
                ", updateTime=" + updateTime +
                ", isDeleted=" + isDeleted +
                '}';
    }

    public static class Builder {
        private String productId;
        private String productName;
        private String brand;
        private Integer status;
        private Integer firstLevelCategory;
        private Integer secondLevelCategory;
        private Date creationTime;
        private Date updateTime;
        private Integer isDeleted;

        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder productName(String productName) {
            this.productName = productName;
            return this;
        }

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        public Builder firstLevelCategory(Integer firstLevelCategory) {
            this.firstLevelCategory = firstLevelCategory;
            return this;
        }

        public Builder secondLevelCategory(Integer secondLevelCategory) {
            this.secondLevelCategory = secondLevelCategory;
            return this;
        }

        public Builder creationTime(Date creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        public Builder updateTime(Date updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Builder isDeleted(Integer isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }

        public ProductBaseInfo build() {
            return new ProductBaseInfo(this);
        }
    }
}