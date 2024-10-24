package com.subhram.myspringboot.controllers

import com.subhram.myspringboot.ProductCategory
import com.subhram.myspringboot.entities.Product
import com.subhram.myspringboot.entities.User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("products")
class ProductController {
    @GetMapping("")
    fun getProduct(
        @RequestParam(name = "product-id", required = true,) productId: String,
        @RequestBody(required = true) product: Product,
        ): Product {
        return Product(
            productId,
            product.name,
            product.category,
            product.description,
        )
    }
}
