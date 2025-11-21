package Exception

fun validasiUmur2(umur: Int) : Int{
    if (umur < 0){
        throw IllegalArgumentException("Umur tidak boleh negatif")
    }

    return umur / 0
}

fun main() {
    println("Start")
    try {
        validasiUmur2(10)
        validasiUmur2(-3)
    } catch (error : IllegalArgumentException){
        println("Error dengan message ${error.message}")
    } catch (error : ArithmeticException){
        println("Error pembagian dengan 0")
    } catch (error : Exception){
        println("Error tidak diketahui ${error.message}")
    }

    println("Finish")
}