package com.produce.msg.without.docker.service;


import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {


    private final KafkaTemplate<String,String> kafkaTemplate;

    public KafkaProducerService(KafkaTemplate<String,String> kafkaTemplate){
        this.kafkaTemplate=kafkaTemplate;
    }


    public void producerMsg(String topicName,String msg){

        kafkaTemplate.send(topicName,msg);
        System.out.println("Mesg has been produced on the topic.......");
    }
}
