package lec03


fun main() {
    val number1: Int? = 3
    val number2: Long = number1?.toLong() ?: 0L
    objectObjIsPerson(Person("a", 100))

    val person: Person = Person("lala", 10)
    println("내 이름은 ${person.name} 나이는 ${person.age} 입니다.")
}

fun objectObjIsPerson(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}
