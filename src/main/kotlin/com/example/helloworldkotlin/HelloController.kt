package com.example.helloworldkotlin

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
class HelloController {

    @GetMapping("/")
    fun index(): Mono<String> {
        return Mono.just("hello-world-kotlin server")
    }

    @GetMapping("/hello")
    fun getHello(): Mono<String> {
        return Mono.just("hello~!")
    }
}