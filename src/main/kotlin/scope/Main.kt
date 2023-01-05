package scope

import lec09.Person

fun main() {

}

fun printPerson(person: Person?) {
    person?.let {
        println(person.name)
        println(person.age)
    }
}
