//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var sumForAllNum: Float? = null
    var percentNum: Float? = null
    var participantsInt: Int? = null
    var input: String?

    while (sumForAllNum == null) {
        println("Укажите сумму выставленного счета")
        input = readlnOrNull()
        sumForAllNum = try {
            input?.toFloat() ?: 0f
        } catch (error: NumberFormatException) {
            println("Введенные символы не являются числом. Попробуйте ещё раз.")
            null
        }
        if (sumForAllNum != null) {
            if (sumForAllNum <= 0) {
                println("Введенное число должно быть больше ноля. Попробуйте ещё раз.")
                sumForAllNum = null
            }
        }
    }
    while (percentNum == null) {
        println("Укажите размер чаевых (%)")
        input = readlnOrNull()
        percentNum = try {
            input?.toFloat() ?: 0f
        } catch (error: NumberFormatException) {
            println("Введенные символы не являются числом. Попробуйте ещё раз.")
            null
        }
        if (percentNum != null) {
            if (percentNum <= 0) {
                println("Введенное число должно быть больше ноля. Попробуйте ещё раз.")
                percentNum = null
            }
        }
    }
    while (participantsInt == null) {
        println("Укажите количество участников")
        input = readlnOrNull()
        participantsInt = try {
            input?.toInt() ?: 0
        } catch (error: NumberFormatException) {
            println("Введенные символы не являются числом. Попробуйте ещё раз.")
            null
        }
        if (participantsInt != null) {
            if (participantsInt <= 0) {
                println("Введенное число должно быть больше ноля. Попробуйте ещё раз.")
                participantsInt = null
            }
        }
    }
    val percentSize: Float = (percentNum * sumForAllNum) / 100
    val bill: Float = sumForAllNum + percentSize
    val billPerParticipant: Float = bill / participantsInt
    println("Доля каждого участника: $billPerParticipant евро")
}