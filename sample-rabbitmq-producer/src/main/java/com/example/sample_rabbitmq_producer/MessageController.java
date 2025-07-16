package com.example.sample_rabbitmq_producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private RabbitMQSender sender;

    @GetMapping("/send/{msg}")
    public String sendMessage(@PathVariable String msg){
        sender.send(msg);
        return "Sent: "+ msg ;
    }
}
