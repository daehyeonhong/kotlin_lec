package Lec05

fun main() {
    println(getPassOrFail(20))
    validateScoreIsNotNegative(-1)
}

fun validateScoreIsNotNegative(score: Int): Unit {
    if (score < 0) {
        throw IllegalArgumentException("score는 0보다 작을 수 없습니다.")
    }
}

fun getPassOrFail(score: Int): String {
    return if (score >= 50) "P" else "F"
}

fun getGrade(score: Int): String {
    return if (score >= 90) "A" else if (score >= 80) "B" else if (score >= 70) "C" else "D"
}
