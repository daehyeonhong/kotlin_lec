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
