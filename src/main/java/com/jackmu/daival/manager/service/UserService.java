package com.jackmu.daival.manager.service;

import com.jackmu.daival.manager.domain.SysUser;
import com.jackmu.daival.manager.domain.UserDto;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.List;

public interface UserService {
    List<UserDto> findAllUsers(Integer start, Integer pageSize);

    UserDto addUser(UserDto sysUser);

    Integer findUserCount();
}
