package lec08

fun main() {
    println(max(1, 2))
}

fun max(a: Int, b: Int): Int = if (a > b) a else b
