package com.fdy.oto.entity;

import lombok.Data;

import java.util.Date;

/**
 * 用户表
 */
@Data
public class PersonInfo {
    private Long userId;
    private String name;
    private String profileImg; //头像
    private String email;
    private String gender; //性别
    private Integer enableStatus; //身份标识
    private Integer userType; //1、顾客 2.店家 3.超级管理员
    private Date createTime;
    private Date lastEditTime;
}
