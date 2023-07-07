import kotlin.time.Duration

open class ClassicService() {

    var id: String = ""
    var category: String = ""
    var name: String = ""
    var description: String = ""     //Noch irgendwie einbauen, dass es alle 40 Zeichen einen Zeilenbruch gibt... wäre cool
    var price: Double = 0.0
    var duration: Int = 0

    // Konstruktor ohne 'duration' (die wird bei Massagen individuell ausgewählt):
    constructor(id: String, category: String, name: String, description: String, price: Double) : this(){
        this.id = id
        this.category = category
        this.name = name
        this.description = description
        this.price = price
    }

    // Konstruktor mit 'duration':
    constructor(id: String, category: String, name: String, description: String, price: Double, duration: Int) : this(){
        this.id = id
        this.category = category
        this.name = name
        this.description = description
        this.price = price
        this.duration = duration
    }



    fun showEssentials(){
        //println("- - - - - - - - - - - - - - - ")
        println("${this.name}")
        println("Dauer: ${this.duration} Minuten")
        println("Preis: ${this.price} €")
        println("- - - - - - - - - - - - - - - ")
    }


    fun showDetails(){
        println("- - - - - - - - - - - - - - - ")
        println("${this.name}")
        println("Kategorie: ${this.category}")
        println("${this.description}")
        println("Dauer: ${this.duration} Minuten")
        println("Preis: ${this.price} €")
        println("- - - - - - - - - - - - - - - ")

    }


    fun bookAppointment(){
        //TODO
        // kann evtl zu KLasse Appointment.kt
    }


}