package com.example.lib.opgave06
/* // AI version
fun main() {
    val manager = TrafficManager()
    manager.register(Car("Toyota", 50, fuelLevel = 80))
    manager.register(Bike("Giant", 20, bellSound = "Ring ring!"))

    manager.updateTraffic()
}

 */

// Forbedret version

fun main() {
    val manager = TrafficManager()

    manager.register(Car("Toyota", 50, fuelLevel = 80))
    manager.register(Bike("Giant", 20, bellSound = "Ring ring!"))

    manager.updateTraffic()
}