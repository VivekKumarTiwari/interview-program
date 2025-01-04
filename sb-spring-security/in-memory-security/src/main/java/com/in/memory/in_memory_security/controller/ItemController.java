package com.in.memory.in_memory_security.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {



    @GetMapping("/item")
    public ResponseEntity<String> getItems(){

        return  new ResponseEntity<>("THis is Items data for accessing the item we need to login first",
                HttpStatus.OK
                );

    }

}
