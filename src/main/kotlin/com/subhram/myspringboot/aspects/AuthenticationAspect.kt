package com.subhram.myspringboot.aspects
import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.springframework.stereotype.Component

@Aspect
@Component
class AuthenticationAspect {
    @Around("@annotation(Authentication)")
    fun runAuthentication(jp: ProceedingJoinPoint): Any? {
        println("before Auth")
        val a = jp.proceed()
        println("after Auth")

        return a
    }
}