package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *买家：(Buyers)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "Buyers")
public class Buyers implements Serializable {

    //Buyers编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "buyers_id")
    private Integer buyers_id;
   // 买家编号
   @Basic
    private String buyer_number;
   // 买家性别
   @Basic
    private String buyer_gender;
   // 买家年龄
   @Basic
    private String buyer_age;
   // 买家学校
   @Basic
    private String buyer_school;
   // 买家地址
   @Basic
    private String buyer_address;
   // 买家生日
   @Basic
    private Timestamp buyer_birthday;
   // 买家简介
   @Basic
    private String brief_introduction;
    // 用户编号
    @Id
    @Column(name = "user_id")
    private Integer userId;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
