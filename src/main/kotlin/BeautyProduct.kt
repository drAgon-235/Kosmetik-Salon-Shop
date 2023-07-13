open class BeautyProduct() {
    var orderID: Int = 0
    var category: Category = Category.GEMISCHT
    var name: String = ""
    var brand: Brands = Brands.NONAME
    var description: String = ""
    var price: Double = 0.0
    var inStock: Int = 0

    // Konstruktor ohne 'description' (das braucht ein Nagellack nicht, der hat 'colour'):
    constructor( category: Category, name: String, brand: Brands, price: Double, inStock: Int) : this(){

        this.category = category
        this.name = name
        this.brand = brand
        this.price = price
        this.inStock = inStock
    }

    // Konstruktor mit allen variablen im Parameter:
    constructor(category: Category, name: String, brand: Brands, description: String, price: Double, inStock: Int) : this(){

        this.category = category
        this.name = name
        this.brand = brand
        this.description = description
        this.price = price
        this.inStock = inStock
    }

    open fun showEssentials(){
        //println("- - - - - - - - - - - - - - - ")
        println("${this.brand} - ${this.name}")
        println("Preis: ${this.price} €")
        println("Auf Lager: ${this.inStock} Stück")
        println("- - - - - - - - - - - - - - - ")
    }


    // For Future Projects
    fun showDetails(){
        //println("- - - - - - - - - - - - - - - ")
        println("${this.brand} - ${this.name}")
        println("Kategorie: ${this.category}")
        println("${this.description}")
        println("Preis: ${this.price} €")
        println("Auf Lager: ${this.inStock} Stück")
        println("- - - - - - - - - - - - - - - ")
    }

}