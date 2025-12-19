package LatihanUas

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("Mulai")
    proses()
    println("Selesai")
}

suspend fun proses() {
    delay(3000)
    println("Download Data")
}