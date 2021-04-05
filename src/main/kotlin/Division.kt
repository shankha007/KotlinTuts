fun main(args: Array<String>) {
    /*
     Division
    */
    var firstNum:Double = 100.0
    var secondNum:Double = 20.0
    var fnum = 10
    var snum = 6
    var result:Double?
    result = firstNum / secondNum
    println("The result is: $result")
    println("The result is: ${fnum.toFloat() / snum}") // Another way
    println("The result is: ${fnum / snum.toFloat()}") // Another way
}