package newOOP

open class Pegawai(val nama : String, val gajiDasar : Double){
    open fun hitungGaji(){
        println(gajiDasar)
    }
}

open class Manager(nama: String, gajiDasar: Double) : Pegawai(nama, gajiDasar){
    final override fun hitungGaji(){
        println(gajiDasar+500000.0)
    }
}

open class Programmer(nama: String, gajiDasar: Double) : Pegawai(nama, gajiDasar){
    final override fun hitungGaji(){
        println(gajiDasar+800000.0)
    }
}

fun main() {
    val budi = Manager("Budi", 5000000.0)
    budi.hitungGaji()

    val thomas = Programmer("Thomas", 5000000.0)
    thomas.hitungGaji()


    println("////////////////////////////////////////")
    val daftarPegawai: List<Pegawai> = listOf(
        Manager("Budi", 5_000_000.0),
        Programmer("Thomas", 5_000_000.0)
    )

    for (pegawai in daftarPegawai) {
        pegawai.hitungGaji()
    }
}