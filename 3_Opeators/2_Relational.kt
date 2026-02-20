// Relational operators: >, <, >=, <=, ==, !=

fun relational() {
    val a = 10
    val b = 20

    println("a > b: ${a > b}")   // false
    println("a < b: ${a < b}")   // true
    println("a >= b: ${a >= b}") // false
    println("a <= b: ${a <= b}") // true
    println("a == b: ${a == b}") // false
    println("a != b: ${a != b}") // true
} 

fun main(args: Array<String>) {
    relational()
}