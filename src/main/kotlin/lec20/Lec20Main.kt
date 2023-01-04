package lec20

import lec18.Fruit as Fruit18
import lec19.Fruit as Fruit19

fun main() {
    println(Fruit18("Orange", 2_000))
    println(Fruit19(1L, "Kiwi", 2_300, 4_300))
    val person: Person = Person("감자", 200)
//    val (name, age) = person
    val name = person.component1()
    val age = person.component2()
    println(name + age)
}

data class Person(
    val name: String,
    val age: Int
)
