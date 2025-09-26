fun printUser(firstName : String, vararg users : String){
    for (user in users){
        println(user)
    }
}

fun main() {
    printUser("Test", "User 1", "User 2") //parameter slain vararg harus di depan
}