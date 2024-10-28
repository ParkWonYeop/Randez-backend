package io.rendez

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.servlet.config.annotation.EnableWebMvc

@EnableWebMvc
@SpringBootApplication
class RandezBackendApplication

fun main(args: Array<String>) {
    runApplication<RandezBackendApplication>(*args)
}
