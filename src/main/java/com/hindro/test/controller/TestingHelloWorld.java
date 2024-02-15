package com.hindro.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestingHelloWorld {

    @GetMapping("hello-world")
    public String getSayying() {
        return "hello gaes";
    }
}
