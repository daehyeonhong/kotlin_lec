package lec02

fun main() {
    val person: Person = Person("")
    println(startWithA1(person.name))
}

fun startWithA1(str: String): Boolean {
    return str.startsWith("A")
}
