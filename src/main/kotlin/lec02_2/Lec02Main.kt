package lec02_2

import java.lang.IllegalArgumentException

fun main() {
    println(startWithA1("APPLE"))
    println(startWithA2("APPLE"))
    println(startWithA3("APPLE"))
}

fun startWithA1(str: String?): Boolean {
    if (str == null) throw IllegalArgumentException("null in")
    return str.startsWith("A")
}

fun startWithA2(str: String?): Boolean? {
    if (str == null) return null
    return str.startsWith("A")
}

fun startWithA3(str: String?): Boolean {
    if (str == null) return false
    return str.startsWith("A")
}
