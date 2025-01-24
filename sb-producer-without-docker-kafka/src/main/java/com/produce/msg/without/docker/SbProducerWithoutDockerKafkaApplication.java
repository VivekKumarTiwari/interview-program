package com.produce.msg.without.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbProducerWithoutDockerKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbProducerWithoutDockerKafkaApplication.class, args);
	}

}
