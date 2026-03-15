package com.example.validatorspringjpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class User {
        @Id
        private int id;

        @NotBlank(message = "Name field should not be empty")
        private String name;

        @NotBlank(message = "Email should not be empty")
        @Email(message = "Email should be in format with @")
        private String email;


        @NotBlank(message = "Password not be empty")
        @Size(min = 8, max = 10, message = "Password should be 8 to 10 char len")
        private String password;
        // ctrl + .
        public User(){}
        public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        }
        public int getId() {
        return id;
        }
        public void setId(int id) {
        this.id = id;
        }
        public String getName() {
        return name;
        }
        public void setName(String name) {
        this.name = name;
        }
        public String getEmail() {
        return email;
        }
        public void setEmail(String email) {
        this.email = email;
        }

        public String getPassword() {
        return password;
        }
        public void setPassword(String password) {
        this.password = password;
        }

}