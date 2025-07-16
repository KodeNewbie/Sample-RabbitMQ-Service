package com.example.sample_rabbitmq_producer;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
    public static final String QUEUE = "demoQueue";

    @Bean
    public Queue queue(){
        return new Queue(QUEUE, false);
    }
}
