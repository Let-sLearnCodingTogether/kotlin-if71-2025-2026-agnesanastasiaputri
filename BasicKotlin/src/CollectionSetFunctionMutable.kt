fun main() {
    //Imutable
    val animals : MutableSet<String> = mutableSetOf()
    animals.add("Kucing")
    animals.add("Zebra")
    println(animals)

    animals.remove("Kucing")
    println(animals)

    animals.addAll(listOf("Kambing", "Anjing", "Ikan"))
    println(animals)

    animals.removeAll (listOf("Kambing", "Ikan"))
    println(animals)

    animals.retainAll (listOf("Anjing"))
    println(animals)

    animals.clear()
    println(animals)
}