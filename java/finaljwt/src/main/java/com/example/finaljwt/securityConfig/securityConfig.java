package com.example.finaljwt.securityConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.example.finaljwt.jwt.JwtFilter;

@Configuration
public class securityConfig {

    @Autowired
    private JwtFilter jwtFilter;
    

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http){

        http.
        csrf(csrf-> csrf.disable())
        .authorizeHttpRequests(auth -> auth.requestMatchers("/login").permitAll().anyRequest().authenticated())
        .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

        http.addFilterBefore(jwtFilter , UsernamePasswordAuthenticationFilter.class);
        
        return http.build();
    }

}
