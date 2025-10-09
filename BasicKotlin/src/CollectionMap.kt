fun main() {
    //imutable
    val buah : Map<String, Int> = mapOf(
        "jeruk" to 10,
        "apel" to 3
    )
    println(buah["jeruk"])

    //Mutable
    val buah2 : MutableMap<String, Int> = mutableMapOf(
        "jeruk" to 10,
        "apel" to 3
    )
    println(buah["apel"])
}