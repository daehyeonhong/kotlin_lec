package lec03


fun main() {
    val number1: Int? = 3
    val number2: Long = number1?.toLong() ?: 0L
    objectObjIsPerson(Person("a", 1))
}

fun objectObjIsPerson(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}
