package lec03


fun main() {
    val name = "asd"
    val string = """
        ABC
        DEF
        GHI
        ${name}
    """.trimIndent()
    println(string[0])
    println(string[1])
}
