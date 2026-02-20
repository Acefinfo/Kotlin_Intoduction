// Bitwise operators work on bit-level. So, compiler first converted to bit-level and then the calculation is performed on the operands.


fun bitwise() {
    val a = 5  // In binary: 0101
    val b = 3  // In binary: 0011

    println("a & b: ${a and b}")   // Bitwise AND: 0001 (1 in decimal)
    println("a | b: ${a or b}")    // Bitwise OR: 0111 (7 in decimal)
    println("a ^ b: ${a xor b}")   // Bitwise XOR: 0110 (6 in decimal)
    println("~a: ${a.inv()}")      // Bitwise NOT: 1010 (-6 in decimal)
    println("a shl 1: ${a shl 1}") // Left shift: 1010 (10 in decimal)
    println("a shr 1: ${a shr 1}") // Right shift: 0010 (2 in decimal)
}

fun main() {
    bitwise()
}