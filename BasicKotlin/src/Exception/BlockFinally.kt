package Exception

fun validasiUmur3(umur: Int) : Int{
    if (umur < 0){
        throw IllegalArgumentException("Umur tidak boleh negatif")
    }

    return umur
}

fun main() {
    println("Start")
    try {
        validasiUmur3(10)
        validasiUmur3(-3)
    } catch (error : IllegalArgumentException){
        println("Error dengan message ${error.message}")
    } catch (error : ArithmeticException){
        println("Error pembagian dengan 0")
    } catch (error : Exception){
        println("Error tidak diketahui ${error.message}")
    } finally {
        println("Message dari block finally")
    }

    println("Finish")
}