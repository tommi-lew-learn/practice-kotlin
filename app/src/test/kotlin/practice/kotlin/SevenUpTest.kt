package practice.kotlin

import kotlin.test.Test
import kotlin.test.assertEquals

class SevenUpTest {
    @Test
    fun whenContainsNumbersThatAreDivisibleBySevenAndContainsSeven() {
        var classUnderTest = SevenUp()
        var sevenUpResult = classUnderTest.play(14, 17)

        val numbers = sevenUpResult.numbers
        val upOrDown = sevenUpResult.upOrDown

        assertEquals(numbers, listOf(14, 15, 16, 17))
        assertEquals(upOrDown, listOf(true, false, false, true))
    }

    @Test
    fun returnsTrueWhenNumberIsDivisibleBySeven() {
        var classUnderTest = SevenUp()
        var result = classUnderTest.divisibleBySeven(7)

        assert(result)
    }

    @Test
    fun returnsFalseWhenNumberIsNotDivisibleBySeven() {
        var classUnderTest = SevenUp()
        var result = classUnderTest.divisibleBySeven(6)

        assert(!result)
    }

    @Test
    fun returnsTrueWhenNumberContainsSeven() {
        var classUnderTest = SevenUp()
        var result = classUnderTest.containsSeven(7)

        assert(result)
    }

    @Test
    fun returnsFalseWhenNumberDoesNotContainSeven() {
        var classUnderTest = SevenUp()
        var result = classUnderTest.containsSeven(6)

        assert(!result)
    }
}
