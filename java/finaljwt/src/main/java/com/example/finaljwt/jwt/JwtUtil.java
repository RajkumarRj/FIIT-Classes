package com.example.finaljwt.jwt;

import java.security.Key;
import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtil {

    private final Key SECRET  = Keys.hmacShaKeyFor("mySecurityKeymySecurityKeymySecurityKey".getBytes());
    
   
    public String generateToken(String username){
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60))
                .signWith(SECRET,SignatureAlgorithm.HS256)
                .compact();
    }


    public String extractName(String token){
        return Jwts.parserBuilder()
            .setSigningKey(SECRET)
            .build()
            .parseClaimsJws(token)
            .getBody()
            .getSubject();
    }
}
