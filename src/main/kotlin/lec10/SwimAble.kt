package lec10

interface SwimAble {
    fun act() {
        println(swimAbility)
        println("움파 움파.")
    }

    val swimAbility: Int
}
