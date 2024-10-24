package com.subhram.myspringboot.services

import com.subhram.myspringboot.entities.User
import org.springframework.stereotype.Service


interface UserService {
    fun getUser(userId: String, age: Int): User
}

@Service
class UserServiceImpl1: UserService {
    override fun getUser(userId: String, age: Int): User {
        return User(userId, "Subhram Rana", age, 5.7)
    }
}

@Service
class UserServiceImpl2: UserService {
    override fun getUser(userId: String, age: Int): User {
        return User(userId, "Shyaam", -111, 5.0)
    }
}
