package com.zwf.boot1.mapper;

import com.zwf.boot1.domain.Video;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class VideoMapper {

    private static Map<Integer, Video> videoMap = new HashMap<>();

    static {

        videoMap.put(1,new Video(1,"Java基础课程，jdk8~13新特性"));
        videoMap.put(2,new Video(2,"SpringBoot2.X零基础到实战"));
        videoMap.put(3,new Video(3,"微服务SpringCLoud全家桶"));
        videoMap.put(4,new Video(4,"SpringBoot实战微信支付课程"));
        videoMap.put(5,new Video(5,"小滴课堂面试专题第一季，300道大厂连环问"));

    }



    public List<Video> listVideo(){

        List<Video> list = new ArrayList<>();
        list.addAll(videoMap.values());

        return  list;
    }









}
