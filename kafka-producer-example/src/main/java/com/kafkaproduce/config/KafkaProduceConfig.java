package com.kafkaproduce.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaProduceConfig {
	
	@Bean
	public NewTopic createTopic() {
		return new NewTopic("test-demo", 3, (short) 1);
	}

}
