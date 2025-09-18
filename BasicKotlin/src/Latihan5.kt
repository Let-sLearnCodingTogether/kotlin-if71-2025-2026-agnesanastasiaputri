fun main() {
    var totalBelanja : Double = 0.0
    var item1 : Double = 3.0
    var harga1 : Double = 25000.0

    println("Status Awal -> Total Belanja: Rp " + totalBelanja)

    totalBelanja += (item1*harga1)

    println("Setelah Item A -> Total Belanja: Rp " + totalBelanja)

    var item2 : Double = 2.0
    var harga2 : Double = 15000.0

    totalBelanja += (item2*harga2)

    println("Setelah Item B -> Total Belanja: Rp " + totalBelanja)

    var diskon : Double = 10000.0

    totalBelanja -= diskon

    println("Setelah Diskon -> Total Belanja: Rp " + totalBelanja)

    val biayaLayanan = totalBelanja/100
    totalBelanja += biayaLayanan

    println("Ditambah Biaya Layanan (Rp 950.0) -> Total Belanja: Rp " + totalBelanja )

    println("==================================")
    println("Total Akhir yang harus dibayar: Rp " + totalBelanja)
    println("==================================")



}