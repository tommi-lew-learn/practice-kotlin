/*
 * Deprioritized requirements:
 * - Validation and error messages for invalid inputs
 * - "Welcome back to main menu"
 * - Ignore case
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
}

fun main() {
    println(App.WELCOME_MESSAGE)
    println()

    while (true) {
        println(App.MENU)
        println()

        print("> ")
        val menuInput = readLine()!!.trim()
        println()

        if (menuInput == "P") {
            println(App.REQUEST_STARTING_NUMBER_MESSAGE)

            print("> ")
            val startingNumber = readLine()!!.trim().toInt()
            println()

            println(App.REQUEST_ENDING_NUMBER_MESSAGE)
            print("> ")
            val endingNumber = readLine()!!.trim().toInt()
            println()

            val result = SevenUp(startingNumber, endingNumber).play()

            val resultFormatTemplate = "%-5s\t%s"
            println(resultFormatTemplate.format("Number", "Seven Up?"))
            for (entry in result.entries.iterator()) {
                println(resultFormatTemplate.format(entry.key, entry.value))
            }
            println()
        }

        if (menuInput == "Q") {
            println(App.EXIT_MESSAGE)
            break
        }
    }
}
