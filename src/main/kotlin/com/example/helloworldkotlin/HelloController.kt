package com.example.helloworldkotlin

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
class HelloController {

    @GetMapping("/hello")
    fun getHello(): Mono<String> {
        return Mono.just("hello~!")
    }
}