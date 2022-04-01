package com.example.controller

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class HystrixFallbackRestController {

    @GetMapping("/api/fallback")
    public Mono<String> getMsg() {
        return Mono.just("No response from Service 1 and will be back shortly");
    }

}