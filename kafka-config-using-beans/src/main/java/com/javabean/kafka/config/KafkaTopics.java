package com.javabean.kafka.config;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spring.topic")
public class KafkaTopics {

    private String testTopic;
    private String testTwo;

    private Integer testOnePartitions;

    private Integer testTwoPartitions;

    private short testOneReplicationFactor;

    private short testTwoReplicationFactor;

    public String getTestTopic() {
        return testTopic;
    }

    public void setTestTopic(String testTopic) {
        this.testTopic = testTopic;
    }

    public String getTestTwo() {
        return testTwo;
    }

    public void setTestTwo(String testTwo) {
        this.testTwo = testTwo;
    }

    public Integer getTestOnePartitions() {
        return testOnePartitions;
    }

    public void setTestOnePartitions(Integer testOnePartitions) {
        this.testOnePartitions = testOnePartitions;
    }

    public Integer getTestTwoPartitions() {
        return testTwoPartitions;
    }

    public void setTestTwoPartitions(Integer testTwoPartitions) {
        this.testTwoPartitions = testTwoPartitions;
    }

    public short getTestOneReplicationFactor() {
        return testOneReplicationFactor;
    }

    public void setTestOneReplicationFactor(short testOneReplicationFactor) {
        this.testOneReplicationFactor = testOneReplicationFactor;
    }

    public short getTestTwoReplicationFactor() {
        return testTwoReplicationFactor;
    }

    public void setTestTwoReplicationFactor(short testTwoReplicationFactor) {
        this.testTwoReplicationFactor = testTwoReplicationFactor;
    }
}
