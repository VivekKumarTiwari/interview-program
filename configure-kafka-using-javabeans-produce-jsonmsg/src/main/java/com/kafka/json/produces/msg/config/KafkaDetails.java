package com.kafka.json.produces.msg.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "kafka")
public class KafkaDetails {

    private String bootstrapServers;
    private String topicName;

    private Integer partitions;

    public String getBootstrapServers() {
        return bootstrapServers;
    }

    public void setBootstrapServers(String bootstrapServers) {
        this.bootstrapServers = bootstrapServers;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public Integer getPartitions() {
        return partitions;
    }

    public void setPartitions(Integer partitions) {
        this.partitions = partitions;
    }

    public short getReplicationFactors() {
        return replicationFactors;
    }

    public void setReplicationFactors(short replicationFactors) {
        this.replicationFactors = replicationFactors;
    }

    private short replicationFactors;




}
