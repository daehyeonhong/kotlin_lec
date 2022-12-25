package lec10

class Penguin(
    species: String
) : Animal(species, 2), SwimAble, FlyAble {
    private val wingCount: Int = 2
    override fun move() {
        println("펭귄이 움직입니다. 꿱꿱.")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<SwimAble>.act()
        super<FlyAble>.act()
    }

    override val swimAbility: Int
        get() = 3
}
