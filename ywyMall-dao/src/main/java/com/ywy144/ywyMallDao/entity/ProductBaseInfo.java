package com.ywy144.ywyMallDao.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "product_base_info")
public class ProductBaseInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_id", nullable = false)
    private String productId;

    @Column(name = "product_name", nullable = false)
    private String productName;

    @Column(name = "brand", nullable = false)
    private String brand;

    @Column(name = "status", nullable = false)
    private Integer status;

    @Column(name = "first_level_category", nullable = false)
    private Integer firstLevelCategory;

    @Column(name = "second_level_category")
    private Integer secondLevelCategory;

    @Column(name = "creation_time", nullable = false)
    private Date creationTime;

    @Column(name = "update_time", nullable = false)
    private Date updateTime;

    @Column(name = "is_deleted", nullable = false)
    private Integer isDeleted;
}