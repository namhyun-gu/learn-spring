package dev.namhyun.learnspring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@EnableJpaAuditing
@SpringBootApplication
class LearnSpringApplication

fun main(args: Array<String>) {
    runApplication<LearnSpringApplication>(*args)
}
