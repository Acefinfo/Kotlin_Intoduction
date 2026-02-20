// Logical operators are used to combine two or more conditions or constraints, or to complement the evaluation of the original condition in consideration. 
// The result returns a Boolean value, i.e., true or false.

fun Logical(){
    var a = 10
    var b = 20
    var c = 30

    var result = false

    if(a > b && a > c)
        println(a)
    if(a < b || a > c)
        println(b)
    if( !result)
        println("Logical operators")
}

fun main() {
    Logical()
}