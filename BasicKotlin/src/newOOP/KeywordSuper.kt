package newOOP

open class HewanBaru{
    open fun suara(){
        println("Suara hewan")
    }
}

class Bebek() : HewanBaru(){
    override fun suara() {
        super.suara()
        println("Suara bebek : kwek kwek")
    }
}

fun main() {
    val duck = Bebek()
    duck.suara()
}