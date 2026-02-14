package com.example.lib.opgave05

fun main(){
    val inventory = Inventory()

    // Her tilføjer vi produkterne til vores class
    inventory.addProduct(Product("Iphone 15 Pro Max", 4))
    inventory.addProduct(Product("Macbook Pro", 5))
    inventory.addProduct(Product("Imac", 6))

    println("Current Inventory:")
    inventory.revealInventory()

    println() // Brugt til at lave større mellemrum i output

    println("Removing Macbook Pro")
    inventory.removeProduct("Macbook Pro")

    println() // Brugt til at lave større mellemrum i output

    println("Updated Inventory")
    inventory.revealInventory()
}