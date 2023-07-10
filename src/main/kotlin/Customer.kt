class Customer() {
    var customNr: Int = 0
    var name: String = ""
    var adress: String = ""
    var email: String = ""
    var password: String = ""
    var saldo: Double = 0.0

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
    fun finalProductSelection(productList: MutableList<BeautyProduct>, shoppingCart: ShoppingCart, kunde: Customer){
        var localID: Int = 1
        //Trick ich erstelle ir hier eine lokale Liste für die finale Artikelauswahl
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
            "Aktion auswählen: \n  1. Home" +
                    "\n  2. Sortieren nach Preis klicke " +
                    "\n  3. ein Produkt zum Einkaufskorb hinzuzufügen "
        )
        var inputAction = readln()
        when (inputAction) {
            "1" -> homeMenue(shoppingCart, kunde)
            "2" -> println("Alphabetisch sortieren")
            "3" -> {shoppingCart.addToShoppingCart(interimList, kunde) } // Hier wird abgefragt wieviel Exemplare des Produkts in den Einkaufswagen kommen und werden dann entsprechend hinzugefügt
            else -> println("Falsche Eingabe")
        }
        //return interimList
    }

    fun filterCategory(category: Category): MutableList<BeautyProduct> {
        var catList = mutableListOf<BeautyProduct>()
        for (BPlist in allBPs){
            for (it in BPlist){
                if (it.category == category ){
                    catList.add(it)
                }
            }
        }
        return catList
    }

    // Menue-Auswahl der Kategorie, benutzt die Funktion filterCategory( s.o. ), welche einen Category.ENUM als Parameter bekommt :
    fun chooseCategoryAction(shoppingCart: ShoppingCart, kunde: Customer){
        println(" - -- -- -- Kategorie-Auswahl -- -- -- - ")
        println(
            "Kategorie auswählen oder alle ansehen:" +
                    "\n 1. Körper " +
                    "\n 2. Gesicht " +
                    "\n 3. Hände " +
                    "\n 4. Füße " +
                    "\n 5. Andere " +
                    "\n 6. Home"
        )
        var inputCateg = readln()
        when (inputCateg) {
            "1" -> {
                println(" - -- -  Alles für den Körper  - -- - ")
                var bodyBPs: MutableList<BeautyProduct> = mutableListOf()
                // Alle Produkte mit der Catekorie BODY (Körper):
                bodyBPs = filterCategory(Category.BODY)
                // Ein Produkt anhand der BestellNr. auswählen und zum Einkaufskorb hinzufügen:
                finalProductSelection(bodyBPs, shoppingCart, kunde)
            }
            "2" -> {
                println(" - -- -  Alles für das Gesicht  - -- - ")
                var faceBPs: MutableList<BeautyProduct> = mutableListOf()
                // Alle Produkte mit der Catekorie BODY (Körper):
                faceBPs = filterCategory(Category.GESICHT)
                // Ein Produkt anhand der BestellNr. auswählen und zum Einkaufskorb hinzufügen:
                finalProductSelection(faceBPs, shoppingCart, kunde)
            }
            "3" -> {
                println(" - -- -  Alles für die Hände  - -- - ")
                var handsBPs: MutableList<BeautyProduct> = mutableListOf()
                // Alle Produkte mit der Catekorie BODY (Körper):
                handsBPs = filterCategory(Category.HAENDE)
                // Ein Produkt anhand der BestellNr. auswählen und zum Einkaufskorb hinzufügen:
                finalProductSelection(handsBPs, shoppingCart, kunde)
            }
            "4" -> {
                println(" - -- -  Alles für die Füße  - -- - ")
                var feetBPs: MutableList<BeautyProduct> = mutableListOf()
                // Alle Produkte mit der Catekorie BODY (Körper):
                feetBPs = filterCategory(Category.FUESSE)
                // Ein Produkt anhand der BestellNr. auswählen und zum Einkaufskorb hinzufügen:
                finalProductSelection(feetBPs, shoppingCart, kunde)
            }
            "5" -> {
                println(" - -- -  Andere Wellness-Produkte  - -- - ")
                finalProductSelection(abstractProducts, shoppingCart, kunde)
            }

            "6" -> homeMenue(shoppingCart, kunde)
            else -> println("Falsche Eingabe")
        }

    }


    fun chooseBPAction(shoppingCart: ShoppingCart, kunde: Customer) {
        println("Beauty Produkte ausgewählt")
        println(
            "Kategorie auswählen oder alle ansehen:" +
                    "\n 1. Seifen " +
                    "\n 2. Crèmes " +
                    "\n 3. Peelings " +
                    "\n 4. Nagellacke " +
                    "\n 5. Badezusätze " +
                    "\n 6. Andere " +
                    "\n 7. Home"
        )
        var inputCateg = readln()
        when (inputCateg) {
            "1" -> {
                println(" - -- -  Alle Seifen  - -- - ")
                finalProductSelection(soaps, shoppingCart, kunde)
            }
            "2" -> {
                println(" - -- -  Alle Crèmes  - -- - ")
                finalProductSelection(cremes, shoppingCart, kunde)
            }
            "3" -> {
                println(" - -- -  Alle Peelings  - -- - ")
                finalProductSelection(peelings, shoppingCart, kunde)
            }
            "4" -> {
                println(" - -- -  Alle Nagellacke  - -- - ")
                finalProductSelection(nailPolishes, shoppingCart, kunde)
            }
            "5" -> {
                println(" - -- -  Alle Badezusätze  - -- - ")
                finalProductSelection(bathAddits, shoppingCart, kunde)
            }
            "6" -> {
                println(" - -- -  Andere tolle Wellness-Produkte  - -- - ")
                finalProductSelection(abstractProducts, shoppingCart, kunde)
            }
            // rekursiver aufruf der Methode homeMenue(s. u.)
            "7" -> homeMenue(shoppingCart, kunde)
            else -> println("Falsche Eingabe")
        }
    }





}
