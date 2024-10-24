package com.subhram.myspringboot.entities

import com.subhram.myspringboot.ProductCategory


data class Product(
    val id: String,
    val name: String,
    val category: ProductCategory,
    val description: String,
)
