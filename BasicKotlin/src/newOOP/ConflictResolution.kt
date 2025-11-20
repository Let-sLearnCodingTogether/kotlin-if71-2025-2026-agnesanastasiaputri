package newOOP

interface MoveA{
    fun move(){
        print("Move B")
    }
}
interface MoveB{
    fun move(){
        print("Move A")
    }
}

class Human : MoveA, MoveB{
    override fun move() {
        super<MoveA>.move()
        super<MoveB>.move()
    }
}

fun main() {
    val human1 = Human()
    human1.move()
}