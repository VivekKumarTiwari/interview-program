package com.javabean.kafka.config;


import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.internals.Topic;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaAdmin;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaConfig {



    @Value("${spring.kafka.bootstrap-servers}")
    private String bootstrapServers;


    @Autowired
    private KafkaTopics kafkaTopics;




    @Bean
    public ProducerFactory<String, Object> producerConfig(){
      Map<String,Object> objectMap=new HashMap<>();
      objectMap.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,this.bootstrapServers);
      objectMap.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
      objectMap.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,StringSerializer.class);
      return new DefaultKafkaProducerFactory<>(objectMap);
    }
    @Bean
    public KafkaTemplate<String,Object> kafkaTemplate(){
        return new KafkaTemplate<>(producerConfig());
    }





    @Bean
    public NewTopic testTopicOne(){
        return new NewTopic(kafkaTopics.getTestTopic(),kafkaTopics.getTestOnePartitions(),kafkaTopics.getTestOneReplicationFactor());
    }


    @Bean
    public NewTopic testTopicTwo(){
        return new NewTopic(kafkaTopics.getTestTwo(),kafkaTopics.getTestTwoPartitions(),kafkaTopics.getTestTwoReplicationFactor());
    }

}
