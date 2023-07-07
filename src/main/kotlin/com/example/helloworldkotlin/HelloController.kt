package com.example.helloworldkotlin

import org.springframework.core.env.Environment
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import reactor.kotlin.core.publisher.toMono

@RestController
class HelloController(
    private val env: Environment
) {

    @GetMapping("/")
    fun index(): Mono<String> {
        return env.activeProfiles.joinToString(", ")
            .toMono()
            .map { "hello-world-kotlin server. active profiles: $it" }
    }

    @GetMapping("/hello")
    fun getHello(): Mono<String> {
        return Mono.just("hello~!")
    }
}