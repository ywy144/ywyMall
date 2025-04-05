package com.ywy144.ywyMallCommon.dto.productManagement;

import lombok.Data;

@Data
public class ProductBaseInfoQueryDto {

    private Integer id;

    private String productId;

    private String productName;

    private String brand;

    private Integer status;

    private Integer firstLevelCategory;

    private Integer secondLevelCategory;

    private ProductBaseInfoQueryDto(Builder builder){
        this.id = builder.id;
        this.productId = builder.productId;
        this.productName = builder.productName;
        this.brand = builder.brand;
        this.status = builder.status;
        this.firstLevelCategory = builder.firstLevelCategory;
        this.secondLevelCategory = builder.secondLevelCategory;
    }

    public static class Builder {
        private Integer id;
        private String productId;
        private String productName;
        private String brand;
        private Integer status;
        private Integer firstLevelCategory;
        private Integer secondLevelCategory;

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

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

        public ProductBaseInfoQueryDto build() {
            return new ProductBaseInfoQueryDto(this);
        }
    }

}
