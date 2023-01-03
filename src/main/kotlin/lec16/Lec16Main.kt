package lec16

fun main() {
    val list: List<Int> = listOf(100, 200)
    val eList: List<Int> = emptyList<Int>()
    printNumbers(emptyList())
    println(list[0])
    for (i in list) {
        println(i)
    }
    val mutableList: MutableList<Int> = mutableListOf(100, 200)
    mutableList.add(103)
}

private fun printNumbers(numbers: List<Int>): Unit {
    println(numbers)
}
