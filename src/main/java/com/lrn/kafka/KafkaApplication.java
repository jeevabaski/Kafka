package com.lrn.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaApplication {
	public static void main(String[] args) {
		SpringApplication springApplication=new SpringApplication(KafkaApplication.class);
		springApplication.setAdditionalProfiles("kafka"); //kafka Profile always enabled
		springApplication.run(springApplication);
	}
}
