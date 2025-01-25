package com.kafka.produce.jsondata.controller;


import com.kafka.produce.jsondata.dto.EmployeeDto;
import com.kafka.produce.jsondata.service.KafkaProducerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {


   private final KafkaProducerService kafkaProducerService;

    public EmpController(KafkaProducerService kafkaProducerService){
        this.kafkaProducerService=kafkaProducerService;
    }




    @PostMapping("/produce/data")
    public ResponseEntity<String> producerJsonData(@RequestBody EmployeeDto employeeDto){
        kafkaProducerService.produceData("jsontopic",employeeDto);
        return new ResponseEntity<>("Data has been produced on kafka topic: "+employeeDto, HttpStatus.OK);
    }
}

