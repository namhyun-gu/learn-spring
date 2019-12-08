package dev.namhyun.learnspring.hello

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @RequestMapping("/hello")
    fun hello(): String {
        return "Hello World!"
    }
}