package stage3


fun main() {

    while (true) {
        val input = readln()

        when {
            input.isEmpty() -> continue
            input.equals("/exit",ignoreCase = true) -> break
            input.equals("/help",ignoreCase = true) -> println("The program calculates the sum of numbers")
            else -> {
                val numbers = input.split(" ").map { it.toInt() }
                println(numbers.sum())
            }
        }
    }
    println("Bye!")

}