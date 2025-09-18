fun main() {
    val firstUser: Triple<String, Int, String> = Triple("Agnes", 20, "Informatika")

    //destructuring
    val (username, age, prodi) = firstUser

    println(username)
    println(age)
    println(prodi)

}