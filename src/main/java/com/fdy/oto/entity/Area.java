package com.fdy.oto.entity;

import lombok.Data;

import java.util.Date;

/**
 * 区域
 */
@Data
public class Area {

    private Integer areaId;

    private String areaName; //区域名称

    private Integer priority; //权重

    private Date createTime;

    private Date lastEditTime;

}
