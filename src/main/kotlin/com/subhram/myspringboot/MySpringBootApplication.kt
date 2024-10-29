package com.subhram.myspringboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.EnableAspectJAutoProxy

@SpringBootApplication
@EnableAspectJAutoProxy
class MySpringBootApplication


fun main(args: Array<String>) {
	runApplication<MySpringBootApplication>(*args)
	println("hey after runnign applciaiton")
}