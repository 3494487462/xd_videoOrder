package com.zwf.boot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//组件扫描
@ServletComponentScan
//开启定时任务
@EnableScheduling
//开启异步任务
@EnableAsync
public class study_Application {

    public static void main(String[] args) {
        SpringApplication.run(study_Application.class, args);
    }

}
