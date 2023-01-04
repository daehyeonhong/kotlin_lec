package lec17

fun main() {
    val str: String = "ABC"
    println(str.lasChar())
}

fun String.lasChar(): Char {
    return this[this.length - 1]
}
