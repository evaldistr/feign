package com.example.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("discoveryClient")
public interface GreetingClient {
    @RequestMapping("/greeting")
    String greeting();
}