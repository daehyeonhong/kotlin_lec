package lec12

fun main() {
    println(Person.newBaby("감자"))
}

class Person private constructor(
    var name: String,
    var age: Int
) {
    /**
     * java에서 사용 시 Companion 호출 혹은 네이밍 호출 혹은 @JvmStatic 설정을 통해 static method 사용 가능
     */
    companion object Factory : Log {
        private const val MIN_AGE = 1

        @JvmStatic
        fun newBaby(name: String): Person {
            this.log()
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("나는 Person Class의 동행객체 Factory입니다.")
        }
    }
}
