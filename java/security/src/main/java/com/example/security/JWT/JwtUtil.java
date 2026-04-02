package com.example.security.JWT;

import java.sql.Date;

import javax.crypto.SecretKey;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtil {
    
    // private final SecretKey key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
    private String secretKey ="pirithika";

    public String generateToken(String userName){
        return Jwts.builder()
        .subject(userName)
        .issuedAt(new Date())
        .expiration(new Date(System.currentTimeMillis() + 1000 *60*60))
        .signWith(SignatureAlgorithm.HS256, secretKey)
        .compact();
            }
}
