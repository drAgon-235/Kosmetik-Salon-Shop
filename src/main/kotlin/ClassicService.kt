import kotlin.time.Duration

open class ClassicService() {

    val id: String = ""
    val category: String = ""
    val name: String = ""
    val description: String = ""
    val price: Double = 0.0
    val duration: Int = 0

    // Konstruktor ohne duration:
    constructor(id: String, category: String, name: String, description: String, brand: String, price: Double) : this()

    // Konstruktor mit duration:
    constructor(id: String, category: String, name: String, description: String, brand: String, price: Double, duration: Int) : this()




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