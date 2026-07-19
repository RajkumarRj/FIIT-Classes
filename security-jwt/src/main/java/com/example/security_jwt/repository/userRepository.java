package com.example.security_jwt.repository;

import com.example.security_jwt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<User,Long> {
}
