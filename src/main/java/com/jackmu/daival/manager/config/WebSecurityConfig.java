package com.jackmu.daival.manager.config;

import com.jackmu.daival.manager.sercurity.MyPasswordEncoder;
import com.jackmu.daival.manager.service.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Bean
    UserDetailsService customUserDetailsService(){
        return new CustomUserDetailsService();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(customUserDetailsService()).passwordEncoder(new MyPasswordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf() //跨站
                .disable() //关闭跨站检测
                .authorizeRequests() //验证策略
                    .antMatchers("/static/**").permitAll()
                    .anyRequest() //所有请求
                    .authenticated() //需要验证
                    .and()
                .formLogin()
                    .loginPage("/login")
                    .successForwardUrl("/index")
                    .defaultSuccessUrl("/dags")
                    .failureUrl("/404")
                    .permitAll()
                .and()
                .logout()
                    .permitAll();

        http.headers().frameOptions().disable();
    }

}
