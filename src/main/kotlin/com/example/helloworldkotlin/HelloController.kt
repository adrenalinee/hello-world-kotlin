package com.example.helloworldkotlin

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import kotlin.RuntimeException

@RestController
class HelloController {

    @GetMapping("/hello")
    fun getHello(): Mono<String> {
        return Mono.just("hello~!")
    }

    @GetMapping("/error")
    fun getError(): Mono<String> {
        return Mono.error { RuntimeException("error!") }
    }
}