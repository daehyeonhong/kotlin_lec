package lec02

fun main() {

}

fun startWithA1(str: String?): Boolean {
    if (str == null) throw IllegalArgumentException("null이 들어왔습니다.")
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
