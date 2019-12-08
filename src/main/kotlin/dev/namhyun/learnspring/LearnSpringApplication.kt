package dev.namhyun.learnspring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LearnSpringApplication

fun main(args: Array<String>) {
	runApplication<LearnSpringApplication>(*args)
}
