package com.example.validatorspringjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.validatorspringjpa.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    
}
