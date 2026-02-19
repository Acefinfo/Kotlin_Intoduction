// Arithmetic operators in Kotlin are used to perform basic mathematical operations such as addition, subtraction, multiplication, division, and modulus.
import java.util.Scanner;

fun add(a: Int, b: Int): Int {
    return a + b
}

fun subtract(a: Int, b: Int): Int {
    return a - b
}

fun multiply(a: Int, b: Int): Int {
    return a * b
}

fun devide(a: Int, b: Int): Int {
    if (b ==0)
        throw IllegalArgumentException("Divisor cannot be zero")
    return a / b
}

fun modulus(a: Int, b: Int): Int {
    if (b ==0)
        throw IllegalArgumentException("Divisor cannot be zero")
    return a % b
}

fun main(){

    val scanner = Scanner(System.`in`)
    
    println("Enter first number:")
    val num1 = scanner.nextInt()

    println("Enter second number:")
    val num2 = scanner.nextInt()
    
    println("Addition: ${add(num1, num2)}")
    println("Subtraction: ${subtract(num1, num2)}")
    println("Multiplication: ${multiply(num1, num2)}")
    println("Division: ${devide(num1, num2)}")
    println("Modulus: ${modulus(num1, num2)}")



}