package com.javabean.kafka.service;

import com.javabean.kafka.config.KafkaTopics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class KafkaProducerService {


    @Autowired
    private KafkaTopics kafkaTopics;


    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;


    public void testOneProduceMsg(String msg){
        kafkaTemplate.send(kafkaTopics.getTestTopic(),msg);
        System.out.println("Sent msg to the kafka topic test one .......");
    }


    public  void testTwoProduceMsg(String msg){
        kafkaTemplate.send(kafkaTopics.getTestTwo(),msg);
        System.out.println("Sent msg to the kafka topic test two .......");
    }
}
