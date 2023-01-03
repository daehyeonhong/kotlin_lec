package lec16

fun main() {
    val list: List<Int> = listOf(100, 200)
    val eList: List<Int> = emptyList<Int>()
    printNumbers(emptyList())
}

private fun printNumbers(numbers: List<Int>): Unit {
    println(numbers)
}
