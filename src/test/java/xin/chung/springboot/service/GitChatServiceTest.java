package xin.chung.springboot.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xin.chung.springboot.entity.GitChat;

import javax.annotation.Resource;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by Charles Chung on 2018/01/02.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GitChatServiceTest {
    @Resource
    private GitChatService gitChatService;

    @Test
    public void saveGitChat() throws Exception {
        gitChatService.saveGitChat();
    }

    @Test
    public void testExceptionHandler() throws Exception {
        GitChat gitChat = new GitChat(null, "excep", new Date(), "http://gitbook.cn/gitchat/activity/5a444c451f6ee91a25846ac1");
        gitChatService.saveGitChat(gitChat);
    }
}