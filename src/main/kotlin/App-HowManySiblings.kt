fun main(args: Array<String>) {
    /*
     The user is prompted with a question
     The user ha sto give an answer
     If the answer is incorrect, then the user is prompted with the answer again
     else the application terminates
    */
    var isTrue: Boolean? = false
    do {
        println("How many siblings do I have?")
        var answer: Int? = readLine()!!.toInt()

        when (answer) {
            12 -> {
                isTrue = true
                println("You are correct!!")
            }
            else -> {
                println("Incorrect!! Try again")
            }
        }
    } while (isTrue == false)
}