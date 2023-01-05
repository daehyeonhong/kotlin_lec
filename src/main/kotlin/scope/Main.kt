package scope

import lec09.Person

fun main() {

}

fun printPerson(person: Person?) {
    if (person != null) {
        println(person.name)
        println(person.age)
    }
}
