package com.example.validatorspringjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.validatorspringjpa.model.User;
import java.util.List;


public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findByName(String name);
    List<User> findByEmail(String email);

    @Query(value = "SELECT * FROM user WHERE name =:name", nativeQuery = true)
    List<User> findByNameNative(@Param("name") String name);

}
