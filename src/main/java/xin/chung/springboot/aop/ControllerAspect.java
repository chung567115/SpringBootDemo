package xin.chung.springboot.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Charles Chung on 2018/01/02.
 */
@Aspect
@Component
public class ControllerAspect {
    private static final Logger logger = LoggerFactory.getLogger(ControllerAspect.class);

    @Pointcut(value = "execution(public * xin.chung.springboot.controller.DemoController.*(..))")
    public void log() {
    }

    @Before(value = "log()")
    public void logBefore(JoinPoint joinPoint) {
        logger.info("logBefore");

        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();

        //url
        logger.info("url={}", request.getRequestURL());

        //method
        logger.info("method={}", request.getMethod());

        //ip
        logger.info("ip={}", request.getRemoteAddr());

        //controller
        logger.info("class={}", joinPoint.getSignature());

        //args
        logger.info("param={}", joinPoint.getArgs());


    }

    @After(value = "log()")
    public void logAfter() {
        logger.info("logAfter");

    }

    @AfterReturning(returning = "object", value = "log()")
    public void logAfterReturning(Object object) {
        logger.info("response={}", object.toString());
    }

}
