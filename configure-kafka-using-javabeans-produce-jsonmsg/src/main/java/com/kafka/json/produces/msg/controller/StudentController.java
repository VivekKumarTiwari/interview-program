package com.kafka.json.produces.msg.controller;


import com.kafka.json.produces.msg.dtos.StudentDto;
import com.kafka.json.produces.msg.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {



    @Autowired
    private ProducerService producerService;


    @PostMapping("/student")
    public ResponseEntity<String> studentProduceMsg(@RequestBody StudentDto studentDto){
        producerService.produceMsg(studentDto);
        return new ResponseEntity<>("Data has been produced on kafka topic..."+studentDto, HttpStatus.OK);

    }
}
