package lec09

fun main() {
    val person = Person("qwe", 123)
    println(person.name + ", " + person.age)
    person.age = 20
    println(person.name + ", " + person.age)
}

class Person constructor(
    val name: String,
    var age: Int
) {
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age} 일 수 없습니다.")
        }
    }
}
