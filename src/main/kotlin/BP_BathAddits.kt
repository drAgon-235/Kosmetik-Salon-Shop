class BP_BathAddits() : BeautyProduct() {

    var volume: Int = 0    // in ml (Milliliter)
    var weight: Int = 0    // in g  (Gramm)

    constructor(
        category: Category,
        name: String,
        brand: Brands,
        price: Double,
        volume: Int,
        weight: Int,
        inStock: Int
    ) : this() {
        this.category = category
        this.name = name
        this.brand = brand
        this.price = price
        this.volume = volume
        this.weight = weight
        this.inStock = inStock
    }

    override fun showEssentials() {
        //println("- - - - - - - - - - - - - - - ")
        println("${this.brand} - ${this.name}")
        if (this.weight != 0)
            println("Gewicht Netto: ${this.weight} g")
        if (this.volume != 0)
            println("Inhalt: ${this.volume} ml")
        println("Preis: ${this.price} €")
        println("Auf Lager: ${this.inStock} Stück")
        println("- - - - - - - - - - - - - - - ")
    }


}