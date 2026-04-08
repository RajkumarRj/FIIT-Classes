// package com.example.security.controller;

// import org.springframework.security.web.csrf.CsrfToken;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import jakarta.servlet.http.HttpServletRequest;


// @RestController
// @RequestMapping("/api")
// public class userController {
    
//     @GetMapping("/users")
//     public String sayUser(){
//         return "Hello User";
//     }    
    
//     @GetMapping("/users/hello")
//     public String sayHelloUser(){
//         return "Hello users/hello";
//     }          
    
//     @GetMapping("/admin")
//     public String sayAdmin(){
//         return "Hello Admin";
//     }

//     @PostMapping("/access")
//     public String addData(@RequestBody String data){
//         return data;
//     }

//     @GetMapping("/csrf-token")
//     public CsrfToken getCsrfToken(HttpServletRequest request){
//         return (CsrfToken) request.getAttribute("_csrf");
//     }

//     // csrf => token 

//     // /api/users

//     // /api/admin
// }

package com.example.security.controller;

import com.example.security.JWT.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class userController {

    @Autowired
    private JwtUtil jwtUtil;

    // @Autowired
    // private PasswordEncoder passwordEncoder;

    // --- 1. Public endpoints ---
    @GetMapping("/users")
    public String sayUser() {
        return "Hello User (public)";
    }

    @GetMapping("/users/hello")
    public String sayHelloUser() {
        return "Hello users/hello (public)";
    }

    // --- 2. Protected endpoints ---
    @GetMapping("/admin")
    public String sayAdmin() {
        return "Hello Admin (protected)";
    }

    @PostMapping("/access")
    public String addData(@RequestBody String data) {
        return "You posted: " + data;
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest) {
        // hardcoded username/password
        String demoUsername = "raj";
        String demoPassword = "mypassword";

        if (loginRequest.getUsername().equals(demoUsername) &&
            loginRequest.getPassword().equals(demoPassword)) {
            // Generate token
            return jwtUtil.generateToken(loginRequest.getUsername());
        }
        return "Invalid credentials";
    }

    static class LoginRequest {
        private String username;
        private String password;

        // getters and setters
        public String getUsername() { return username; }
        public void setUsername(String username) { this.username = username; }
        public String getPassword() { return password; }
        public void setPassword(String password) { this.password = password; }
    }
}
