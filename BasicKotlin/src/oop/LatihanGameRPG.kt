package oop

data class GameItem (val id : String, val name: String, val value : Int, val rarity : String)

fun main() {
    val item : List<GameItem> = listOf(
        GameItem("1", "Pedang Besi", 100, "Common"),
        GameItem("2", "Ramuan Kesehatan", 50, "Common"),
        GameItem("3", "Jubah Bayangan", 500, "Epic")
    )


    val cursedSword = item[0].copy(name = "Pedang Besi Terkutuk", value = 250)

    println(cursedSword)
    println(item[0])
}