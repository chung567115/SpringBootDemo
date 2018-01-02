package xin.chung.springboot.comm;

/**
 * Created by Charles Chung on 2018/01/02.
 */
public class GitChatException extends RuntimeException {
    private Integer EXCEPTION_CODE;

    public GitChatException(Integer EXCEPTION_CODE) {
        super();
        this.EXCEPTION_CODE = EXCEPTION_CODE;
    }

    public Integer getEXCEPTION_CODE() {
        return EXCEPTION_CODE;
    }

    public void setEXCEPTION_CODE(Integer EXCEPTION_CODE) {
        this.EXCEPTION_CODE = EXCEPTION_CODE;
    }
}
