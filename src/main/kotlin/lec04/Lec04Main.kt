package lec04

fun main() {
    val money1 = JavaMoney(2_000)
    val money2 = JavaMoney(1_000)
    if (money1 > money2) {
        println("Money1이 Money2보다 금액이 큽니다.")
    }
}
