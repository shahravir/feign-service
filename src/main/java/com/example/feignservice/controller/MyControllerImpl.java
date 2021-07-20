package com.example.feignservice.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

public class MyControllerImpl implements MyController {

    @Override
    public String hello() {
        return "hello from feign-service-v0.MyController.hello";
    }
}
