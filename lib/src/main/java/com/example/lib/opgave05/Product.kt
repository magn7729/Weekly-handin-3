package com.example.lib.opgave05

class Product(val name: String, var quantity: Int) {
}

class Inventory {

    private val products = mutableListOf<Product>()

    fun addProduct(product: Product) {
        products.add(product)
    }

    fun removeProduct(name: String) {
        products.removeIf { it.name == name } // Gennemgår listen og fjerner alle produkter hvor betingelsen er true
    }

    fun revealInventory() {
        for (product in products){
            println("${product.name}: ${product.quantity}")
        }
    }
}
