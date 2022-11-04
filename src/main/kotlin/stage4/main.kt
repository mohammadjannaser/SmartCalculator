package stage4


fun main() {

    while (true) {
        val input = readln()

        when {
            input.isEmpty() -> continue
            input.equals("/exit",ignoreCase = true) -> break
            input.equals("/help",ignoreCase = true) -> println("The program calculates the sum of numbers")
            else -> {
                val numbers = parseNumbers(input)
                println(numbers.sum())
            }
        }
    }
    println("Bye!")

}

/**
 * this function take number parameter as string
 * and parse all of it to integer and return a list of integers.
 *********************************************************************************************************************/
fun parseNumbers(numbers: String) : List<Int> {
    return numbers.split(Regex("\\s+")).joinToString("") {
        when {
            // even multiple of minus signs --> +
            it.matches(Regex("(--)*")) -> " +"
            // multiple minus signs (can only be odd number!)
            it.matches(Regex("-*")) -> " -"
            // multiple plus signs
            it.matches(Regex("\\+*")) -> " +"
            else -> it
        }
    }.split(" ").map { it.toInt() }
}