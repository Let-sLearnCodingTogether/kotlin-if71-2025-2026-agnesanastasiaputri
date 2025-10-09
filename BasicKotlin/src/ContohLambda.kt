fun main() {
    val daftarMahasiswa = listOf(
        Pair("Budi", 3.8),
        Pair("Ani", 3.5),
        Pair("Doni", 3.7)
    )

    for (daftarMahasiswa in daftarMahasiswa){
        println("Daftar Mahasiswa : $daftarMahasiswa")
    }

    println("===================")
    for (daftarMahasiswa in daftarMahasiswa){
        println("Mahasiswa : ${daftarMahasiswa.first}, waktu : ${daftarMahasiswa.second}")
    }

    println("===================")
    for (daftarMahasiswa in daftarMahasiswa){
        if (daftarMahasiswa.second > 3.5){
            print(daftarMahasiswa.first + " ")

        }
    }

    println()

    println("===================")

    //lambda
    val mahasiswaCumlaude = daftarMahasiswa
        .filter { it.second > 3.5 }
        .map { it.first }

    println(mahasiswaCumlaude)
}