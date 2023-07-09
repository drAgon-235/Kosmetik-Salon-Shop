class BP_Creme() : BeautyProduct() {

    var volume: Int = 0    // in ml (Milliliter)

    constructor(
        category: Category,
        name: String,
        brand: Brands,
        price: Double,
        volume: Int,
        inStock: Int
    ) : this() {
        this.category = category
        this.name = name
        this.brand = brand
        this.price = price
        this.volume = volume
        this.inStock = inStock
    }

    // Eigene Show Methode:
    override fun showEssentials() {
        //println("- - - - - - - - - - - - - - - ")
        println("${this.brand} - ${this.name}")
        println("Inhalt: ${this.volume} ml")
        println("Preis: ${this.price} €")
        println("Auf Lager: ${this.inStock} Stück")
        println("- - - - - - - - - - - - - - - ")
    }

}