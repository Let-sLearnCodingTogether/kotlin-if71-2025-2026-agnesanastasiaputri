fun main() {
    var student : String = "Budii"

    println(student)

//    student = null

    var prodiIf : String? = "IF" //klo mau null pkk ? disblh tipe data
    println(prodiIf?.length)

    var prodiSi : String? = null
    println(prodiSi?.length) //safecall operator

    var prodiAk : String? = "Akuntansi" //klo ad isi maka dijalankan
    println(prodiAk ?: "Tanpa Prodi") //klo var prodiAk null, bawah yg dijalankan

    var token : String? = null
    println(token!!.length)

    var email : String? = "email"
    if(email != null) {
        println(email.length)
    }
}