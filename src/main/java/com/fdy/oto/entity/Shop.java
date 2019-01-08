package com.fdy.oto.entity;

import lombok.Data;

import java.util.Date;

/**
 * 店铺信息
 */
@Data
public class Shop {
    private Long shopId;
    private String shopName; //店铺名称
    private String shopDesc; //店铺描述
    private String shopAddr; //店铺地址
    private String phone;
    private String shopImg;  //门面照片
    private Integer priority; //权重
    private Date createTime;
    private Date lastEditTime;
    private Integer enableStatus; //-1 不可用；0 审核；1 可用
    private String advice; //超级管理员给店家的提醒
    private Area area; //区域ID
    private PersonInfo owner; //用户ID
    private ShopCategory shopCategory; //类别ID
}
