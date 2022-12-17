package Lec05

fun main() {
    println(getPassOrFail(20))
    getGrade(20)
    getGradeWithSwitch(80)
    startWithA("DS")
    judgeNumber(1)
    judgeNumber2(123)
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

fun startWithA(any: Any): Boolean {
    return when (any) {
        is String -> any.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number: Int): Unit {
    when (number) {
        1, 0, -1 -> println("어디서 많이 본 숫자입니다.")
        else -> println("1,0,-1이 아닙니다.")
    }
}

fun judgeNumber2(number: Int): Unit {
    when {
        number == 0 -> println("주어진 숫자는 0입니다.")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다.")
        else -> println("주어진 숫자는 홀수입니다.")
    }
}
