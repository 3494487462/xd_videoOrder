package com.dev.dao;

import com.dev.entity.VideoBanner;

public interface VideoBannerDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(VideoBanner record);

    int insertSelective(VideoBanner record);

    VideoBanner selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VideoBanner record);

    int updateByPrimaryKey(VideoBanner record);
}