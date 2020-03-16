package com.demo4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/demo")
    public String hello(){
        return "hello,demo4";
   }

    @PostMapping("/demo2")
    public Object hello2(){
        Map map=new HashMap();
        map.put("test","demo4");
        return map;
    }

    @GetMapping("/health")
    public String heath()
    {
        return "ok";
    }
}
