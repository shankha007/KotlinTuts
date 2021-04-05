fun main(args: Array<String>) {
    /*
    Difference between Var and Val
    val = static - not meant to change, or be reassigned
    var = meant to be reassigned
    */
    var myName = "Shankha"
    myName = "Ankusha"
    println(myName)
    val dogName = "Halley"
    //dogName = "Jericho" //ERROR -> Can't be reassigned
    val pi = 3.14 // Use val for constants
}