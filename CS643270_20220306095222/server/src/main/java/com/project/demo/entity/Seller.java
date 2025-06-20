package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *卖家：(Seller)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "Seller")
public class Seller implements Serializable {

    //Seller编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seller_id")
    private Integer seller_id;
   // 卖家编号
   @Basic
    private String seller_number;
   // 卖家性别
   @Basic
    private String seller_gender;
   // 卖家年龄
   @Basic
    private String age;
   // 卖家学校
   @Basic
    private String seller_school;
   // 卖家地址
   @Basic
    private String address;
   // 卖家生日
   @Basic
    private Timestamp seller_birthday;
   // 卖家简介
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
