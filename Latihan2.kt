import java.math.BigInteger

fun main() {
    val idProduct: Long = 9876543210L
    val hargaProduk: Float = 3499990.50F
    val beratProdukKg: Float = 0.15F
    val jumlahStok: UByte = 250u
    val jumlahTerjual: Int = 1843
    val kodeKategori: Byte = 101
    val tahunRilis: Int = 2025

    println("idProduct: $idProduct")
    println("hargaProduk: $hargaProduk")
    println("beratProdukKg: $beratProdukKg")
    println("jumlahStok: $jumlahStok")
    println("jumlahTerjual: $jumlahTerjual")
    println("kodeKategori: $kodeKategori")


//    // Validasi kodeKategori tidak lebih dari 100
//    if (kodeKategori > 100) {
//        println("kodeKategori melebihi batas yang diizinkan (lebih dari 100).")
//    } else {
//        println("kodeKategori: $kodeKategori")
//    }

    println("tahunRilis: $tahunRilis")
}
