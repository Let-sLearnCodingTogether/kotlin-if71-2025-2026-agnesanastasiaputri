fun fail(message: String): Nothing{
    throw IllegalArgumentException(message)
}

fun main() {
    fail("Terjadi kesalahan fatal!")
}