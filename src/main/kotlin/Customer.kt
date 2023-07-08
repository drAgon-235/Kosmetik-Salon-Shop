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



    // My Basic Function for "LAST Choice" with actual ID for adding to ShoppingCart(wird mal chooseProduct(allProducts: MutableList<BeautyProduct>) heissen)
    fun chooseProduct(productList: MutableList<BeautyProduct>, shoppingCart: ShoppingCart){
        var localID: Int = 1
        //Trick ich erstelle ir hier eine lokale Liste, um aus ihr die Bestellung rauszusuchen bei "w"
        var interimList: MutableList<BeautyProduct> = mutableListOf()
        for (it in productList) {
            // Aktuelle ID für die interaktive Auswahl zum Warenkorb:
            it.orderID = localID++
            println(" - - BestellNr: ${it.orderID} - - ")
            it.showEssentials()
            // Und ab in die lokale Auswahlliste:
            interimList.add(it)

        }
        println(
            "Aktion auswählen: \n - Für sortieren nach Preis klicke 'p' " +
                    "\n - Für alphabetisches Sortieren klicke 's' " +
                    "\n - Um ein Produkt zum Einkaufskorb hinzuzufügen, klicke 'w' "
        )
        var inputAction = readln()
        when (inputAction) {
            "p" -> println("Nach Preis Sortieren")
            "s" -> println("Alphabetisch sortieren")
            "w" -> {shoppingCart.addToShoppingCart(interimList) } // Hier wird abgefragt wieviel Exemplare des Produkts in den Einkaufswagen kommen und werden dann entsprechend hinzugefügt
            else -> println("Falsche Eingabe")
        }
        //return interimList
    }

    fun chooseBPCategory(shoppingCart: ShoppingCart) {
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
        when (inputCateg) {
            "1" -> println("Gesicht ausgewählt")
            "2" -> println("Körper ausgewählt")
            "3" -> println("Hände ausgewählt")
            "4" -> {
                println(" - -- -  Alle Nagellacke  - -- - ")
                chooseProduct(allNailPolishes, shoppingCart)
            }
            "5" -> {
                println(" - -- -  Alle Seifen  - -- - ")
                chooseProduct(allSoaps, shoppingCart)
            }
            "6" -> println("Alle ausgewählt")
            else -> println("Falsche Eingabe")
        }
    }


    fun homeMenue(shoppingCart: ShoppingCart) {
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

        when (mainMenue) {
            "1" -> println("Einkaufskorb ausgewählt")
            "2" -> chooseBPCategory(shoppingCart)
            "3" -> println("Kosmetische Behandlungen ausgewählt")
            "4" -> println("Behandlungstermine ausgewählt")
            "5" -> println("Mein Profil ausgewählt")
            else -> println("Falsche Eingabe")
        }
    }


}
