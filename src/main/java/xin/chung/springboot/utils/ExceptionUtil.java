package xin.chung.springboot.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import xin.chung.springboot.comm.GitChatException;

/**
 * Created by Charles Chung on 2018/01/02.
 */
@ControllerAdvice
public class ExceptionUtil {
    private static final Logger logger = LoggerFactory.getLogger(ExceptionUtil.class);

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public String handle(Exception e) {
        if (e instanceof GitChatException) {
            return ((GitChatException) e).getEXCEPTION_CODE().toString();
        } else {
            return e.getMessage();
        }
    }
}
