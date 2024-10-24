package com.subhram.myspringboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MySpringBootApplication

fun main(args: Array<String>) {
	runApplication<MySpringBootApplication>(*args)
}
