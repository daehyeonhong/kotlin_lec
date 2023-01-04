package lec17

fun main() {
    val str: String = "ABC"
    println(str.lasChar())

    val person: JavaPerson = JavaPerson("qweqw", 23)
    println(person.nextYearAge())

    val train: Train = Train()
    val srt1: Train = Srt()
    val srt2: Srt = Srt()
    train.isExpensive()
    srt1.isExpensive()
    srt2.isExpensive()
    3 add 2 // infix function
    createPerson("gam", "ja")
    createPersonWithInline("gogum", "s")
}

fun String.lasChar(): Char {
    return this[this.length - 1]
}

fun JavaPerson.nextYearAge(): Int {
    println("확장 함수")
    return this.age + 1
}

open class Train(
    val name: String = "새마을기차",
    val price: Int = 5_000
)

fun Train.isExpensive(): Boolean {
    println("Train의 확장 함수")
    return this.price >= 10_000
}

class Srt : Train("SRT", 40_000)

fun Srt.isExpensive(): Boolean {
    println("Srt의 확장 함수")
    return this.price >= 10_000
}

infix fun Int.add(other: Int): Int {
    return this + other
}

fun createPerson(firstName: String, lastName: String): JavaPerson {
    if (firstName.isEmpty()) throw IllegalArgumentException("firstName은 비어있을 수 없습니다! 현재 값 : ${firstName}")
    if (lastName.isEmpty()) throw IllegalArgumentException("lastName은 비어있을 수 없습니다! 현재 값 : ${lastName}")
    return JavaPerson(firstName + lastName, 1)
}

fun createPersonWithInline(firstName: String, lastName: String): JavaPerson {
    fun validateName(name: String, fieldName: String) {
        if (name.isEmpty())
            throw java.lang.IllegalArgumentException("${fieldName}은 비어있을 수 없습니다! 현재 값 :${name}")
    }
    validateName(firstName, "firstName")
    validateName(lastName, "lastName")
    return JavaPerson(firstName + lastName, 1)
}
