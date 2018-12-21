package com.example.myboot.activemq;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QueueConfig {
    @Bean
    public ActiveMQQueue activeMQQueue(){
        return new ActiveMQQueue("queue");
    }
}
