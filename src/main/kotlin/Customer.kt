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

    fun putToShoppingCart(interimList: MutableList<BeautyProduct>, shoppingCart: ShoppingCart){
        println("Gib Deine Bestellnummer ein:")
        var inputBestNr = readln().toInt()
        println("Deine Auswahl:")
        interimList[inputBestNr - 1].showEssentials()    // Weil Bestellnummern bei 1 anfangen aber der Index bei 0 anfängt
        println("Möchtest Du das in den Warenkorb legen? \n - Für 'Ja' klicke 'y': \n - Für 'Zurück' klicke 'z'")
        var inputCart = readln()
        if (inputCart == "y") {
            var localID2 = 1
            println("Wie viele Exemplare sollen in den Einkaufskorb? Bitte Anzahl eingeben: ")
            var itemsToAdd = readln().toInt()
            repeat(itemsToAdd) {
                shoppingCart.itemsList.add(interimList[inputBestNr - 1])
            }
            println("-------------------------------------------------------------------")
            println("Einkaufswagen aktualisiert:")
            for (it in shoppingCart.itemsList) {
                println("Posten Nr. $localID2:")
                it.showEssentials()
                localID2++
            }
        }else{
            println("Zurück geht noch nicht")
            // Zurück, oh man wie geht das? Mit Funktion menueVorher()
        }

    }

    // My Basic Function for "LAST Choice" with actual ID for adding to ShoppingCart(wird mal chooseProduct(allProducts: MutableList<BeautyProduct>) heissen)
    fun chooseProduct(productList: MutableList<BeautyProduct>, shoppingCart: ShoppingCart){
        var localID: Int = 1
        //Trick ich erstelle ir hier eine loka Liste, um aus ihr die Bestellung rauszusuchen bei "w"
        var interimList: MutableList<BeautyProduct> = mutableListOf()
        println(" - - - Alle Seifen - - - ")
        for (it in productList) {
            // Aktuelle ID für die interaktive Auswahl zum Warenkorb:
            it.id = localID++
            println(" - - BestellNr: ${it.id} - - ")
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
            "w" -> {putToShoppingCart(interimList, shoppingCart) } // NEXT ACTION
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
            "4" -> chooseProduct(allNailPolishes, shoppingCart)
            "5" -> chooseProduct(allSoaps, shoppingCart)
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
