package com.example.sample_rabbitmq_producer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send (String message){
        amqpTemplate.convertAndSend(RabbitMQConfig.QUEUE, message);
        System.out.println("Sent: " + message);
    }

}
