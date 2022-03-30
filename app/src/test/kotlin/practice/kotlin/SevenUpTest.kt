package practice.kotlin

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import kotlin.test.Test


class SevenUpTest {
    lateinit var sevenUp: SevenUp

    @BeforeEach
    fun initEach() {
        sevenUp = SevenUp()
    }

    @Nested
    @DisplayName("play()")
    inner class Play {

        @Test
        fun `returns a sorted map of results`() {
            sevenUp = SevenUp(14, 17)
            var sevenUpResult = sevenUp.play()

            val numbers = sevenUpResult.keys
            val upOrDown = sevenUpResult.values

            assertEquals(setOf(14, 15, 16, 17), numbers)
            assertEquals(listOf(true, false, false, true), upOrDown.toList())
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
                var result = sevenUp.divisibleBySeven(7)

                assert(result)
            }
        }

        @Nested
        @DisplayName("when number is not divisible by seven")
        inner class WhenNumberNotDivisibleBySeven {
            @Test
            fun `returns false`() {
                var result = sevenUp.divisibleBySeven(6)

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
                var result = sevenUp.containsSeven(7)

                assert(result)
            }
        }

        @Nested
        @DisplayName("when number does not contain seven")
        inner class WhenNumberDoesNotContainSeven {
            @Test
            fun `returns false`() {
                var result = sevenUp.containsSeven(6)

                assert(!result)
            }
        }
    }
}
