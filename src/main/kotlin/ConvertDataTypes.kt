fun main(args: Array<String>) {
    /*
     Convert Data Types
    */
    var age: Int = 31

    println(age + 10)
    println(age.toString() + 10) // As it is String + working as concatenation

    println(age.toDouble())
    println(age.toFloat())

    var bloodPressure : Double = 79.0
    age = bloodPressure.toInt()
    println(age)
}