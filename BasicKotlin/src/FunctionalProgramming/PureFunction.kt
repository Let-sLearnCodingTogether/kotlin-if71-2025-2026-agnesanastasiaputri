package FunctionalProgramming

//contoh yg pure function
fun addPureFunction(a: Int, b: Int) : Int = a + b

//contoh impure function
var count = 0 //anggap saja ini global variable
fun addImpureFunction(a : Int) : Int{
    count += 1
    return a + count
}

fun main() {
    println(addPureFunction(1, 2)) //3
    println(addPureFunction(1, 2)) //3
    println(addPureFunction(1, 2)) //3

    println()
    println(addImpureFunction(1))
    println(addImpureFunction(1))
}