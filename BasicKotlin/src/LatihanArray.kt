fun tampilAngka(angka: Array<Int>) {
    for (item in angka) {
        println(item)
    }
}

fun main() {
    val data = arrayOf(1, 2, 3, 4, 5)
    tampilAngka(data)

    tampilAngka(angka = arrayOf(1, 2))
}