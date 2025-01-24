package com.produce.msg.without.docker.controller;


import com.produce.msg.without.docker.service.KafkaProducerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerMsgController {

    private final KafkaProducerService kafkaProducerService;

    public ProducerMsgController(KafkaProducerService kafkaProducerService){
        this.kafkaProducerService=kafkaProducerService;
    }

    @GetMapping("/send")
    public ResponseEntity<String> sendMsgToKafka(@RequestParam String msg){
        kafkaProducerService.producerMsg("kafkatopic",msg);
        return new ResponseEntity<>("Msg has been produced to kafka topic : "+msg, HttpStatus.OK);
    }
}
