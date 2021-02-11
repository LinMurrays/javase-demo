package com.boc.database.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/doGetControllerTwo")
    public String doGetControllerTwo(String name, String age) {
        return "name=" + name + "&age=" + age;

    }

}
