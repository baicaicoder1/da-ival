package com.jackmu.daival.manager.controllor;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("login")
    public String login(){
        return "admin/login";
    }

    @RequestMapping("index")
    public String index(){
        return "admin/index";
    }
}
