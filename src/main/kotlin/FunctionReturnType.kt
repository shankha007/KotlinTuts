fun main(args: Array<String>) {
    var res = multiply(5,7)
    println("Result is: $res")
    println("My name is: ${getName("Shankha")}")
}

fun multiply(num1: Int, num2: Int) : Int {
    var result = num1 * num2
    return result
}

fun getName(str: String) : String {
    return str;
}