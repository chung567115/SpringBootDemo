package xin.chung.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xin.chung.springboot.entity.GitChat;

import java.util.List;

/**
 * Created by Charles Chung on 2018/01/02.
 */
public interface GitChatRepository extends JpaRepository<GitChat, Integer> {
    List<GitChat> findGitChatsByAuthor(String author);
}
