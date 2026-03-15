package com.example.restapiwithjpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.restapiwithjpa.model.User;

// JpaRepository requires the Entity (User) and the type of its Primary Key (Integer)
public interface UserRepository extends JpaRepository<User, Integer> {
}