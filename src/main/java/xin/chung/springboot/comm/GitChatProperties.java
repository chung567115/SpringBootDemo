package xin.chung.springboot.comm;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Charles Chung on 2018/01/02.
 */
@Configuration
@ConfigurationProperties(prefix = "gitchat")
public class GitChatProperties {
    private String author;
    private String addr;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
