package Exception

data class Barang(val nama: String, var stok: Int)

class StokHabisException(msg: String) : Exception(msg)

fun beliBarang(barang: Barang, jumlahBeli: Int){
    if(jumlahBeli > barang.stok){
        throw StokHabisException("Gagal beli ${barang.nama}. Stok hanya sisa ${barang.stok}")
    } else{
        barang.stok -= jumlahBeli
        println("Berhasil membeli $jumlahBeli ${barang.nama}")
    }
}

fun main() {
    val barang = Barang("laptop", 2)
    try {
        beliBarang(barang,5)
    } catch (error : StokHabisException){
        println(error.message)
    }
}