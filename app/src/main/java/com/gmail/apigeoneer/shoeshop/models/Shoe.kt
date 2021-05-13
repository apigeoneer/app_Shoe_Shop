package com.gmail.apigeoneer.shoeshop.models

data class Shoe(
    var name: String,
    var size: String,
    var brand: String,
    var description: String,
    val images: List<String> = mutableListOf()
)