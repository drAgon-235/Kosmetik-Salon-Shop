class Customer() {
    var customNr: Int = 0
    var name: String = ""
    var adress: String = ""
    var email: String = ""
    var password: String = ""
    var saldo: Double = 0.0

    var appointments: MutableList<String> = mutableListOf()
    var purchases: MutableList<String> = mutableListOf()

    constructor(customNr: Int, name: String, adress: String, email: String, password: String, saldo: Double) : this() {
        this.customNr = customNr
        this.name = name
        this.adress = adress
        this.email = email
        this.password = password
        this.saldo
    }


    fun chooseBPCategory() {
        println("Beauty Produkte ausgewählt")
        println(
            "Kategorie auswählen oder alle ansehen:" +
                    "\n 1. Gesicht " +
                    "\n 2. Körper " +
                    "\n 3. Hände " +
                    "\n 4. Nagellacke " +
                    "\n 5. Seifen  " +
                    "\n 6. Alle \n  -- Bitte Nr. eingeben: --"
        )
        var inputCateg = readln()
        when (inputCateg){
            "1" -> println("Gesicht ausgewählt")
            "2" -> println("Körper ausgewählt")
            "3" -> println("Hände ausgewählt")
            "4" -> println("Naellacke ausgewählt")
            "5" -> println("Seifen ausgewählt")
            "6" -> println("Alle ausgewählt")
            else -> println("Falsche Eingabe")
        }

    }

    fun homeMenue(){
        println(
            "Du hast nun folgende Möglichkeiten:" +
                    "\n 1. Einkaufskorb " +
                    "\n 2. Beauty Produkte " +
                    "\n 3. Kosmetische Behandlungen " +
                    "\n 4. Behandlungstermine " +
                    "\n 5. Mein Profil " +
                    "\n    Bitte Nr. eingeben: "
        )
        var mainMenue = readln()

        when(mainMenue){
            "1" -> println("Einkaufskorb ausgewählt")
            "2" -> chooseBPCategory()
            "3" -> println("Kosmetische Behandlungen ausgewählt")
            "4" -> println("Behandlungstermine ausgewählt")
            "5" -> println("Mein Profil ausgewählt")
            else -> println("Falsche Eingabe")
        }
    }


}
