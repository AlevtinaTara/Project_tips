fun main() {
    var teapot = Teapot()
    var cup = Cup(3)
    println(cup)
    teapot.fillCup(cup)
    println(cup)
    cup.setId(5)
    println(cup)
    cup.isFilled = false
    println(cup)

}

data class Cup(
    private var id: Int,
    var isFilled: Boolean = false,
    var changeId: Boolean = false
) {
    fun getId(): Int {
        return id
    }

    fun setId(value: Int) {
        id = value
        changeId = true
    }

    override fun toString(): String {
        if (!changeId && !isFilled) {
            return "I am Cup, my id is $id, I am not filled"
        }
        if (changeId && !isFilled) {
            return "I am Cup, my id is changed to $id, but I am still not filled"
        }
        if (!changeId && isFilled) {
            return "I am Cup, my id is still $id, I am filled"
        }
        return "I am Cup, I have new id $id, and I am filled enough"
    }
}

class Teapot() {
    fun fillCup(cup: Cup) {
        cup.isFilled = true
    }
}
