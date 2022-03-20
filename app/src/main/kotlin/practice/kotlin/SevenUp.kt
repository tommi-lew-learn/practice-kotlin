package practice.kotlin

data class SevenUpResult(var numbers: List<Int>, var upOrDown: List<Boolean>)

class SevenUp {
    fun play(startingNumber: Int = 0, lastNumber: Int = 100): SevenUpResult {
        val size = lastNumber - startingNumber + 1
        val numbers = List(size) { i -> startingNumber + i }.toMutableList()
        val upOrDown = List(size) { false }.toMutableList()

        for ((i, num) in (startingNumber..lastNumber).withIndex()) {
            numbers[i] = num
            upOrDown[i] = divisibleBySeven(num) || containsSeven(num)
        }

        return SevenUpResult(numbers, upOrDown)
    }

    fun divisibleBySeven(number: Int): Boolean {
        return (number % 7) == 0
    }

    fun containsSeven(number: Int): Boolean {
        val numberAsString = number.toString()
        return numberAsString.indexOf("7") > -1
    }
}