fun main() {
    val hari : Array<String> = arrayOf("Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu")
    println("Jumlah hari : ${hari.size}")

    println("Hari pertama : " + hari[0])

    println("Hari terakhir : " + hari[hari.size-1])

    hari.set(5, "Jum'at Barokah")
    println(hari[5])

}