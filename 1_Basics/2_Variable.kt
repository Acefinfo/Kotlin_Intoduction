// In kotlin each variable should be decleared before using it. Declearing the variable also 
// decide which type of the variable are allowed to be stored in it.


// Example 1: Mutable Variables. Mutable variables are those variables which can be changed after they are declared. We can declare mutable variables using 'var' keyword.
fun ex1() {
    var name : String = "Aashutosh"
    var rollNo = 15



    println("Name : $name")
    println("Roll No : $rollNo")
    // Changing the value of the variable
    println("----------Changing the value of the variable----------")
    name = "Aashu"
    rollNo = 16
    println("Name : $name")
    println("Roll No : $rollNo")
}


// Example 2: Immutable variable decleration. Immutable is also called read-only variables. Hence, we can not change the value of the variable declared using 'val' keyword.
fun ex2(){
    val name : String = "Aashutosh"
    val rollNo = 15
    println("Name : $name")
    println("Roll No : $rollNo")
}

fun main(args: Array<String>) {
    ex1()
    println()
    ex2()
}
