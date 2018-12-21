package com.jackmu.daival.manager.service;

import com.jackmu.daival.manager.dao.SysUserDao;
import com.jackmu.daival.manager.domain.SysRole;
import com.jackmu.daival.manager.domain.SysUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    SysUserDao sysUserDao;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if(username == null || username ==""){
            throw new UsernameNotFoundException("username is empty");
        }
        SysUser sysUser = sysUserDao.findUserByUserName(username);
        if(sysUser == null){
            throw new UsernameNotFoundException("username is wrong");
        }
        List<SysRole> roles = sysUserDao.findUserRoleByUserName(username);
        sysUser.setRoles(roles);
        return sysUser;
    }
}
