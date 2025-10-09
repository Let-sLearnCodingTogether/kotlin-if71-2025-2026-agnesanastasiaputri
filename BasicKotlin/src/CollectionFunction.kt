fun main() {
    //Imutabel
    val animals : Set<String> = setOf("Zebra", "Kucing")
    println(animals)

    println("Size : ${animals.size}")
    println("Is Empty : ${animals.isEmpty()}")
    println("Constains : ${animals.contains("Kucing")}")
    println("Constains All : ${animals.containsAll(listOf("Zebra"))}")

    val animalIterator = animals.iterator()
    while(animalIterator.hasNext()){
        println("Animal : ${animalIterator.next()}")

    }
}