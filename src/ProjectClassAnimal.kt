fun main() {
val penguin: Behavior = Penguin("black and white", "King", 1.0, 5.25)
    penguin.eatFish()
    penguin.swimDistance()
}

class Penguin(
    var color: String,
    protected var species: String,
    private var wingspan: Double,
    var distance: Double,
) : Behavior {
    var habitat: String = ""
    var size: Double = 0.0
    override fun eatFish() {
        println("I ate 1 fish")
    }

    override fun swimDistance() {
        println("I swam $distance km")
    }
}

interface Behavior {
    fun eatFish()
    fun swimDistance()
}

