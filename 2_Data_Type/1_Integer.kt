// Integer data type in Kotlin is used to store whole numbers without decimal points. 
// The main integer data types in Kotlin are Byte, Short, Int, and Long.

fun integer_decleration(){
    var my_int = 50;
    var my_byte: Byte = 127; // Byte can store values from -128 to 127
    var my_short: Short = 32767; // Short can store values from -32768 to 32767
    var myint2: Int = 200;
    var my_long = 100L; 
    // Add 'L' at the end of the number to indicate that it is a Long type.
    

    println("Integer value: $my_int");
    println("Long value: $my_long");
    println("Byte value: $my_byte");  
    println("Short value: $my_short");
    
    println("My int2 value: $myint2");
}

fun main(){
    integer_decleration();
}