fun main() {
    val ages : Array<Int> = arrayOf(25, 20, 23, 34)

    println("Sum : ${ages.sum()}")
    println("Average : ${ages.average()}")
    println("Max or Null : ${ages.maxOrNull()}")
    println("Min or Null : ${ages.minOrNull()}")
    println("Count : ${ages.count()}")
}