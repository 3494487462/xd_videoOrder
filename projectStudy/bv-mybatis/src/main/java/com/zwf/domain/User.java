package com.zwf.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
 *   `name` varchar(128) DEFAULT NULL COMMENT '昵称',
 *   `pwd` varchar(124) DEFAULT NULL COMMENT '密码',
 *   `head_img` varchar(524) DEFAULT NULL COMMENT '头像',
 *   `phone` varchar(64) DEFAULT '' COMMENT '手机号',
 *   `create_time` datetime DEFAULT NULL COMMENT '创建时间',
 */

@Data
public class User implements Serializable {

    private int id;

    private String name;

    private String pwd;

    private String headImg;

    private String phone;

    private Date createTime;

    private List<VideoOrder> videoOrderList;


}
