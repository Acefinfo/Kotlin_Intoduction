// Those data types are used to store floating-point numbers. They are used when we need to store decimal values. 
// The two main floating-point data types in Kotlin are Float and Double.

fun floating(){
    var float_num = 3.14f; // 'f' at the end indicates that this is a Float type
    var double_num = 3.14; // By default, this is a Double type
    float_num = 2.71f; // Reassigning a new value to the Float variable

    var float_num2 : Float = 2.71f; // Explicitly declaring a Float variable
    var double_num2 : Double = 2.71; // Explicitly declaring a Double variable

    println("Float value: $float_num");
    println("Double value: $double_num");
    println("Float value 2: $float_num2");
    println("Double value 2: $double_num2");
}

fun main(){
    floating();
}