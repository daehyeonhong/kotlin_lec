package lec13

fun main() {

}

class JavaHouse(
    private val address: String,
    private val livingRoom: LivingRoom
) {
    class LivingRoom(
        private var area: Double
    )
}
