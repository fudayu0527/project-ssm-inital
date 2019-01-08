package com.fdy.oto.entity;

import lombok.Data;

import java.util.Date;

/**
 * 店铺类别
 */
@Data
public class ShopCategory {
    private Long shopCategoryId;
    private String shopCategoryName; //店铺类别名称
    private String shopCategoryDesc; //店铺类别描述
    private String shopCategoryImg; //店铺类别图片
    private Integer priority; //权重
    private Date createTime;
    private Date lastEditTime;
    private ShopCategory parent; //上级ID
}
