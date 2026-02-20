// Assignment operators are used to assign a value to a variable. 
// We assign the value of the right operand to left operand according to which assignment operator we use.

fun assignment() {
    var a = 10
    println("Initial value of a: $a") // 10

    a += 5
    println("After a += 5: $a") // 15

    a -= 3
    println("After a -= 3: $a") // 12

    a *= 2
    println("After a *= 2: $a") // 24

    a /= 4
    println("After a /= 4: $a") // 6

    a %= 4
    println("After a %= 4: $a") // 2
}

fun main() {
    assignment()
}

