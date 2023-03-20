package com.dev.dao;

import com.dev.entity.Episode;

public interface EpisodeDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Episode record);

    int insertSelective(Episode record);

    Episode selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Episode record);

    int updateByPrimaryKey(Episode record);
}