package com.json.consumer.kafka.conusmer;

import com.json.consumer.kafka.dto.UserDto;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {




    @KafkaListener(topics = "${spring.kafka.topicName}",groupId = "${spring.kafka.consumer.group-id}")
    public void consumer(ConsumerRecord<String, UserDto> record){

        System.out.println("The Key is : "+record.key() + " ,The value or Data : "+record.value());

    }
}
