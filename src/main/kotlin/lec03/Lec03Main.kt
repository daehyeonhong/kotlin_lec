package lec03

fun main() {
    val number1: Int? = 3
    val number2: Long = number1?.toLong() ?: 0L
}

fun objectObjIsPerson(obj: Any) {
    if (obj !is Person) {
//        println(obj.age)
        println("obj is not Person")
    }
}
