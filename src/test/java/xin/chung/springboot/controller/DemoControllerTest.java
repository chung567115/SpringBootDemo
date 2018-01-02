package xin.chung.springboot.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import javax.annotation.Resource;

import java.util.Date;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

/**
 * Created by Charles Chung on 2018/01/02.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class DemoControllerTest {
    @Resource
    private MockMvc mockMvc;

    @Test
    public void testAddGitChat() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders
                        .post("/gitChat")
                        .param("author", "ZhangChong")
                        .param("date", String.valueOf(new Date()))
                        .param("url", "http://gitbook.cn/gitchat/activity/5a444c451f6ee91a25846ac1")
        )
                .andDo(print())
                .andReturn();
    }

    @Test
    public void getGitChatByRequestParam() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders
                        .get("/getGitChat")
                        .param("id", "5a444c451f6ee91a25846ac1")
        )
                .andDo(print())
                .andReturn();
    }

}