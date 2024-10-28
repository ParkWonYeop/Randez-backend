package io.rendez

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RandezBackendApplication

fun main(args: Array<String>) {
    runApplication<RandezBackendApplication>(*args)
}
