package com.fdy.oto.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 商品
 */
@Data
public class Product {
    private Long productId;
    private String productName; //商品名称
    private String productDesc; //商品描述
    private String imgAddr; //缩略图
    private String normalPrice; //原价
    private String promotionPrice; //折后价
    private Integer priority; //权重
    private Date create_time;
    private Date lastEditTime;
    private Integer enableStatus; //状态
    private List<ProductImg> productImgList; //商品详情图片列表
    private ProductCategory productCategory; //类别ID
    private Shop shop; //店铺ID
}
