package Exception

import newOOP.Printer

fun validasiUmur(umur: Int){
    if (umur < 0){
        throw IllegalArgumentException("Umur tidak boleh negatif")
    }

    println("Umur valid $umur")
}

fun main() {
    println("Start")
    validasiUmur(10)
    validasiUmur(-3)
    println("Finish")
}