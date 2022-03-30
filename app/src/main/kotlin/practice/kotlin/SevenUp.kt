package practice.kotlin

import java.util.SortedMap

class SevenUp(
    private val startingNumber: Int = 0,
    private val lastNumber: Int = 100
) {

    fun play(): SortedMap<Int, Boolean> {
        val map = mutableMapOf<Int, Boolean>()

        for (num in startingNumber..lastNumber) {
            map[num] = divisibleBySeven(num) || containsSeven(num)
        }

        return map.toSortedMap()
    }

    fun divisibleBySeven(number: Int): Boolean {
        return (number % 7) == 0
    }

    fun containsSeven(number: Int): Boolean {
        val numberAsString = number.toString()
        return numberAsString.indexOf("7") > -1
    }
}