//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var input: String
    var inputStringInt = 0
    val listWithWords: ArrayList<String> = arrayListOf()

    while (inputStringInt < 1 || inputStringInt > 100) {
        println("Введите количество строк для Вашего будущего списка")
        input = readLine() ?: ""

        if (input.isNotEmpty()) {
            try {
                inputStringInt = input.toInt()
            } catch (error: NumberFormatException) {
                println("Введенные символы не являются числом, попробуйте ещё раз.")
            }
        } else {
            println("Число не введено, попробуйте ещё раз")
        }
    }

    println("Введите строки для Вашего списка")

    while (listWithWords.size != inputStringInt) {
        input = readLine() ?: ""

        if (input.isNotEmpty() && input.all { it.isLetter() }) {
            listWithWords.add(input)
        } else {
            println("Вы ничего не ввели или ввели не буквы, попробуйте ещё раз")
        }
    }

    var firstLetterInWord: String
    var lastLetterInWord: String
    var sumOfLettersBetween: Int
    var output: String

    for (word in listWithWords) {
        if (word.length > 10) {
            firstLetterInWord = word.first().toString()
            lastLetterInWord = word.last().toString()
            sumOfLettersBetween = word.length - 2
            output = firstLetterInWord + sumOfLettersBetween + lastLetterInWord
        } else {
            output = word
        }
        println(output)
    }

}

