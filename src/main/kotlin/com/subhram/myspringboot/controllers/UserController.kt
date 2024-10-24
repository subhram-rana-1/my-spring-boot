package com.subhram.myspringboot.controllers

import com.subhram.myspringboot.entities.User
import com.subhram.myspringboot.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("users")
class UserController(
    @Qualifier("userServiceImpl2") @Autowired private val userService: UserService,
) {
    @GetMapping("/{user-id}")
    fun getUser(
        @PathVariable(name="user-id") userId: String,
        @RequestParam(required = false, name="age") age: Int = -1,
        @RequestHeader(name = "H-name") headerName: String,
        @RequestHeader(name = "H-age") headerAge: Int,
        ): User {
        println("headerName: $headerName")
        println("headerAge: $headerAge")

        return userService.getUser(userId, age)
    }
}
