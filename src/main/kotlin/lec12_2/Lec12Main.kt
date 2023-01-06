package lec12_2

fun main() {
    Person.newBaby("감자")
}

class Person private constructor(
    var name: String,
    var age: Int
) {
    companion object {
        private const val MIN_AGE = 1
        fun newBaby(name: String): Person {
            return Person(
                name = name,
                age = MIN_AGE
            )
        }
    }
}
