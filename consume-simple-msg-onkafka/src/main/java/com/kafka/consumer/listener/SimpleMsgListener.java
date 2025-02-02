package com.kafka.consumer.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class SimpleMsgListener {

    @KafkaListener(topics = "${spring.kafka.topicName}",groupId = "${spring.kafka.consumer.group-id}")
    public void listener(ConsumerRecord<String,String> record){

        System.out.println("Print Key Data :  "+record.key()+ ", Print Value Data : "+record.value());
    }

}
