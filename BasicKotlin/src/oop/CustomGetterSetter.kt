package oop

class NilaiUjian(nilaiUts: Double){
    var nilaiUts : Double = nilaiUts //custom getter
        get() = field * 0.1 //backing field, field merujuk ke nilaiUts
        //di custom getter gbs nilaiUts * 0.1 , hrs lwt field
        //kalau pkk nilaiUts, bakal terjadi rekursif

        //setter kalau pkai val gbisa, harus var
        set(value){ //custom setter
            field = if (value < 0) 0.0 else value
        }

    val nilaiAkhir : Double
        get() = nilaiUts * 2
}

fun main() {
    val nilaiMhs1 = NilaiUjian(80.3)
    println(nilaiMhs1.nilaiUts)
    println(nilaiMhs1.nilaiAkhir)

    nilaiMhs1.nilaiUts = -20.0
    println(nilaiMhs1.nilaiUts) //0.0

    nilaiMhs1.nilaiUts = 80.5
    println(nilaiMhs1.nilaiUts) //8.05

}