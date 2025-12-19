package LatihanUas

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

//soal
//fun main() = runBlocking {
//    layaniPelanggan ("Budi")
//    layaniPelanggan ("Susi")
//    layaniPelanggan ("Anto")
//}
//
//fun layaniPelanggan(nama: String){
//    runBlocking {
//        println("$nama sedang memesan...")
//        delay(5000)
//        println("$nama selesai dilayani.")
//    }
//}


fun main(): kotlin.Unit = runBlocking {
    launch {
        layaniPelanggan ("Budi")
    }
    launch {
        layaniPelanggan ("Susi")
    }
    launch {
        layaniPelanggan ("Anto")
    }
}

fun layaniPelanggan(nama: String){
    runBlocking {
        println("$nama sedang memesan...")
        delay(5000)
        println("$nama selesai dilayani.")
    }
}