package practice.kotlin

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import kotlin.test.Test
import kotlin.test.assertEquals

class SevenUpTest {
    @Nested
    @DisplayName("play()")
    inner class Play {

        @Test
        fun `returns SevenUpResult data class`() {
            var classUnderTest = SevenUp()
            var sevenUpResult = classUnderTest.play(14, 17)

            val numbers = sevenUpResult.numbers
            val upOrDown = sevenUpResult.upOrDown

            assertEquals(numbers, listOf(14, 15, 16, 17))
            assertEquals(upOrDown, listOf(true, false, false, true))
        }
    }


    @Nested
    @DisplayName("divisibleBySeven()")
    inner class DivisibleBySeven {

        @Nested
        @DisplayName("when number is divisible by seven")
        inner class WhenNumberDivisibleBySeven {
            @Test
            fun `returns true`() {
                var classUnderTest = SevenUp()
                var result = classUnderTest.divisibleBySeven(7)

                assert(result)
            }
        }

        @Nested
        @DisplayName("when number is not divisible by seven")
        inner class WhenNumberNotDivisibleBySeven {
            @Test
            fun `returns false`() {
                var classUnderTest = SevenUp()
                var result = classUnderTest.divisibleBySeven(6)

                assert(!result)
            }
        }
    }

    @Nested
    @DisplayName("containsSeven()")
    inner class ContainsSeven {

        @Nested
        @DisplayName("when number contains seven")
        inner class WhenNumberContainsSeven {
            @Test
            fun `returns true`() {
                var classUnderTest = SevenUp()
                var result = classUnderTest.containsSeven(7)

                assert(result)
            }
        }

        @Nested
        @DisplayName("when number does not contain seven")
        inner class WhenNumberDoesNotContainSeven {
            @Test
            fun `returns false`() {
                var classUnderTest = SevenUp()
                var result = classUnderTest.containsSeven(6)

                assert(!result)
            }
        }
    }
}
