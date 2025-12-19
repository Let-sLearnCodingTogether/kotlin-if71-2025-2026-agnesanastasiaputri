package LatihanUas

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("Mulai")

    launch {
        downloadData()
    }
    println("Selesai")
}

suspend fun downloadData () {
    delay(3000)
    println("Download Data")
}