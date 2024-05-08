package com.dev.backend.controller;

import org.apache.tools.ant.types.resources.comparators.Date;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")




public class Hello {

    @GetMapping("/")
    public String hello(){
        return "Olá mundo Spring" +new Date();
    }


  
}
