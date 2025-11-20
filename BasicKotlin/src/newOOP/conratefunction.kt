package newOOP

interface SpaceVehicle{
    fun accelerate()

    fun stop(){
        println("Stop")
    }
}

class LightSpace : SpaceVehicle {
    override fun accelerate() {
        println("Accelerate")
    }
    override fun stop(){
        println("Stop Override")
    }
}

fun main() {
    val lightSpaceOne = LightSpace()
    lightSpaceOne.accelerate()
    lightSpaceOne.stop()
}