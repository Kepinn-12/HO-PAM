// Hands-on 1: Class & Inheritance
// Tugas: Buat hierarki class kendaraan menggunakan open class, primary constructor,
// dan override fungsi. Vehicle adalah base class, Car dan Motorcycle adalah turunannya.


open class Vehicle(val name: String, val maxSpeed: Int) {
    open fun describe(): String {
        return "$name dapat melaju hingga $maxSpeed km/h"
    }
}


class Car(name: String, val numberOfDoors: Int) : Vehicle(name, 180) {
    override fun describe(): String { 
        return "$name dapat melaju hingga $maxSpeed km/h dan punya $numberOfDoors pintu"
    }
}


class Motorcycle(name: String, val hasSidecar: Boolean) : Vehicle(name, 220) {
    override fun describe(): String { 
        var cek : String = if (hasSidecar) "dengan sidecar" else "tanpa sidecar"
        
        return "$name dapat melaju hingga $maxSpeed km/h $cek"
    }
}

fun main() {
    val vehicles = listOf<Vehicle>(
        Car("Toyota", numberOfDoors = 4), 
        Motorcycle("Ninja", hasSidecar = false)
    )

    // Polymorphism: setiap elemen dipanggil lewat interface Vehicle,
    // tapi describe() yang jalan adalah versi milik subclass masing-masing.
    vehicles.forEach { println(it.describe()) }
}
