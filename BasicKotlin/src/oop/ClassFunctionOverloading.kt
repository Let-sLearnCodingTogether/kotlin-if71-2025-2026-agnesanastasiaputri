package oop

class MahasiswaFunctionOverloading(val nama: String){
    fun sayHello(){
        println("Selamat malam $nama")
    }

    fun sayHello(word : String){
        println("$word $nama")
    }
}

fun main() {
    val mahasiswaPertama = MahasiswaFunctionOverloading("Mahasiswa")

    mahasiswaPertama.sayHello()
    mahasiswaPertama.sayHello("selamat pagi")
}