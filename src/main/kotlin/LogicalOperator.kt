fun main(args: Array<String>) {
    /*
     Logical Operators ->
     AND -> &&
     OR -> ||
     NOT -> !
    */
    var firstNum = 5
    var secondNum = 6
    var thirdNum = 7

    //AND
    if((firstNum > secondNum) && (thirdNum < firstNum))
        println("Hello")
    else
        println("Bye")

    if((firstNum < secondNum) && (thirdNum < firstNum))
        println("Hello")
    else
        println("Bye")

    if((firstNum < secondNum) && (thirdNum > firstNum))
        println("Hello")
    else
        println("Bye")

    //OR
    if((firstNum > secondNum) || (thirdNum < firstNum))
        println("Hello")
    else
        println("Bye")

    if((firstNum < secondNum) || (thirdNum < firstNum))
        println("Hello")
    else
        println("Bye")

    if((firstNum < secondNum) || (thirdNum > firstNum))
        println("Hello")
    else
        println("Bye")
}