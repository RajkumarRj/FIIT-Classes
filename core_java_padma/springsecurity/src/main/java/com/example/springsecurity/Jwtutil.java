package com.example.springsecurity;

import java.security.Key;
import java.util.Date;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Component
public class Jwtutil {

    private Key Secret_key = Keys.hmacShaKeyFor("dlsfjadlkfjalkdj***123234DFksadlfjalks(*&8934dsjfljadf".getBytes());

        public String generateToken(String username){

            return Jwts.builder()
                    .setSubject(username)
                    .setIssuedAt(new Date())
                    .setExpiration(new Date(System.currentTimeMillis()  + 1000*60*60))
                    .signWith(Secret_key , SignatureAlgorithm.HS256)
                    .compact();
        }

        public String extractUsername(String token){
            return Jwts.parserBuilder()
                    .setSigningKey(Secret_key)
                    .build()
                    .parseClaimsJws(token)
                    .getBody()
                    .getSubject();
        }
    
}
