package com.example.myboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ResourceViewResolverController {
    @RequestMapping("/viewResolverTest")
    public String test(){
         return "index";
    }
}
