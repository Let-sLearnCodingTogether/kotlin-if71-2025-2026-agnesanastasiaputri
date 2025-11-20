package newOOP

interface Electronic {
    val brand : String
    fun trunOn()
    fun trunOff()
    fun cleanDrive(){
        println("Membersihkan debu dari perangkat $brand")
    }
}

class Fan (override val brand: String) : Electronic{
    override fun trunOn() {
        println("Kipas angin merek $brand berputar")
    }

    override fun trunOff() {
        println("Kipas angin merek $brand berhenti")
    }
}

class SmartLight(override val brand: String) : Electronic{
    override fun trunOn() {
        println("Lampu merek $brand berputar")
    }
    override fun trunOff() {
        println("Lampu merek $brand berhenti")
    }
}

fun main() {
    val kipas1 = Fan("Epson")
    kipas1.trunOn()
    kipas1.trunOff()

    val kipas2 = Fan("LG")
    kipas2.trunOn()
    kipas2.trunOff()

    val lampu = SmartLight("Pilips")
    lampu.trunOn()
    lampu.trunOff()
    lampu.cleanDrive()
}