package com.database.sb_security_with_db.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {




    @GetMapping("/home")
    public ResponseEntity<String> getHomeData(){

        return new ResponseEntity<>("THis is home controller", HttpStatus.OK);
    }
}
