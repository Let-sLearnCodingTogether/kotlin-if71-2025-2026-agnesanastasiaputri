package oop

class MahasiswaConstructorDefaultValue(
    val npm : String,
    val nama : String,
    var ipk : Float = 0.0f
){
    init {
        println("Ini Block Init")
    }
}

fun main() {
    val mahasiswaPertama = MahasiswaConstructorDefaultValue(
        "2024250090",
        "Mahasiswa Pertama"
    )

    val mahasiswaKedua = MahasiswaConstructorDefaultValue(
        "2024250091",
        "Mahasiswa Kedua",
        ipk = 3.4f
    )

    println(mahasiswaPertama.ipk)
    println(mahasiswaKedua.ipk)
}