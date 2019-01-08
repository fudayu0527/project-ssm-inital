package com.fdy.oto.entity;

import lombok.Data;

import java.util.Date;

/**
 * 头条
 */
@Data
public class HeadLine {
    private Long lineId;
    private String lineName;
    private String lineLink; //链接
    private String lineImg;  //图片
    private Integer priority; //权重
    private Integer enableStatus; //状态 0 不可用；1 可用
    private Date createTime;
    private Date lastEditTime;
}
