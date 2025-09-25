fun main() {
    println("Siapa nama kamu?")
    val name = readln()

    println("Berapa umur kamu?")
    val ageInput = readln()
    val age = ageInput.toIntOrNull()

    if (age != null){
        println("Nama kamu : $name")
        println("Umur kamu : $age")
    } else{
        println("Umur tidak valid")
    }
}