package edu.gyc.hiform.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 主页路由控制
 */
@Controller
@Slf4j
public class IndexController {
    /**
     * 访问设计表单页面
     * @return
     */
    @GetMapping(value = "/design")
    public String design(){
        return "design";
    }

    /**
     * 访问搜索表单页面
     * @return
     */
    @GetMapping(value = "/search")
    public String search() {
        return "search";
    }


    /**
     * 访问首页
     * @return
     */
    @RequestMapping(value = {"/","/index"})
    public String index() {
        log.info("called index");
        return "index";
    }

    /**
     * 访问登录页面
     * @return
     */
    @GetMapping(value = {"/login"})
    public String login() {
        return "login";
    }

    /**
     * 访问注册页面
     * @return
     */
    @GetMapping(value = {"/register"})
    public String register() {
        return "register";
    }

    /**
     * 访问修改密码页面
     * @return
     */
    @GetMapping("/changePassword")
    public String changePassword() {
        return "changePassword";
    }

    /**
     * 访问忘记密码页面
     * @return
     */
    @GetMapping("/forgetPassword")
    public String forgetPassword() {
        return "forgetPassword";
    }

}
