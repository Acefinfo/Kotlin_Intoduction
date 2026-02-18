
// Character data type represents the small letters(a-z), Capital letters(A-Z), digits(0-9), and other symbols.
fun Char() {
    val letterA: Char = 'A'
    val letterB: Char = 'B'
    val digit1: Char = '1'
    val symbol: Char = '@'

    println("Letter A: $letterA")
    println("Letter B: $letterB")
    println("Digit 1: $digit1")
    println("Symbol: $symbol")
}

// String data type represents a sequence of characters. It is used to store text.
fun String() {
    val greeting: String = "Hello, World!"
    val name: String = "Kotlin"

    println(greeting)
    println("Welcome to $name programming!")
}

fun main(args: Array<String>) {
    Char()
    String()
}

// Major difference in val and var are:
// 1. val is immutable, which means once a value is assigned to a val variable, it cannot be changed. On the other hand, var is mutable, which means you can change the value of a var variable after it has been assigned.
// 2. val is used when you want to create a constant or a read-only variable, while var is used when you need a variable that can be modified.