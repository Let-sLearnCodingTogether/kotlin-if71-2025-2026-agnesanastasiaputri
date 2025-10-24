package oop

fun main() {
    val stokBarang = mapOf(
        "Buku" to 45,
        "Pena" to 78,
        "Indomie" to 120,
        "Teh" to 30,
        "Binder" to 12,
        "Kopi" to 55
    )

//    var namaBarangMin = ""
//    var stokMin = Int.MAX_VALUE
//
//    for ((nama, stok) in stokBarang) {
//        if (stok < stokMin) {
//            stokMin = stok
//            namaBarangMin = nama
//        }
//    }
//
//    if (namaBarangMin.isNotEmpty()) {
//        println("Barang dengan stok paling sedikit adalah: $namaBarangMin ($stokMin buah)")
//    } else {
//        println("Tidak ada data stok barang.")
//    }

    val barangStokMin = stokBarang.minByOrNull { it.value }

    if (barangStokMin != null) {
        println("Barang yang perlu direstock adalah: ${barangStokMin.key} (${barangStokMin.value} buah)")
    } else {
        println("Tidak ada data stok barang.")
    }

}


