package lec02

fun main() {
    val str: String? = null
    startWith("ABC")
    startWith("BCD")
    startWith(str )
    println(str?.length ?: 0)
    println(startWithA2(str))
    println(startWithA3(str))
    println(startWithA1(str))
}

fun startWithA1(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어왔습니다.")
}

fun startWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun startWith(str: String?): Boolean {
    return str!!.startsWith("A")
}
