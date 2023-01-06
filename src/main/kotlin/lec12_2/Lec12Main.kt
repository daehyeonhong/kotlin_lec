package lec12_2

fun main() {
    Person.Factory.newBaby("감자")
}

class Person private constructor(
    var name: String,
    var age: Int
) {
    companion object Factory : Log {
        private const val MIN_AGE = 1
        fun newBaby(name: String): Person {
            return Person(
                name = name,
                age = MIN_AGE
            )
        }

        override fun log() {
            println("나는 PersonClass 의 동행객체(companion object) Factory에요.")
        }
    }
}
