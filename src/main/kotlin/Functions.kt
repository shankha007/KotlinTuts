fun main(args: Array<String>) {
    add(5,7, 10)
    subtract(10,5)
}

fun add(num1: Int, num2: Int, num3: Int) {
    var sum = num1 + num2 + num3
    println("Sum is: $sum")
}

fun subtract(num1: Int, num2: Int) {
    var res = num1 - num2
    println("Result is: $res")
}