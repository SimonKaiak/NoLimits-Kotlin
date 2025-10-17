// Product.kt
// Modelo con atributos.

package com.example.nolimits.domain

data class Product(
    val id: Int,
    val name: String,
    val price: Double,
    val imageRes: Int
)