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

    val mutableSet: MutableSet<Long> = mutableSetOf(100L)

    val oldMap: MutableMap<Int, String> = mutableMapOf()
    oldMap[1] = "MONDAY"
    oldMap.put(2, "TUESDAY")
    val newMap: Map<Int, String> = mapOf(1 to "MONDAY", 2 to "TUESDAY")
    for (key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    for ((key, value) in oldMap.entries) {
        println(key)
        println(value)
    }
}

private fun printNumbers(numbers: List<Int>): Unit {
    println(numbers)
}
