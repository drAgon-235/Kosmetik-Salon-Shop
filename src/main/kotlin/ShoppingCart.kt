class ShoppingCart {
    var itemsList: MutableList<BeautyProduct> = mutableListOf()
    val priceTotal: Double = 0.0


    fun addToShoppingCart(interimList: MutableList<BeautyProduct>){
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
            showShoppingCart()

        }else{
            println("Zurück geht noch nicht")
            // Zurück, oh man wie geht das? Mit Funktion menueVorher()
        }

    }


    fun showShoppingCart(){
        println(" -- -- Einkaufswagen -- -- ")
        var postenID = 1
        if (itemsList.isNotEmpty()){
            for (it in itemsList) {
                println("Posten Nr. $postenID:")
                it.showEssentials()
                postenID++
            }
        } else {
            println("        - L E E R -")
        }
    }


    fun flushShoppingCart(){
        itemsList.removeAll(itemsList)
    }
}