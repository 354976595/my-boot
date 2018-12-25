package com.example.myboot.mq;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TopicConfig {
    @Bean
    public Object topic(){
        return new ActiveMQTopic("topic");
    }
}
