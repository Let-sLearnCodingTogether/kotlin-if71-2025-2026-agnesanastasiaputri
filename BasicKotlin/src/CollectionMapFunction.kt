fun main() {
    //imutable
    val buah : Map<String, Int> = mapOf(
        "jeruk" to 10,
        "apel" to 3
    )
    println("Size : ${buah.size}")
    println("Is Empty : ${buah.isEmpty()}")
    println("Contains Key : ${buah.containsKey("jeruk")}")
    println("Contanis Value : ${buah.containsValue(10)}")
    println("Get : ${buah.get("aple")}")
    println("Get Or Default ${buah.getOrDefault("pisang", 0)}")
    println(buah.keys)
    println(buah.values)
    println(buah.entries)

    buah.entries.forEach{(key,value) ->
        println("Key : ${key}, value : ${value}")
    }
}