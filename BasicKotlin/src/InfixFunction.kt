//infix fun String.to(type: String) : String{
//    if (type == "upper"){
//        return this.uppercase()
//    }
//
//    return this.lowercase()
//}
//
//fun main() {
//    println("Hello world" to "upper")
//    println("Hello word" to "lower")
//}

fun main() {
    val daftarJudulBuku = mutableListOf(
        "Laskar Pelangi",
        "Bumi Manusia",
        "Filosofi Teras",
        "Laskar Pelangi"
    )

    val koleksiGenre = mutableSetOf(
        "Novel",
        "Filsafat",
        "Sejarah",
        "Novel"
    )

    val inventarisBuku = linkedMapOf(
        "978-602-03-8591-6" to "Laskar Pelangi",
        "978-979-3062-79-2" to "Bumi Manusia",
        "978-602-06-3534-7" to "Filosofi Teras"
    )

    println("--- 1. Inisialisasi Data ---")
    println("List judul buku berhasil dibuat (mengandung duplikat).")
    println("Set genre berhasil dibuat (hanya berisi nilai unik).")
    println("Map inventaris buku berhasil dibuat (key unik).")
    println("----------------------------------")
    println()
    println("--- 2. Manipulasi dan Analisis Data ---")
    val judul = inventarisBuku["978-979-3062-79-2"]
    println("Judul buku dengan ISBN 978-979-3062-79-2 adalah: $judul")
    inventarisBuku["978-623-91289-8-2"] = "Atomic Habits"
    println("Buku baru 'Atomic Habits' berhasil ditambahkan.")
    println("Isi inventaris sekarang: $inventarisBuku")
    println("Jumlah genre unik yang ada di toko: ${koleksiGenre.size}")
    println()
    println("Daftar semua judul buku yang tercatat:")
    daftarJudulBuku.forEach { println("- $it") }
    println("----------------------------------")
}