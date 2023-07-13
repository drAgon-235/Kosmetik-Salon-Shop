class BP_Soap() : BeautyProduct() {

    var fragrance: String = ""
    var volume: Int = 0             // in ml

    // Konstruktor ohne 'description' (die braucht eine Seife nicht, die hat 'fragrance'):
    constructor(
        id: String,
        category: Category,
        name: String,
        brand: Brands,
        price: Double,
        fragrance: String,
        volume: Int,
        inStock: Int
    ) : this() {
        this.id = id
        this.category = category
        this.name = name
        this.brand = brand
        this.price = price
        this.fragrance = fragrance
        this.volume = volume
        this.inStock = inStock
    }

    // Eigene Show Methode:
    override fun showEssentials() {
        //println("- - - - - - - - - - - - - - - ")
        println("${this.brand} - ${this.name}")
        if (this.volume != 0)
            println("Inhalt: ${this.volume} ml")
        println("Duft: ${this.fragrance}")
        println("Preis: ${this.price} €")
        println("Auf Lager: ${this.inStock} Stück")
        println("Artikel-Nr: ${this.id}")
        println("- - - - - - - - - - - - - - - ")
    }


}