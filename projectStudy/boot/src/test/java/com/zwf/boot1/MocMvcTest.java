package com.zwf.boot1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.nio.charset.Charset;

@SpringBootTest
@AutoConfigureMockMvc
public class MocMvcTest {

    @Autowired
    MockMvc mockMvc;


    @Test
    public void testVideoListApi()throws Exception{

        MvcResult mvcResult =  mockMvc.perform(MockMvcRequestBuilders.get("/test/str"))
                .andExpect(MockMvcResultMatchers.status().isOk()).andReturn();

        int status = mvcResult.getResponse().getStatus();

        System.out.println(status);

        //会乱码
        //String result = mvcResult.getResponse().getContentAsString();

        // 使用下面这个，增加 编码 说明，就不会乱码打印
        String result = mvcResult.getResponse().getContentAsString(Charset.forName("utf-8"));

        System.out.println(result);

    }


}
