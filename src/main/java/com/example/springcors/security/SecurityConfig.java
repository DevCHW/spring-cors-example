package com.example.springcors.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilerChain(HttpSecurity http) throws Exception {
        http.httpBasic().disable();   //httpBasic 설정 해제
        http.csrf().disable();   //csrf설정 해제
        http.cors();    //CORS를 커스텀하는 설정
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS); //세션정책 무상태로 설정

        http.authorizeHttpRequests()
                .antMatchers("/**").permitAll()
                .anyRequest().authenticated();
        return http.build();
    }
}
