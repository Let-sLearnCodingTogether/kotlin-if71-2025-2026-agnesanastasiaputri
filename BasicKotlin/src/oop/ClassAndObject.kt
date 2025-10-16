package oop

//Immutable dan Mutable
class MahasiswaContructor(
    val npm: String,
    val nama: String,
    var ipk: Float
)

fun main() {
    val mahasiswaPertama = MahasiswaContructor(
        "202428250090",
        "mahasiswa 1",
        1.3f
    )

    println(mahasiswaPertama.npm)
    println(mahasiswaPertama.nama)
    println(mahasiswaPertama.ipk)

    //mahasiswaPertama.npm = "ABC"
    mahasiswaPertama.ipk = 1.2f
    println(mahasiswaPertama.ipk)

}