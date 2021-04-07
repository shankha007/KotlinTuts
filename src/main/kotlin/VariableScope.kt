var ourTeam = "Sydney Sixer" // global variable
fun main(args: Array<String>) {
    var myName = "Elliot" // local variable
    showName("James")
}

fun showName(name: String) {
    //myName can't be accessed from here
    //ourTeam can be accessed from here
    ourTeam = "Kolkata Knight Riders"
    println("Name: $name")
    println("Team: $ourTeam")
}