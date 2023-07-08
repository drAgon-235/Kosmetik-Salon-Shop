import java.lang.ref.PhantomReference

open class BeautyProduct() {
    var id: Int = 0
    var category: String = ""
    var name: String = ""
    var brand: String = ""
    var description: String = ""
    var price: Double = 0.0
    var inStock: Int = 0

    // Konstruktor ohne 'description' (das braucht ein Nagellack nicht, der hat 'colour'):
    constructor( category: String, name: String, brand: String, price: Double, inStock: Int) : this(){

        this.category = category
        this.name = name
        this.brand = brand
        this.price = price
        this.inStock = inStock
    }

    // Konstruktor mit allen variablen im Parameter:
    constructor(category: String, name: String, brand: String, description: String, price: Double, inStock: Int) : this(){

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


    fun showDetails(){
        //println("- - - - - - - - - - - - - - - ")
        println("${this.brand} - ${this.name}")
        println("Kategorie: ${this.category}")
        println("${this.description}")
        println("Preis: ${this.price} €")
        println("Auf Lager: ${this.inStock} Stück")
        println("- - - - - - - - - - - - - - - ")
    }

    fun addToCart() {
        // TODO

    }
}