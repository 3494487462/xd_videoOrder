package com.zwf.boot1.service.impl;


import com.zwf.boot1.domain.Video;
import com.zwf.boot1.mapper.VideoMapper;
import com.zwf.boot1.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class VideoServiceImpl implements VideoService {


    @Autowired
    private VideoMapper videoMapper;


    @Override
    public List<Video> listVideo() {
        return videoMapper.listVideo();
    }

    @Override
    public List<Video> getVideoList() {
        return null;
    }
}
