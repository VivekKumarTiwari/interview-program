package com.kafka.json.produces.msg.service;


import com.kafka.json.produces.msg.config.KafkaDetails;
import com.kafka.json.produces.msg.dtos.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {





    @Autowired
    KafkaDetails kafkaDetails;

    @Autowired
    private KafkaTemplate<String, StudentDto> kafkaTemplate;


    public void produceMsg(StudentDto studentDto){

        kafkaTemplate.send(kafkaDetails.getTopicName(),studentDto);

        System.out.println("Student data has been produced on the kafka topic....");
    }
}
