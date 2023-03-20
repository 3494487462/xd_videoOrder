package com.dev.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * chapter
 * @author 
 */
@Data
public class VideoBanner implements Serializable {
    private Integer id;

    /**
     * 视频主键
     */
    private Integer videoId;

    /**
     * 章节名称
     */
    private String title;

    /**
     * 章节顺序
     */
    private Integer ordered;

    /**
     * 创建时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;
}