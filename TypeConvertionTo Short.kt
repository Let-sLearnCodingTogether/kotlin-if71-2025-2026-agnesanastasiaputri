fun main() {
    val myInt : Int = 30000
    val myShort : Short = myInt.toShort()

    println(myShort)

    val myInt2 : Int = 40000
    val myshort2 : Short = myInt2.toShort()

    println(myshort2)

    println(Integer.toBinaryString(myInt2).padStart(length = 32, padChar = '0'))
    //Biner dari 40_000 = 10011100 01000000 (rentang 16 bit)
    //Karena awalan 1 maka hasil akhir pasti negatif
    //lakukan invert biner
    //01100011 10111111
    //Convert ke desimal
    //25536 adalah bilangan desimal
    //karena biner awal dimulai dari 1 maka hasil convert adalah negatif
    //jadi hasil convert int(32 bit) menjadi short (16 bit) adalah -25536
}