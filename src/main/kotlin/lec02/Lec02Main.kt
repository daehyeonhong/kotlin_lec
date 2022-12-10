package lec02

fun main() {
    val person: Person = Person("")
    println(person.name?.let { startWithA1(it) })
}

fun startWithA1(str: String): Boolean {
    return str.startsWith("A")
}
