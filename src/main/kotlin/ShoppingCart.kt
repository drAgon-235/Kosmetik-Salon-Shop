class ShoppingCart {
    var itemsList: MutableList<BeautyProduct> = mutableListOf()
    var priceTotal: Double = 0.0


    fun deleteFromStock(){
        println()
        println("Der Einkauf wird getätigt")
        // Die Verschachtelung ist notwenig dadurch, dass die Gesamtliste geck´heckt wird, die selber aus l´Listen besteht:
        for (iOberliste in itemsList){
           for (iUnterliste in allBPs){
               for (bp in iUnterliste)
               if (iOberliste.equals(bp)){
                   bp.inStock - 1            // Wieso Funktioniert das nicht ?!?!?! verd....
               }
           }
        }

        // Test:
        //println("TEST: Liste nach Abzug vom Lager")
        //showShoppingCart()

    }

    fun payAndBuy(){
        println("Bitte Bezahlmethode auswählen: \n 1. PayPal \n 2. Kreditkarte \n 3. Clarna \n 4. Blitzüberweisung \n 5. Home (zurück)")
        var methode = readln()
        when(methode){
            "1" -> {deleteFromStock()}
            "2" -> {}
            "3" -> {}
            "4" -> {}
            "5" -> {}
        }

    }


    fun sumCart(): Double {
        var sum: Double = 0.0
        for (it in itemsList){
            sum += it.price
        }
        return sum
    }

    fun addToShoppingCart(interimList: MutableList<BeautyProduct>, kunde: Customer){
        println("Gib Deine Bestellnummer ein:")
        var inputBestNr = readln().toInt()
        println("Deine Auswahl:")
        interimList[inputBestNr - 1].showEssentials()    // Weil Bestellnummern bei 1 anfangen aber der Index bei 0 anfängt
        println("Möchtest Du das in den Warenkorb legen? \n - Für 'Ja' klicke 'y': \n - Für 'Zurück' klicke 'z'")
        var inputCart = readln()
        if (inputCart == "y") {
            println("Wie viele Exemplare sollen in den Einkaufskorb? Bitte Anzahl eingeben: ")
            var itemsToAdd = readln().toInt()
            repeat(itemsToAdd) {
                itemsList.add(interimList[inputBestNr - 1])
            }
            println("-------------------------------------------------------------------")
            println("Einkaufswagen aktualisiert:")
            showShoppingCart(kunde)

        }else{
            println("Zurück geht noch nicht")
            // Zurück, oh man wie geht das? Mit Funktion menueVorher()
        }

    }


    fun showShoppingCart(kunde: Customer){
        // Mehrere identische Artikel werden alle einzeln aufgeführt... (noch - BONUS-Aufgabe)
        println(" -- -- Einkaufswagen -- -- ")
        var postenID = 1
        if (itemsList.isNotEmpty()){
            for (it in itemsList) {
                println("Posten Nr. $postenID:")
                it.showEssentials()
                postenID++
            }
            println("Summe:  ${sumCart()} €")
            println("- - - - - - - - - - - - - - - - -")
            println("Möchtest Du: \n 1. Bezahlen unf kaufen \n 2. Einkaufswagen leeren \n 3. Speichern & Home" )
            var input = readln()
            when(input){
                "1" -> {payAndBuy()}
                "2" -> {flushShoppingCart()}
                "3" -> {homeMenue(this, kunde)
                    // homeMenue(itemsList)
                    // wie kriege ich das hier am besten hin ???
                }
                else -> {
                    println("Falsche Eingabe")
                    showShoppingCart(kunde)          // bei falscher Eingabe wiederholt sich die Schleife selbst ;-D
                }
            }



        } else {
            println("        - L E E R -")
        }
    }


    fun flushShoppingCart(){
        itemsList.removeAll(itemsList)
    }



    // BONUS: Funktion die einzelne ausgewählte elemente entfernt:
}