package oop

class Karyawan(val nama : String, val id : String, val gajiPokok : Double){
    fun tampilkanProfil(): Unit {
        println("Nama: $nama")
        println("Id: $id")
    }

    fun hitungGajiBulanan(jumlahHariMasuk : Int) : Double{
        val gajiBulanan = jumlahHariMasuk/22.0*gajiPokok
        return gajiBulanan
    }
}

fun main() {
    val karyawanA = Karyawan(
        "Agnes", "123", 4500000.0
    )

    val karyawanB = Karyawan(
        "Bernard", "456", 4500000.0
    )

    karyawanA.tampilkanProfil()
    println("Gaji: Rp " + karyawanA.hitungGajiBulanan(20))
    println()
    karyawanB.tampilkanProfil()
    println("Gaji: Rp " + karyawanB.hitungGajiBulanan(22))
}