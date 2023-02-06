package com.mz.todolist.configuration;

import com.mz.todolist.entity.UserEntity;
import com.mz.todolist.service.UserService;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@Component
public class UserDetail implements UserDetailsService {

    @Resource
    private UserService service;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userByUserNameEntity = service.findUserByUserName(username);
        if (userByUserNameEntity == null) {
            throw new UsernameNotFoundException("用户不存在");
        }
        SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority("admin");
        List<GrantedAuthority> authorities = Arrays.asList(simpleGrantedAuthority);
        org.springframework.security.core.userdetails.User user = new org.springframework.security.core.userdetails.User(userByUserNameEntity.getUserName(), userByUserNameEntity.getPassWord(), authorities);
        return user;
    }
}
