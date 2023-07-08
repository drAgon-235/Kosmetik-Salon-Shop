class BP_Soap() : BeautyProduct() {

    var fragrance: String = ""

    // Konstruktor ohne 'description' (die braucht eine Seife nicht, die hat 'fragrance'):
    constructor(
        category: Category,
        name: String,
        brand: Brands,
        price: Double,
        fragrance: String,
        inStock: Int
    ) : this() {
        this.category = category
        this.name = name
        this.brand = brand
        this.price = price
        this.fragrance = fragrance
        this.inStock = inStock
    }

    // Eigene Show Methode:
    override fun showEssentials() {
        //println("- - - - - - - - - - - - - - - ")
        println("${this.brand} - ${this.name}")
        println("Duft: ${this.fragrance}")
        println("Preis: ${this.price} €")
        println("Auf Lager: ${this.inStock} Stück")
        println("- - - - - - - - - - - - - - - ")
    }


}