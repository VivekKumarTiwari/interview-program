package com.javabeans.consumer.sb.consumer;


import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMsgConsumer {



    @KafkaListener(topics = "${spring.kafka.consumer.topic}",groupId = "${spring.kafka.consumer.group-id}")
    public void listener(String msg){

        System.out.println("Kafka message : "+msg);
    }
}
