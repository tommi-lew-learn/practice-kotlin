package practice.kotlin

data class SevenUpResult(var numbers: List<Int>, var upOrDown: List<Boolean>)

class SevenUp {
    fun play(startingNumber: Int = 0, lastNumber: Int = 100): SevenUpResult {
        val size = lastNumber - startingNumber + 1
        val numbers = List(size) { i -> startingNumber + i }.toMutableList()
        var upOrDown = List(size) { false }.toMutableList()


        for ((index, i) in (startingNumber..lastNumber).withIndex()) {
            numbers[index] = i
            upOrDown[index] = divisibleBySeven(i) || containsSeven(i)
        }

        return SevenUpResult(numbers, upOrDown)
    }

    fun divisibleBySeven(number: Int): Boolean {
        return (number % 7) == 0
    }

    fun containsSeven(number: Int): Boolean {
        var numberAsString = number.toString()
        return numberAsString.indexOf("7") > -1
    }
}