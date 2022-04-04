package com.example.controller

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class FallbackRestController {

    @GetMapping("/api/fallback")
    Single<String> getMsg() {
        return Single.just("No response from Service 1 and will be back shortly");
    }

}