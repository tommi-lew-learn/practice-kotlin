/*
 * Deprioritized requirements:
 * - Validation and error messages for invalid inputs
 * - "Welcome back to main menu"
 *
 */
package practice.kotlin

class App {
    companion object {
        const val WELCOME_MESSAGE = "Welcome to Seven Up!"
        const val EXIT_MESSAGE = "Exiting Seven Up, thanks for playing!"
        const val REQUEST_STARTING_NUMBER_MESSAGE = "Please enter starting number..."
        const val REQUEST_ENDING_NUMBER_MESSAGE = "Please enter last number..."

        val MENU =
            """
                Menu:
                P - Play
                Q - Exit
            """.trimIndent()
    }

    fun call() {
        println(WELCOME_MESSAGE)
        println()

        while (true) {
            println(MENU)

            val menuInput = getUserStringInput()

            if (menuInput.equals("P", true)) {
                val startingNumber = getUserIntInput(REQUEST_STARTING_NUMBER_MESSAGE)
                val endingNumber = getUserIntInput(REQUEST_ENDING_NUMBER_MESSAGE)

                val result = SevenUp(startingNumber, endingNumber).play()
                printResult(result)
            } else if (menuInput.equals("Q", true)) {
                println(EXIT_MESSAGE)
                break
            }
        }
    }

    private fun getUserStringInput(message: String = ""): String {
        println(message)

        print("> ")
        val input = readLine()!!.trim()
        println()

        return input
    }

    private fun getUserIntInput(message: String): Int {
        println(message)

        print("> ")
        val input = readLine()!!.trim().toInt()
        println()

        return input
    }

    private fun printResult(result: Map<Int, Boolean>) {
        val resultFormatTemplate = "%-5s\t%s"

        println(resultFormatTemplate.format("Number", "Seven Up?"))

        for (entry in result.entries.iterator()) {
            println(resultFormatTemplate.format(entry.key, entry.value))
        }

        println()
    }
}

fun main() {
    App().call()
}
