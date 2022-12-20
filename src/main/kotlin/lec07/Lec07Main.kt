package lec07

fun main() {
    parseIntOrThrow("125a")
    println(KotlinFileReader().readFile("./a.txt"))
}

fun parseIntOrThrow(string: String): Int {
    try {
        return string.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 문자열 \"${string}\"은 숫자형이 아닙니다.")
    }
}

fun parseIntOfThrow2(string: String): Int? {
    return try {
        string.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}
