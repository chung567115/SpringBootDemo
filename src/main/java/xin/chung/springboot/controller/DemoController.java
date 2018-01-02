package xin.chung.springboot.controller;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import xin.chung.springboot.entity.GitChat;
import xin.chung.springboot.service.GitChatService;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;

/**
 * Created by Charles Chung on 2018/01/02.
 */
@RestController
public class DemoController {
    @Resource
    private GitChatService gitChatService;

    @PostMapping("/gitChat")
    public Object addGitChat(
            @Valid GitChat gitChat,
            BindingResult bindingResult
    ) throws Exception {
        if (bindingResult.hasErrors()) {
            return bindingResult.getFieldError().getDefaultMessage();
        } else {
            return gitChatService.saveGitChat(gitChat);
        }
    }

    @RequestMapping("/say")
    public String sayHello() {
        return "hello World!";
    }


    @GetMapping("/getGitChat/{id}")
    public GitChat getGitChat(@PathVariable String id) {
        GitChat gitChat = new GitChat(null, "chung", new Date(), "http://gitbook.cn/gitchat/activity/" + id);
        return gitChat;
    }

    @GetMapping("/getGitChat")
    public GitChat getGitChatByRequestParam(@RequestParam(defaultValue = "5a444c451f6ee91a25846ac1") String id) {
        GitChat gitChat = new GitChat(null, "chung", new Date(), "http://gitbook.cn/gitchat/activity/" + id);
        return gitChat;
    }

}
