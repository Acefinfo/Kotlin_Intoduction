// Unary Operators are used to increment or decrement a value.

fun unaryOpera() {
    var e=10
    var flag = true
    println("First print then increment: "+ e++)
    println("First increment then print: "+ ++e)
    println("First print then decrement: "+ e--)
    println("First decrement then print: "+ --e)

}

fun main() {
    unaryOpera()
}