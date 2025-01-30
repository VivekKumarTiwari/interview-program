package com.javabean.kafka.controller;


import com.javabean.kafka.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaaController {


    @Autowired
    KafkaProducerService kafkaProducerService;


    @GetMapping("/testone")
    public String testOneProduceMsg(@RequestParam("msg") String msg){
        kafkaProducerService.testOneProduceMsg(msg);
        return "Successfully produces msg on kafka topic test one";
    }


    @GetMapping("/testtwo")
    public String testTwoProduceMsg(@RequestParam("msg") String msg){
        kafkaProducerService.testTwoProduceMsg(msg);
        return "Successfully produces msg  on kafka topic test two";
    }
}
