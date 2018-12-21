package com.jackmu.daival.manager.dao;

import com.jackmu.daival.manager.domain.SysRole;
import com.jackmu.daival.manager.domain.SysUser;
import com.jackmu.daival.manager.domain.UserDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SysUserDao {
     SysUser findUserByUserName(@Param(value = "username") String username);
     List<SysRole> findUserRoleByUserName(@Param(value = "username") String username);

     List<UserDto> findAllUser(@Param(value = "start") Integer start, @Param(value = "pageSize") Integer pageSize);

     Integer findUserCount();

     Integer addUser(UserDto sysUser);
}
