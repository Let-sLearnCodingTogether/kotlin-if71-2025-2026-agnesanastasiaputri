package newOOP

enum class DayOfTheWeek{
    Senin,
    Selas,
    Rabu,
    Kamis,
    Jumat,
    Sabtu,
    Minggu
}

fun main() {
    val days = DayOfTheWeek.values()

    days.forEach {
        println("${it.ordinal}.${it.name}")
    }
    println(DayOfTheWeek.valueOf("Senin"))
    //println(DayOfTheWeek.valueOf("senin")) //return nya exception

    val today =  DayOfTheWeek.valueOf("Senin")

    when(today){
        DayOfTheWeek.Senin -> println("Yah, senin lagi")
        DayOfTheWeek.Selas -> println("Yah, selasa lagi")
        DayOfTheWeek.Rabu -> println("Yah, rabu lagi")
        DayOfTheWeek.Kamis -> println("Yah, kamis lagi")
        DayOfTheWeek.Jumat -> println("Yah, jumat lagi")
        DayOfTheWeek.Sabtu -> println("Yah, sabtu lagi")
        DayOfTheWeek.Minggu -> println("Yah, minggu lagi")
    }
}