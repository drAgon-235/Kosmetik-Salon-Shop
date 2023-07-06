class BP_NailPolish() : BeautyProduct() {

    var colour: String = ""

    // Konstruktor ohne 'description' (die braucht ein Nagellack nicht, der hat 'colour'
    constructor(
        id: String,
        category: String,
        name: String,
        brand: String,
        price: Double,
        colour: String,
        inStock: Int
    ) : this() {
        this.id = id
        this.category = category
        this.name = name
        this.brand = brand
        this.price = price
        this.colour = colour
        this.inStock = inStock
    }


    // Eigene Show Methode:
    override fun showEssentials() {
        //println("- - - - - - - - - - - - - - - ")
        println("${brand} - ${name}")
        println("Farbe: ${colour}")
        println("Preis: ${price} €")
        println("Auf Lager: ${this.inStock} Stück")
        println("- - - - - - - - - - - - - - - ")
    }


}