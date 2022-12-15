package lec04

fun main() {
    if (fun2() && fun1()) {
        println("본문")
    }
}

fun fun2(): Boolean {
    println("fun2")
    return true
}

fun fun1(): Boolean {
    println("fun1")
    return false
}
