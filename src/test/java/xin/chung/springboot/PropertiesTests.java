package xin.chung.springboot;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xin.chung.springboot.comm.GitChatProperties;

import javax.annotation.Resource;

/**
 * Created by Charles Chung on 2018/01/02.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiesTests {
//    @Value("${author}")
//    private String author;
//
//    @Value("${addr}")
//    private String addr;

    @Resource
    private GitChatProperties gitChatProperties;

    @Test
    public void test() {
//        System.out.println("author:" + author + " addr:" + addr);
        System.out.println("\nauthor:" + gitChatProperties.getAuthor() + " addr:" + gitChatProperties.getAddr());
    }
}
