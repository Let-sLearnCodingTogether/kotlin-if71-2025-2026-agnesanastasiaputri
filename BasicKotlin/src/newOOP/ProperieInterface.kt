package newOOP

interface  VechicleProperties{
    val weight : Int
    val name : String
        get() = "Vehicle"
}

class Car() : VechicleProperties{
    override val weight: Int = 1000
}

fun main() {
    val car1 = Car()

    println(car1.weight)
    println(car1.name)
}