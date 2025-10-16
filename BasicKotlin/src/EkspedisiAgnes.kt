fun main() {
    val namaPetualang = "Agnes Anastasia Putri"
    var kapasitasTas = 20.0
    var totalBeratBawaan = 0.0

    println("Kalkulator Logistik untuk Ekspedisi Agnes dimulai...")

    var indeks = 1
    var sisaKapasitasTas = kapasitasTas-totalBeratBawaan
    while (totalBeratBawaan < sisaKapasitasTas){

        println("---Memasukkan Barang " + indeks + "---")

        print("Masukkan nama barang: ")
        val namaBarang = readln()

        print("Masukkan berat untuk " + namaBarang + "(kg): ")
        val beratBarang = readln().toDoubleOrNull()?:0.0

        kapasitasTas -= beratBarang
        totalBeratBawaan += beratBarang
        if(totalBeratBawaan > 20){
            println("Bahaya, kelebihan muatan! Berat saat ini " + totalBeratBawaan + " kg. Kapasitas hanya 20 kg.")
            println("Proses kalkulasi logistik selesai")
        }
        else if (totalBeratBawaan == 20.0){
            println("Optimal! Tas milik " + namaPetualang + " sekarang penuh dengan sempurna.")
        }
        else{
            print(namaBarang + " dengan berat " + beratBarang + " kg telah ditambahkan.")
            println("Barang berhasil dimasukkan. Sisa kapasitas tas: " + kapasitasTas + " kg.")
            println()
            indeks += 1
        }
    }
}