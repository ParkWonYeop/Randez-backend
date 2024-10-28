package io.rendez.common.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.web.DefaultSecurityFilterChain


@Configuration
@EnableWebSecurity
class SecurityConfig {
    @Bean
    fun securityFilterChain(
        http: HttpSecurity
    ): DefaultSecurityFilterChain = http
        .httpBasic { it.disable() }
        .csrf { it.disable() }
        .authorizeHttpRequests {
            it.anyRequest().permitAll()
        }.build()
}