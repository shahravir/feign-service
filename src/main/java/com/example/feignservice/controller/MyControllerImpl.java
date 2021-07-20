package com.example.feignservice.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyControllerImpl implements MyController {

    @Override
    public String hello() {
        return "hello from feign-service-v0.MyController.hello";
    }
}
