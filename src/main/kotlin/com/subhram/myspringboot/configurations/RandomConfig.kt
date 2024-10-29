package com.subhram.myspringboot.configurations

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Component


class MyBean(
    @Autowired val defaultName: String,
)

@Component
class MyComponent {
    fun showMessage() {
        println("Here is show message method for MyComponent class")
    }
}

@Configuration
class RandomConfig {
    @Value("\${default_name}")
    lateinit var defaultName: String

    @Bean
    fun getDefaultMyBean():MyBean {
        println("Calling RandomConfig.getDefaultMyBean() method which is a @Bean method")
        return MyBean(defaultName)
    }
}
