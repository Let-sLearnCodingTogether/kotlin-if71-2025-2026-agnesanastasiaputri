package newOOP

interface Wheeled{
    val numberOfWheeled : Int
}

interface Vehicle1{
    fun drive()
}

class SepedaRodaTiga(override val numberOfWheeled: Int) : Wheeled, Vehicle1{
    override fun drive() {
        print("Sepeda bergerak")
    }
}

fun main() {
    val sepedaRodaTiga1 = SepedaRodaTiga(3)
    sepedaRodaTiga1.drive()
}