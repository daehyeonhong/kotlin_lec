package lec08

fun main() {
    println(max(1, 2))
    repeat("Hello, World!", useNewLine = false)
}

fun max(a: Int, b: Int) = if (a > b) a else b

fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true): Unit {
    for (i in 1..num) if (useNewLine) println(str) else print(str)
}
