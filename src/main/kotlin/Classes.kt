class House(type:String, price: Double, yearBuilt: Int, owner: String) {
    var type: String? = null
    var price: Double? = null
    var yearBuilt: Int? = null
    var owner: String? = null

    init { // initializes all of our properties
        this.type = type
        this.price = price
        this.yearBuilt = yearBuilt
        this. owner = owner
    }
    fun GetType(): String? {
        return this.type
    }
    fun SetType(type: String) {
        this.type = type
    }
}

fun main(args: Array<String>) {
    var myHouse = House("3 BHK", 23000.0, 1998, "Shankha")
    var secondHouse = House("6 BHK", 124000.0, 2019, "Holley")
    //myHouse.price = 14200.0
    myHouse.SetType("4 BHK")
    println("Type: ${secondHouse.GetType()}")
    println("Price: ${myHouse.type}")
}