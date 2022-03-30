package practice.kotlin

import java.util.SortedMap

/**
 * SevenUp is a derived from a party game with the same name.
 * Players usually sit in a circle. This is a game where
 * participants start counting from 0. The number increment
 * by 1 for each subsequent person. If the number contains
 * the number 7, or is a multiple or 7, or both, the person
 * has to say "7-up", instead of the number. If the number
 * does not satisfy any of the above condition, all they
 * have to do is to say the number accordingly.
 *
 */
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