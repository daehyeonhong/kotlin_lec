package Lec05

fun main() {
    println(getPassOrFail(20))
    getGrade(20)
    validateScore(-1)
}

fun validateScore(score: Int): Unit {
    if (score !in 0..100) {
        throw IllegalArgumentException("score의 범위는 0부터 100까지 입니다.")
    }
}

fun getPassOrFail(score: Int): String {
    return if (score >= 50) "P" else "F"
}

fun getGrade(score: Int): String {
    return if (score >= 90) "A" else if (score >= 80) "B" else if (score >= 70) "C" else "D"
}

fun getGradeWithSwitch(score: Int): String {
    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}
