package com.subhram.myspringboot.aspects
import org.aopalliance.intercept.Joinpoint
import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.springframework.stereotype.Component

@Aspect
@Component
class AuthenticationAspect {
    @Around("@annotation(Authentication)")
    fun runAuthentication(jp: ProceedingJoinPoint) {
        println("before Auth")
        jp.proceed()
        println("after Auth")
    }
}