package com.example.myboot.controller;

import com.example.myboot.mapper.ArticleMapper;
import com.example.myboot.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.*;
import java.util.List;

@RestController
public class ActivemqSenderController {
    @Autowired
    private JmsTemplate jmsTemplate;
    @Autowired
    private ArticleMapper userService;

    @RequestMapping("/sendMessage/{value}")
    public String sendMessage(@PathVariable(value = "value")String value){
        List<Article> res = userService.getAll();
        for (Article re : res) {
            System.out.println(re);
        }
        jmsTemplate.send(value, session -> {
            TextMessage message = session.createTextMessage();
            message.setText("hello test0"+value);
            System.out.println(value);
            return message;
        });
        return "sendMessage";
    }
}
