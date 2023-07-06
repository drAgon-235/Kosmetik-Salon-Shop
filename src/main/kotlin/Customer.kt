class Customer() {
    var customNr: Int = 1
    var name: String
    var adresse: String
    var email: String
    var password: String

    var saldo: Double = 0.0
    var appointments: MutableList<String> = mutableListOf()

    // Idee: in einem init-Block alle Variablen abfragen im Dialog:
    // wie ein sich selbst füllender Konstruktor.
    // Keine extra Methode mehr nötig, allein die Erstellung eines Customers fragt seine Daten ab!
    init {
        println("Bitte Name eingeben:")
        this.name = readln()
        println("Bitte Adresse eingeben:")
        this.adresse = readln()
        println("Bitte Email eingeben:")
        this.email = readln()
        println("Bitte Passwort eingeben:")
        this.password = readln()
    }


}