package com.subhram.myspringboot.aspects

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class Authentication(
    val username: String,
    val password: String,
)
