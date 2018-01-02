package xin.chung.springboot.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xin.chung.springboot.entity.GitChat;

import javax.annotation.Resource;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Charles Chung on 2018/01/02.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GitChatRepositoryTest {
    @Resource
    private GitChatRepository gitChatRepository;

    @Test
    public void testFindAll() {
        List<GitChat> all = gitChatRepository.findAll();
        System.out.println(all.toString());
    }

    @Test
    public void findGitChatsByAuthor() throws Exception {
        List<GitChat> byAuthor = gitChatRepository.findGitChatsByAuthor("chung");
        System.out.println(byAuthor.toString());
    }

}