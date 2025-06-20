package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *签收评分：(SignInScore)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "SignInScore")
public class SignInScore implements Serializable {

    //SignInScore编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sign_in_score_id")
    private Integer sign_in_score_id;
   // 订单编号
   @Basic
    private String order_number;
   // 购买商品
   @Basic
    private String purchase_goods;
   // 商品价格
   @Basic
    private String commodity_price;
   // 签收状态
   @Basic
    private String sign_in_status;
   // 星级评分
   @Basic
    private String star_rating;
   // 购买用户
   @Basic
    private Integer purchase_user;
   // 商家
   @Basic
    private Integer business;
   // 备注
   @Basic
    private String remarks;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
