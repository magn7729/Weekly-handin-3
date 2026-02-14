
/* // AI version
open class Vehicle(
    var brand: String,
    var speed: Int
) {
    fun accelerate() {
        speed += 10
        println("$brand speeds up to $speed km/h")
    }

    open fun honk() {
        println("Beep!")
    }
}

class Car(
    brand: String,
    speed: Int,
    var fuelLevel: Int
) : Vehicle(brand, speed) {

    override fun honk() {
        println("$brand goes: HONK HONK!")
    }
}

class Bike(
    brand: String,
    speed: Int,
    var bellSound: String
) : Vehicle(brand, speed) {
}


// ------------ Manager ---------------

class TrafficManager {

    val vehicles: MutableList<Vehicle> = mutableListOf()

    fun register(vehicle: Vehicle) {
        vehicles.add(vehicle)
    }

    fun updateTraffic() {
        for (v in vehicles) {
            v.accelerate()

            if (v is Car) {
                v.fuelLevel -= 5
                println("${v.brand} fuel left: ${v.fuelLevel}")
            }

            if (v is Bike) {
                println("${v.brand} rings the bell: ${v.bellSound}")
            }

            if (v.speed > 120) {
                println("${v.brand} is going too fast!")
            }
        }
    }
}

 */

// Forbedret version
package com.example.lib.opgave06

open class Vehicle(
    var brand: String,
    var speed: Int
) {
    fun accelerate() {
        speed += 10
        println("$brand speeds up to $speed km/h")
    }

    open fun honk() {
        println("Beep!")
    }

    open fun update(){ // Inddrager polymorfi her for at at forskellige objekter kan reagere forskelligt på den samme funktion.
        accelerate()
    }
}

class Car(
    brand: String,
    speed: Int,
    fuelLevel: Int
) : Vehicle(brand, speed) {

    var fuelLevel: Int = fuelLevel // Inddrager Encapsulation -> Det beskytter dataen. Det gør man kun kan læse dataen udefra men ikke direkte sætte den.
        private set

    override fun honk() {
        println("$brand goes: HONK HONK!")
    }

    // Inddrager igen polymorfi her så Car selv styrer sin logik i stedet for at TrafficManager gør det
    override fun update() {
        accelerate()
        fuelLevel -= 5
        println("$brand fuel left: $fuelLevel")
    }
}

class Bike(
    brand: String,
    speed: Int,
    var bellSound: String
) : Vehicle(brand, speed) {

    // Inddrager polymorfi her så Bike selv styrer sin logik
    override fun update() {
        accelerate()
        println("$brand rings the bell: $bellSound")
    }
}


// ------------ Manager ---------------

class TrafficManager {

    // Inddrager igen her Encapsulation for at man ikke kan ændre dataen direkte udefra
    private val vehicles: MutableList<Vehicle> = mutableListOf()

    fun register(vehicle: Vehicle) {
        vehicles.add(vehicle)
    }

    fun updateTraffic() {
        for (v in vehicles) {

            // Kalder update() så den rigtige metode bliver valgt automatisk (polymorfi)
            v.update()

            if (v.speed > 120) {
                println("${v.brand} is going too fast!")
            }
        }
    }
}
