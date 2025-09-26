fun sayHello1(firstName : String, lastName : String = "Tanpa lastname"){ //Tanpa lastname = default ny
    println("Hello, $firstName $lastName")
}

fun main() {
    sayHello1("Budi", "123")
    sayHello1("Budi")
}