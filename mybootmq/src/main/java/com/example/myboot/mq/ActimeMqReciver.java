package com.example.myboot.mq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ActimeMqReciver {
    @JmsListener(destination = "topic")
    public void receiveTopic(String message) {
        System.out.println("监听topic=============监听topic");
        System.out.println(message);

    }

    @JmsListener(destination = "queue")
    public void receiveQueue(String message) {
        System.out.println("监听queue=============监听queue");
        System.out.println(message);

    }
}
