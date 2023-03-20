package com.zwf.boot1;

import com.zwf.boot1.domain.Video;
import com.zwf.boot1.service.VideoService;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class VideoTest {

    @Autowired
    VideoService videoService;

    @Test
    void testVideoService(){
        List<Video> videoList =videoService.getVideoList();
        TestCase.assertTrue(videoList.size() > 0);
        System.out.println("测试成功");
    }

}
