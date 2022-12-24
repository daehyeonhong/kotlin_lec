package lec09

fun main() {
    val person1 = Person("qwe1", 123)
    println(person1.name + ", " + person1.age)
    person1.age = 20
    println(person1.name + ", " + person1.age)
    val person2 = Person("qwe2")
    println(person2.name + ", " + person2.age)
    person2.age = 20
    println(person2.name + ", " + person2.age)
    val person3 = Person()
    println(person3.name + ", " + person3.age)
    person3.age = 20
    println(person3.name + ", " + person3.age)
}

class Person constructor(// primary constructor
    name: String,
    var age: Int
) {

    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age} 일 수 없습니다.")
        }
        println("초기화 블록")
    }

    var name = name
        set(value) {
            field = value.uppercase()
        }

    fun getUppercaseName() = this.name.uppercase()

    val uppercaseName: String
        get() = this.name.uppercase()

    constructor(name: String) : this(name, 1)// secondary constructor
    {
        println("첫번째 부생성자")
    }

    constructor() : this("홍길동")// secondary constructor
    {
        println("두번째 부생성자")
    }

    fun isAdult() = this.age >= 20

    val isAdult: Boolean
        get() = this.age >= 20
}
