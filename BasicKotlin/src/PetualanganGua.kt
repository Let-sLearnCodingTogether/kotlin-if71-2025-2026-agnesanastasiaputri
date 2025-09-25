fun main() {
    println("Masukkan nama pemain:")
    val namaPemain = readln()

    var kesehatanPemain = 100
    var punyaKunciEmas = false
    var jumlahPotion = 2
    var sedangBermain = true

    while (sedangBermain) {
        println("\nStatus pemain $namaPemain kesehatan $kesehatanPemain potion $jumlahPotion")

        if (kesehatanPemain <= 0) {
            println("Kamu kalah, kesehatanmu sudah habis.")
            break
        }

        println("\nDi depan kamu terdapat 2 buah jalur:")
        println("1). Jalur gelap dan seram")
        println("2). Jalur tenang dan sunyi")
        print("Pilih jalur (1/2): ")
        val jalur = readLine()

        if (jalur == "1") {
            println("Kamu berada di sebuah ruangan dengan tiga patung: naga, griffin, dan ular.")
            print("Pilih patung (naga/griffin/ular): ")
            val pilihanPatung = readLine()?.lowercase()

            when (pilihanPatung) {
                "naga" -> {
                    println("Naga mengeluarkan api! Kesehatan berkurang 35.")
                    kesehatanPemain -= 35
                }
                "griffin" -> {
                    println("Kamu mendapatkan kunci emas!")
                    punyaKunciEmas = true
                }
                "ular" -> {
                    println("Ular menggigitmu! Kesehatan berkurang 15.")
                    kesehatanPemain -= 15
                }
                else -> {
                    println("Kamu tidak memilih patung yang tersedia. Tidak terjadi apa-apa.")
                }
            }

            if (jumlahPotion > 0 && kesehatanPemain > 0) {
                print("Mau gunakan potion untuk memulihkan 10 HP? (y/n): ")
                val pakaiPotion = readLine()
                if (pakaiPotion == "y") {
                    kesehatanPemain += 10
                    kesehatanPemain = kesehatanPemain.coerceAtMost(100)
                    jumlahPotion--
                    println("Kesehatanmu sekarang: $kesehatanPemain")
                }
            }
        } else if (jalur == "2") {
            println("Jalur tenang dan sunyi ternyata jebakan! Kesehatanmu berkurang 25.")
            kesehatanPemain -= 25
        } else {
            println("Jalur yang kamu pilih tidak ada, tidak terjadi apa-apa.")
        }

        println("\nKamu sampai di pintu terakhir...")
        if (punyaKunciEmas) {
            println("Kamu menggunakan kunci emas dan menemukan artefak kuno!")
            println("Permainan selesai! Kamu menang!")
            sedangBermain = false
        } else {
            println("Pintu terkunci dan membutuhkan kunci emas. Kamu harus mencari lagi.")
        }

    }
}
