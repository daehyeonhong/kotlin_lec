package lec11

class Car(
    internal val name: String,
    private var owner: String,
    _price: Int
) {
    var price: Int = _price
        private set
}
