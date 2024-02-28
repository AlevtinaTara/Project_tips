fun main() {
    var inputYear: Int? = null

    while (inputYear == null || (inputYear < 1000 || inputYear > 9000)) {
        println("Введите год")
        inputYear = try {
            readLine()?.toInt() ?: 0
        } catch (e: NumberFormatException) {
            println("Введенные символы не являются числом или введенное число меньше 1000 или больше 9000.")
            null
        }
    }
    var finalYearStr = ""
    var n1 = '0'
    var n2 = '0'
    var n3 = '0'
    var n4 = '0'
    while (n1 == n2 || n1 == n3 || n1 == n4 || n2 == n3 || n2 == n4 || n3 == n4) {
        inputYear += 1
        finalYearStr = inputYear.toString()
        n1 = finalYearStr[0]
        n2 = finalYearStr[1]
        n3 = finalYearStr[2]
        n4 = finalYearStr[3]
    }
    println(finalYearStr)

}


