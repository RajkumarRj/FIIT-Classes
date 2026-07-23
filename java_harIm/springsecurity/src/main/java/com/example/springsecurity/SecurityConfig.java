package com.example.springsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.example.springsecurity.jwt.JwtFilter;

@Configuration
public class SecurityConfig {

    private final JwtFilter jwtfilter;

    SecurityConfig(JwtFilter jwtfilter) {
        this.jwtfilter = jwtfilter;
    }

    @Bean
    public SecurityFilterChain config(HttpSecurity http) throws Exception{

         http.csrf(Customizer-> Customizer.disable())
                    .authorizeHttpRequests(req -> req.requestMatchers("/add").permitAll().anyRequest().authenticated())
                    .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
                    // .formLogin(Customizer.withDefaults())
                    // .httpBasic(Customizer.withDefaults());
        http.addFilterBefore(jwtfilter, UsernamePasswordAuthenticationFilter.class);

        return http.build();


    }
    
}


