package xin.chung.springboot.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by Charles Chung on 2018/01/02.
 */
@Entity(name = "tbl_gitchat")
public class GitChat {
    @Id
    @GeneratedValue
    private Integer id;

    @Size(min = 1, max = 6)
    private String author;

    private Date date;

    @NotNull(message = "url不能为空")
    private String url;

    public GitChat() {
    }

    public GitChat(Integer id, String author, Date date, String url) {
        this.id = id;
        this.author = author;
        this.date = date;
        this.url = url;
    }

    @Override
    public String toString() {
        return "GitChat{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", date=" + date +
                ", url='" + url + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
