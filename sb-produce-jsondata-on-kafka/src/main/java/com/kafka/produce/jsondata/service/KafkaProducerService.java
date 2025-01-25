package com.kafka.produce.jsondata.service;


import com.kafka.produce.jsondata.dto.EmployeeDto;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    private final KafkaTemplate<String, EmployeeDto> kafkaTemplate;

    public KafkaProducerService(KafkaTemplate<String,EmployeeDto> kafkaTemplate){
        this.kafkaTemplate=kafkaTemplate;
    }

    public void produceData(String topicName,EmployeeDto employeeDto){
        kafkaTemplate.send(topicName,employeeDto.getEmpId().toString(),employeeDto);
        System.out.println("Data has been produced on the kafka topic : "+employeeDto);
    }
}
