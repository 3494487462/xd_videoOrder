package com.zwf.boot1.controller;

import com.fasterxml.jackson.core.JsonProcessingException;

import com.zwf.boot1.domain.Video;
import com.zwf.boot1.service.VideoService;
import com.zwf.boot1.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 视频控制器
 */


@RestController
@RequestMapping("/api/v1/pub/video")
public class VideoController {


    @Autowired
    private VideoService videoService;

    //@RequestMapping(value = "list",method = RequestMethod.GET)
    @GetMapping("list")
    public JsonData list() throws JsonProcessingException {

        List<Video> list =  videoService.listVideo();



        return JsonData.buildSuccess(list);
    }



    @PostMapping("save_video_chapter")
    public JsonData saveVideoChapter(@RequestBody Video video){

        System.out.println(video.toString());

        return JsonData.buildSuccess(video);

    }





}
