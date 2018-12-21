package com.jackmu.daival.manager.controllor;

import com.jackmu.daival.dto.Msg;
import com.jackmu.daival.manager.dao.SysUserDao;
import com.jackmu.daival.manager.domain.SysUser;
import com.jackmu.daival.manager.domain.UserDto;
import com.jackmu.daival.manager.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/getUsers")
    public Msg getUsers(Integer start,Integer pageSize){
        Msg msg = new Msg();
        List<UserDto> users = userService.findAllUsers((start-1)*pageSize,pageSize);
        Integer userCount = userService.findUserCount();
        msg.setData(users);
        msg.setCount(userCount);
        return msg;
    }

    @RequestMapping("/addUser")
    public Msg addUser(@Param(value = "user") UserDto user){
        Msg msg = new Msg();
        UserDto users = userService.addUser(user);
        msg.setData(users);
        return msg;
    }
}
