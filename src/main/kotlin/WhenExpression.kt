fun main(args: Array<String>) {
    /*
     When Expression
    */
    var age : Int = 19
//    age = 17
    when(age) {
        17 -> println("17")
        18 -> println("18")
        19 -> println("19")
        20 -> println("20")
        else -> {
            println("None of the above")
        }
    }
    println("Enter a number between 1 and 10: ")
    var enteredNum = readLine()!!.toInt()

    when(enteredNum) {
        1 -> println("Wrong Number")
        2 -> println("Getting Close!")
        3 -> println("Closer!")
        4 -> println("Hmmm...")
        5 -> println("Well, You are lost!")
        6 -> println("Bingo!!!")
        else -> {
            println("You are way lost!")
        }
    }
}