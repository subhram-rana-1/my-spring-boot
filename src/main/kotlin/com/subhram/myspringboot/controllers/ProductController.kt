package com.subhram.myspringboot.controllers

import com.subhram.myspringboot.aspects.Authentication
import com.subhram.myspringboot.configurations.MyBean
import com.subhram.myspringboot.configurations.MyComponent
import com.subhram.myspringboot.entities.Product
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("products")
class ProductController(
    @Autowired val myBean: MyBean,
    @Autowired val myComponent: MyComponent,
) {
    @Authentication(username = "my username", password = "my pass")
    @GetMapping("")
    fun getProduct(
        @RequestParam(name = "product-id", required = true,) productId: String,
        @RequestBody(required = true) product: Product,
        ): Product {
        println("Before getting the product, here is myBeans's defautl name: ${myBean.defaultName}")
        println("Before getting the product, here is myComponent's method name:")
        myComponent.showMessage()

        return Product(
            productId,
            product.name,
            product.category,
            product.description,
        )
    }
}
