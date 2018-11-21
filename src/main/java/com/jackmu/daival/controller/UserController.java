package com.jackmu.daival.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    /**
     * @Description 
     * @MethodName
     * @Author Administrator
     * @Date 2018/11/20 0020 下午 19:59
     */
    @RequestMapping("/user")
    public String index(Model model){
        model.addAttribute("msg",new int[]{1,2,3});
        return "user";
    }

    @RequestMapping("/addUser")
    public String addUser(){
        return "adduser";
    }
}
