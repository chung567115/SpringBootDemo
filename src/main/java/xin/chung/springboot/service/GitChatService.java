package xin.chung.springboot.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xin.chung.springboot.comm.GitChatException;
import xin.chung.springboot.entity.GitChat;
import xin.chung.springboot.repository.GitChatRepository;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by Charles Chung on 2018/01/02.
 */
@Service
public class GitChatService {
    @Resource
    private GitChatRepository gitChatRepository;

    @Transactional
    public void saveGitChat() {
        GitChat gitChat1 = new GitChat(null, "Zhang", new Date(), "http://gitbook.cn/gitchat/activity/5a444c451f6ee91a25846ac1");
        gitChatRepository.save(gitChat1);
        GitChat gitChat2 = new GitChat(null, "ZhangChong", new Date(), "http://gitbook.cn/gitchat/activity/5a444c451f6ee91a25846ac1");
        gitChatRepository.save(gitChat2);
    }

    public GitChat saveGitChat(GitChat gitChat) throws Exception {
        GitChat save = gitChatRepository.save(gitChat);
        if (save.getAuthor().length() < 8) {
            throw new GitChatException(500);
        }
        return save;
    }
}
