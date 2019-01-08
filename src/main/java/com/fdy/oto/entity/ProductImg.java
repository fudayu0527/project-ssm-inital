package com.fdy.oto.entity;

import lombok.Data;

import java.util.Date;

/**
 * 商品详情图片
 */
@Data
public class ProductImg {
    private Long productImgId;
    private String imgAddr;
    private String imgDesc;
    private Integer priority;
    private Date createTime;
    private Long productId;
}
