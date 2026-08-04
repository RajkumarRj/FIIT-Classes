package com.example.springsecurity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class SecurityConfig {

    private final JwtFilter filter;

    public SecurityConfig(JwtFilter filter){
        this.filter = filter;
    }


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http){

        http.csrf(Customizer -> Customizer.disable());
        http.authorizeHttpRequests(req -> req.requestMatchers("/add").permitAll().anyRequest().authenticated() );
        // http.formLogin(Customizer.withDefaults());
        http.httpBasic(Customizer.withDefaults());

        http.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);
        return http.build();
    }

    
}
