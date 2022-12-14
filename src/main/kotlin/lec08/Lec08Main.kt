package lec08

fun main() {
    println(max(1, 2))
    repeat("Hello, World!", useNewLine = false)
    printNameAndGender(name = "방구", gender = "뿡")
    val array: Array<String> = arrayOf("A", "B", "C")
    printAll(*array)
}

fun max(a: Int, b: Int) = if (a > b) a else b

fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true): Unit {
    for (i in 1..num) if (useNewLine) println(str) else print(str)
}

fun printNameAndGender(name: String, gender: String): Unit {
    println(name)
    println(gender)
}

fun printAll(vararg strings: String): Unit {
    for (string in strings) {
        println(string)
    }
}
