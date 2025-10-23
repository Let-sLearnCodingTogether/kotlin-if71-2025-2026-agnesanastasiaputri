package oop

class Mahasiswa {
    var ipk: Double = 0.0
        set(value) {
            field = when {
                value < 0.0 -> 0.0
                value > 4.0 -> 4.0
                else -> value
            }
        }
}

fun main() {

    val mhs = Mahasiswa()
    mhs.ipk = 4.5
    println("IPK Mahasiswa (set 4.5): ${mhs.ipk}")
    mhs.ipk = -2.0
    println("IPK Mahasiswa (set -2.0): ${mhs.ipk}")
    mhs.ipk = 3.5
    println("IPK Mahasiswa (set 3.5): ${mhs.ipk}")
}