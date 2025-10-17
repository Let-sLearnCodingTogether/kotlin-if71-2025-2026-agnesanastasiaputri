package oop

import java.util.logging.Level

data class GameItem (val id : String, val name: String, val value : Int, val rarity : String)

class Player (val nama: String, var health: Int = 100, var level: Int = 1){
    fun takeDamage(damage: Int) {
        health -= damage
        if (health < 0) {
            health = 0
        }
        println("$nama menerima $damage damage")
    }

    fun levelUp() {
        if (health > 0) {
            level += 1
            health = 100
            println("$nama naik ke level $level!")
        } else {
            println("$nama tidak bisa naik level karena sudah kalah (health = 0)")
        }
    }

    fun showStatus() {
        println("Nama: $nama, Level: $level, Health: $health")
    }
}

fun main() {
    val item : List<GameItem> = listOf(
        GameItem("1", "Pedang Besi", 100, "Common"),
        GameItem("2", "Ramuan Kesehatan", 50, "Common"),
        GameItem("3", "Jubah Bayangan", 500, "Epic")
    )


    val cursedSword = item[0].copy(name = "Pedang Besi Terkutuk", value = 250)

    println(cursedSword)
    println(item[0])


    println("====================================")
    val player = Player("Agnes")

    player.showStatus()

    player.takeDamage(30)
    player.showStatus()

    player.levelUp()
    player.showStatus()


}