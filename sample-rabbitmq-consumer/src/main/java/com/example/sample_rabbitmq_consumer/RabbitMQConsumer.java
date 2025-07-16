package com.example.sample_rabbitmq_consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumer {

    @RabbitListener(queues = RabbitMQConfig.QUEUE)
    public void receive(String msg){
        System.out.println("Received : " + msg );
    }
}
