package lec17

fun main() {
    val str: String = "ABC"
    println(str.lasChar())

    val person: JavaPerson = JavaPerson("qweqw", 23)
    println(person.nextYearAge())
}

fun String.lasChar(): Char {
    return this[this.length - 1]
}

fun JavaPerson.nextYearAge(): Int {
    println("확장 함수")
    return this.age + 1
}
