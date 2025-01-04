package com.security.sb_secruity.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {



    @GetMapping("/login-user")
    public ResponseEntity<String> loginAPi(){

        return new ResponseEntity<>("This is login api no need to pass authenication data"
        , HttpStatus.OK);
    }
}
