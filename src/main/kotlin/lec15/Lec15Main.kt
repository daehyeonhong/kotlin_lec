package lec15

fun main() {
    val array: Array<Int> = arrayOf(100, 200)
    for (index in array.indices) {
        println("${index} ${array[index]}")
    }

    for ((index, value) in array.withIndex()) {
        println("${index} ${value}")
    }
    for (withIndex in array.withIndex()) {
        println("${withIndex.index} ${withIndex.value}")
    }
}
