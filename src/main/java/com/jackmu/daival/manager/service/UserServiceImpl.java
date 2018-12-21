package com.jackmu.daival.manager.service;

import com.jackmu.daival.manager.dao.SysUserDao;
import com.jackmu.daival.manager.domain.SysUser;
import com.jackmu.daival.manager.domain.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    SysUserDao sysUserDao;
    @Override
    public List<UserDto> findAllUsers(Integer start, Integer pageSize) {
        List<UserDto> userList = sysUserDao.findAllUser(start,pageSize);
        return userList;
    }

    @Override
    public UserDto addUser(UserDto sysUser) {
         sysUserDao.addUser(sysUser);
        return sysUser;
    }

    @Override
    public Integer findUserCount() {
        return sysUserDao.findUserCount();
    }
}
