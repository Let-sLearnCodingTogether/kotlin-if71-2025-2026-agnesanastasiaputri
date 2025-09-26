fun hitungPanjangNama(name: String?): Int = name?.length ?: 0

fun main() {
    println(hitungPanjangNama(null))
    println(hitungPanjangNama("Agnes"))
}
