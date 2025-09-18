fun main() {
    val firstUser : Pair<String, Int> = Pair (first = "User 1", second = 20)
    println(firstUser.first)
    println(firstUser.second)

    val secondUser : Pair <String, Int> = "User 2" to 20
    println(secondUser.first)
    println(secondUser.second)
}