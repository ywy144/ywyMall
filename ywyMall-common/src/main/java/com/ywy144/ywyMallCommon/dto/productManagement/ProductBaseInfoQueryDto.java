package com.ywy144.ywyMallCommon.dto.productManagement;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductBaseInfoQueryDto {

    private Integer id;

    private String productId;

    private String productName;

    private String brand;

    private Integer status;

    private Integer firstLevelCategory;

    private Integer secondLevelCategory;
}
