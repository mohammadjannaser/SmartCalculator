package stage2

fun main() {

    while (true) {
        val input = readln()

        if (input.isEmpty()) continue
        if (input.equals("/exit",ignoreCase = true)) break

        val numbers = input.split(" ").map { it.toInt() }

        if (numbers.size == 1) println(numbers.first())
        else println(numbers.sum())

    }
    println("Bye!")

}
