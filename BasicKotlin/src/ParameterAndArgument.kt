// name = parameter
fun greeting(name: String){
    println("Welcome, $name")
}

// user 1 = argument
fun main() {
    greeting(name = "user 1")
}