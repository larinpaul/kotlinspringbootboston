package com.example.kotlinspringbootboston

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/hello")
class HelloWorldController {

////    fun helloWorld(): String {
////        return "Hello, this is a REST endpoint!"
////    }
////    // By the way, in Kotlin, you can write this more concisely
//    fun helloWorld(): String = "Hello, this is a REST endpoint!"

    // You can write "/springboot" or "springboot"
//    @GetMapping("/springboot")
    @GetMapping("springboot")
    fun helloWorld(): String = "Hello, this is a REST endpoint!"

    // And if we didn't have the additional argument inside @GetMapping here, the method will just use the path from @RequestMapping
    @GetMapping
    fun defaultHelloWorld(): String = "This is a default thingy, yeah!"

    @GetMapping("/")
    fun defaultWithAForwardSlash(): String = "/ This is a forward slash, yeah!"

    @GetMapping("/afterslash")
    fun afterSlashWord(): String = "And this is like /afterslash, yeah!"

}
