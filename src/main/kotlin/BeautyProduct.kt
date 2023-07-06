import java.lang.ref.PhantomReference

open class BeautyProduct() {
    var id: String = ""
    var category: String = ""
    var name: String = ""
    var brand: String = ""
    val description: String = ""
    var price: Double = 0.0
    var inStock: Int = 0

    // Konstruktor ohne 'description' (das braucht ein Nagellack nicht, der hat 'colour'):
    constructor(id: String, category: String, name: String, brand: String, price: Double, inStock: Int) : this()

    // Konstruktor mit allen variablen im Parameter:
    constructor(id: String, category: String, name: String, brand: String, description: String, price: Double, inStock: Int) : this()

    open fun showEssentials(){
        //println("- - - - - - - - - - - - - - - ")
        println("${this.brand} - ${this.name}")
        println("Preis: ${this.price} €")
        println("Auf Lager: ${this.inStock} Stück")
        println("- - - - - - - - - - - - - - - ")
    }


    open fun showDetails(){
        println("- - - - - - - - - - - - - - - ")
        println("${this.brand} - ${this.name}")
        println("${this.description}")
        println("Preis: ${this.price} €")
        println("Auf Lager: ${this.inStock} Stück")
        println("- - - - - - - - - - - - - - - ")
    }

    fun addToCart() {
        // TODO

    }
}