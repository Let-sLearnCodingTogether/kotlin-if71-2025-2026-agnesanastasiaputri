fun main() {
    //imutable
    val buah : MutableMap<String, Int> = mutableMapOf(
        "jeruk" to 10,
        "apel" to 3
    )

    buah["jeruk"] = 12
//    buah.put("jeruk") = 20
    println(buah.entries)

    buah.remove("jeruk")
    buah.putAll(mapOf(
        "anggur" to 2
    ))
    println(buah.entries)

    buah.clear()
    println(buah)
}