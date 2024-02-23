fun main() {

    var weightLeemak: Float? = null
    var weightBob: Float? = null
    var years: Int = 0

    while (weightLeemak == null) {
        println("Введите вес мишки Лимака")
        weightLeemak = try {
            readLine()?.toFloat() ?: 0f
        } catch (e: NumberFormatException) {
            println("Введенные символы не являются числом. Попробуйте ещё раз.")
            null
        }
    }
    while (weightBob == null) {
        println("Введите вес мишки Боба>")
        weightBob = try {
            readLine()?.toFloat() ?: 0f
        } catch (e: NumberFormatException) {
            println("Введенные символы не являются числом. Попробуйте ещё раз.")
            null
        }
    }
    if (weightLeemak > weightBob) {
        println("Мишка Лимак уже самый большой!")
        return
    }

    while (weightLeemak <= weightBob) {
        weightLeemak *= 3
        weightBob *= 2
        years += 1
    }
    println("Лимак станет самым большим медведем в лесу через $years лет")

}