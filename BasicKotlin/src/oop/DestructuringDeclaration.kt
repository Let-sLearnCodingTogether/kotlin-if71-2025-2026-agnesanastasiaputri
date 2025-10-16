package oop

data class Kendaraan(val merek : String, val tahun : Int)

fun main() {
    val tayo = Kendaraan("Tayo", 2015)
    println(tayo.merek)
    val (merek, tahun) = tayo //baris destructuring
    println(merek)
    println(tahun)
}