// ProductRepository.kt
package com.example.nolimits.data

import com.example.nolimits.domain.Product
import com.example.nolimits.R

class ProductRepository {
    fun getProducts(): List<Product> = listOf(
        Product(1, "Control inalámbrico", 59990.0, R.drawable.ic_controller),
        Product(2, "Audífonos gamer", 39990.0, R.drawable.ic_headphones),
        Product(3, "Figura Spider-Man", 24990.0, R.drawable.ic_spiderman)
    )
}