package lec02_2

import java.lang.IllegalArgumentException

fun main() {
    println(startWithA1("APPLE"))
    println(startWithA2("APPLE"))
    println(startWithA3("APPLE"))

    var str: String? = "ABC"
//    println(str.length) -> str에 null이 있을 수 있기 때문에 오류
    println(str?.length)
    str = null
    println(str?.length)
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
