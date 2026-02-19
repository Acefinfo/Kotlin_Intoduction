// Kotlin standard input is the basic operation performed to flow byte streams from input device such as Keyboard to the main memory of the system. 
// Input can be taken from the user using:
// - readline() method
// - Scanner class
import java.util.Scanner;

fun readlineex() {
    println("Enter your name:")
    val name = readLine()
    println("Hello, $name!")
} 


// Svanner datainput. This data type is used to take input from the user in a more flexible way. It can be used to take input of different data types such as Int, Float, Double, etc. We need to import the Scanner class from the java.util package to use it.


fun scannerex() {
    val scanner = Scanner(System.`in`)
    println("Enter your name:")
    val name = scanner.nextLine()
    println("Enter your age:")
    val age = scanner.nextInt()
    println("Hello, $name! You are $age years old.")
}


fun main(){
    readlineex()
    scannerex()
}