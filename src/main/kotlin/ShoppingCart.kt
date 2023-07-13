class ShoppingCart {
    var itemsList: MutableList<BeautyProduct> = mutableListOf()
    var priceTotal: Double = 0.0


    fun payAndBuy(shoppingCart: ShoppingCart, kunde: Customer, account: CustomerAccount) {
        println()
        println("Vielen Dank für Ihren Einkauf.")
        // Da die Elemente der items List nur Pointer auf die OriginalObjekte darstellen, reicht es das Attribut für Lageranzahl (inStock: Int) in der klasseneigenen 'itemsList' zu ändern; dadurch werden die OriginalObjekte aktualisiert (getestet Check )
        for (it in shoppingCart.itemsList) {
            it.inStock = it.inStock - 1
        }
        // Den gesamten Einkauf in ein Objekt packen ...
        var order = Order(shoppingCart.itemsList, priceTotal)
        // ... und in die individuelle  'purchases' Liste (Account.kt) speichern:
        account.purchases.add(order)
        println("Der Versand erfolgt an die gespeicherte Adresse")
        println("(Das Lager (inStock) wurde aktualisiert)")
        // Anschließend noch die Einkaufliste leeren: NOOOOO das macht RIESENPROBLEME zumindest an dieser Stelle
        //flushShoppingCart()
        // Abschlließende Optionen:
        println("- -- - -- - -- - -- - -- - -- - -- - -- - -- - -- - -- - -- - -- - -- -")


        println("Abschließende Optionen: \n 1. Einkaufsdetails ansehen \n 2. Home")
        var inputOptions = readln()
        when (inputOptions) {
            "1" -> {
                Thread.sleep(1000)
                println("- -- - -- - -- - -- - -- - -- - -- - -- - -- - -- - -- - -- - -- - -- -")
                Thread.sleep(1000)
                println("Folgender Einkauf wurde in Deiner Einkaufsübersicht archiviert")
                order.showOrderDetails(account)
                flushShoppingCart()     // hier ist die Funktion an der RICHTIGEN Stelle (man, hat das gedauert ...!!!!, verdammt aber immer noch nicht optimal.... ggrrrr)
                println("- -- - -- - -- - -- - -- - -- - -- - -- - -- - -- - -- - -- - -- - -- -")
                println("Optionen: \n 1. Home \n 2. Mein Profil")
                var input2 = readln()
                when (input2) {
                    "1" -> {
                        println("Du wirst zur Home Seite geleitet")
                        Thread.sleep(1000)
                        println("... \n ... \n ...")
                        Thread.sleep(2000)
                        kunde.homeMenueUser(shoppingCart, kunde, account)
                    }

                    "2" -> {
                        account.custLoginArea(shoppingCart, kunde, account)
                    }

                    else -> {
                        println(" Falsche eingabe \n  - Nochmal von vorne ....")
                        payAndBuy(shoppingCart, kunde, account)
                    }
                }
                println("- -- - -- - -- - -- - -- - -- - -- - -- - -- - -- - -- - -- - -- - -- -")
            }

            "2" -> {
                println("Du wirst zur Home Seite geleitet")
                Thread.sleep(1000)
                println("... \n ... \n ...")
                Thread.sleep(2000)
                kunde.homeMenueUser(shoppingCart, kunde, account)
            }

            else -> {
                println(" Falsche eingabe \n - Nochmal von vorne ....")
                payAndBuy(shoppingCart, kunde, account)
            }
        }

    }

    fun payAndBuyOptions(shoppingCart: ShoppingCart, kunde: Customer, account: CustomerAccount) {
        println("Bitte Bezahlmethode auswählen: \n 1. PayPal \n 2. Kreditkarte \n 3. Clarna \n 4. Blitzüberweisung \n 5. Home (zurück)")
        var methode = readln()
        when (methode) {
            "1" -> {
                payAndBuy(shoppingCart, kunde, account)
            }

            "2" -> {
                payAndBuy(shoppingCart, kunde, account)
            }

            "3" -> {
                payAndBuy(shoppingCart, kunde, account)
            }

            "4" -> {
                payAndBuy(shoppingCart, kunde, account)
            }

            "5" -> {
                println("Du wirst zur Home Seite geleitet")
                Thread.sleep(1000)
                println("... \n ... \n ...")
                Thread.sleep(2000)
                kunde.homeMenueUser(shoppingCart, kunde, account)
            }
        }
    }


    fun sumCart(): Double {
        for (it in itemsList) {
            priceTotal += it.price
        }
        return priceTotal
    }



    fun addToShoppingCart(
        interimList: MutableList<BeautyProduct>,
        shoppingCart: ShoppingCart,
        kunde: Customer,
        account: CustomerAccount
    ) {
        println("Gib Deine Bestellnummer ein:")
        var inputBestNr = readln().toInt()
        println("Deine Auswahl:")
        interimList[inputBestNr - 1].showEssentials()    // -1, weil Bestellnummern bei 1 anfangen aber der Index bei 0 anfängt
        println("Möchtest Du das in den Warenkorb legen? \n - 1. Ja \n - 2. Nein(Home Menue)")

        var inputCart = readln()
        when(inputCart){
            "1" -> {
                println(" . . . ")
                Thread.sleep(1500)
                println(" . . . ")
                println("Wie viele Exemplare sollen in den Warenkorb? Bitte Anzahl eingeben: ")
                var itemsToAdd = readln().toInt()
                // !!! Überprüfung, ob genug auf Lager ist !!! Wenn ja,:
                if (itemsToAdd <= interimList[inputBestNr - 1].inStock){
                    // Hier wird der Artikel in den Einkaufswagen gepackt, so oft wie gewünscht)
                    repeat(itemsToAdd) {
                        itemsList.add(interimList[inputBestNr - 1])
                    }
                    println("-------------------------------------------------------------------")
                    println("Warenkorb aktualisiert:")
                    showShoppingCart(shoppingCart, kunde, account)

                } else {
                    println(" . . . ")
                    Thread.sleep(1500)
                    println(" . . . ")
                    println("Leider nicht genügend Ware im Lager.")
                    println("Try again ...")
                    Thread.sleep(1500)
                    println(" . . . ")
                    addToShoppingCart(interimList, shoppingCart, kunde, account)
                }
            }
            "2" -> kunde.homeMenueUser(shoppingCart, kunde, account)
            else -> {
                println("Falsche Eingabe - Nochmal von vorne: ")
                println("...")
                addToShoppingCart(interimList, shoppingCart, kunde, account)
            }

        }

    }


    fun showShoppingCart(shoppingCart: ShoppingCart, kunde: Customer, account: CustomerAccount) {
        // Mehrere identische Artikel werden alle einzeln aufgeführt... (noch - BONUS-Aufgabe)
        println(" -- -- Einkaufswagen -- -- ")
        var postenID = 1
        if (itemsList.isNotEmpty()) {
            for (it in itemsList) {
                println("Posten Nr. $postenID:")
                it.showEssentials()
                postenID++
            }
            println("Summe:  ${sumCart()} €")
            println("- - - - - - - - - - - - - - - - -")
            println("Möchtest Du: \n 1. Weiter Einkaufen (Speichern & Home)  \n 2. Bezahlen und kaufen  \n 3. Einkaufswagen leeren")
            var input = readln()
            when (input) {
                "1" -> {
                    kunde.homeMenueUser(this, kunde, account)
                }

                "2" -> {
                    payAndBuyOptions(shoppingCart, kunde, account)
                }

                "3" -> {
                    flushShoppingCart()
                    // Nach dem Flushen wiederholt sich die Schleife selbst ;-D  :
                    showShoppingCart(shoppingCart, kunde, account)
                }

                else -> {
                    println("Falsche Eingabe")
                    // auch bei falscher Eingabe wiederholt sich die Schleife selbst ;-D  :
                    showShoppingCart(
                        shoppingCart,
                        kunde, account
                    )
                }
            }
        } else {
            println("        - L E E R -")
            println("- - -- - - -- - - -- - - -- - - -- - - -- - - -- - -")
            // Automatische Weiterleitung zu Home Menue:
            kunde.homeMenueUser(shoppingCart, kunde, account)
        }
    }


    fun flushShoppingCart() {
        itemsList.removeAll(itemsList)
    }


    // BONUS: Funktion die einzelne ausgewählte elemente entfernt:
}