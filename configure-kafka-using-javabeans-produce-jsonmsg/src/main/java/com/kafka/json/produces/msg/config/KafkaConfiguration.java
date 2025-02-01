package com.kafka.json.produces.msg.config;


import com.kafka.json.produces.msg.dtos.StudentDto;
import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaConfiguration {


    @Autowired
    private  KafkaDetails kafkaDetails;



    @Bean

    public ProducerFactory<String, StudentDto> producerConfig(){
        Map<String,Object> objectMap=new HashMap<>();
        objectMap.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,kafkaDetails.getBootstrapServers());
        objectMap.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        objectMap.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
        return new DefaultKafkaProducerFactory<>(objectMap);
    }


    @Bean
    public KafkaTemplate<String, StudentDto> kafkaTemplate(){
        return new KafkaTemplate<>(producerConfig());
    }



    @Bean
    public NewTopic createTopic(){
        return new NewTopic(kafkaDetails.getTopicName(), kafkaDetails.getPartitions(), kafkaDetails.getReplicationFactors());
    }


}
