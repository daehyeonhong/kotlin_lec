package lec19

import lec18.Fruit

fun main() {
    val fruits = listOf(
        Fruit(1, "사과", 1_000, 20_13),
        Fruit(2, "사과", 1_200, 20_13),
        Fruit(3, "사과", 1_200, 20_13),
        Fruit(4, "사과", 1_500, 20_13),
        Fruit(5, "바나나", 3_000, 20_13),
        Fruit(6, "바나나", 3_200, 20_13),
        Fruit(7, "바나나", 2_500, 20_13),
        Fruit(8, "수박", 10_000, 20_13)
    )
}

data class Fruit(
    val id: Long,
    val name: String,
    val factoryPrice: Long,
    val currentPrice: Long
)

private fun filterFruits(
    fruits: List<Fruit>,
    filter: (Fruit) -> Boolean
): List<Fruit> = fruits.filter(filter)
