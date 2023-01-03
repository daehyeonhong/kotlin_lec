package lec14

fun main() {
    val dto1: PersonDto = PersonDto("감자", 100)
    val dto2: PersonDto = PersonDto("고구마", 200)

    println(dto1)
    println(dto2)
}

data class PersonDto(
    val name: String,
    val age: Int
) {
}
