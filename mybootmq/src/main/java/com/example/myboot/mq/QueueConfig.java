package com.example.myboot.mq;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QueueConfig {
    @Bean
    public ActiveMQQueue activeMQQueue(){
        return new ActiveMQQueue("queue");
    }
}
