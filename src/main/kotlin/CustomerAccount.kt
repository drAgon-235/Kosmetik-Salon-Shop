// Diese Klasse verwaltet vor allem den Login zum Account
class CustomerAccount {

    // Zentrales Attribut. Wird erst nach Instaziierung gesetted und entscheidet (in der Main) über den weiteren Flow
    var logged: Boolean = false

    var purchases: MutableList<Order> = mutableListOf()




    fun custLoginArea(shoppingCart: ShoppingCart, kunde: Customer, account: CustomerAccount) {
        println(" - -- - -- -  Mein Account - -- - -- - ")
        println(" 1. Archiv: Meine Einkäufe \n 2. Aktuelle Einkaufsliste \n 3. Home Menue ( shoppen gehen ;-D ) \n 4. Log Out ")
        var input = readln()
        when (input) {
            "1" -> account.showOrders(shoppingCart, kunde, account)
            "2" -> shoppingCart.showShoppingCart(shoppingCart, kunde, account)
            "3" -> kunde.homeMenueUser(shoppingCart, kunde, account)
            "4" -> account.logOutUser()
            else -> {
                println("Falsche Eingabe")
                // Methode ruft sich einfach selbst nochmal auf - rekursiv - somit fängt sie sich selbst auf !!!
                custLoginArea(shoppingCart, kunde, account)
            }
        }
    }


    fun showOrders(shoppingCart: ShoppingCart, kunde: Customer, account: CustomerAccount) {
        println(" -- -- Übersicht aller Deiner Einkäufe -- -- ")
        for (it in purchases) {
            it.showOrderDetails(account)
            // TODO
        }
        println("Optionen: \n 1. Zurück zu 'Mein Account' \n 2. Home")
        var input = readln()
        when (input) {
            "1" -> custLoginArea(shoppingCart, kunde, account)
            "2" -> kunde.homeMenueUser(shoppingCart, kunde, account)

        }
    }



    fun checkPW(email: String, password: String): Boolean {
        var bool: Boolean = false
        //Check ob User existiert - sollte unbedingt zuerst erfolgen:
        if (email in passWordDB.keys) {
            //Erst dann kommt Passwort-Check:
            if (password == passWordDB[email]) {
                // Wenn das eingegebene PW auch mit dem hinterlegten Passwort von 'name' übereinstimmt, wird auf 'true' gesetzt; ansonsten ist und bleibt der login defaultmäßig 'false'
                bool = true
                logged = true
            }
        } else {
            // Info-Meldung, wenn User nicht in DB: (optional, (kann gerne aus Sicherheitsgründen weggelassen werden))
            println("User unbekannt")
        }
        return bool
    }


    fun checkUserExistence(accOwner: String): Boolean {
        if (accOwner in passWordDB.keys)
            return true
        else
            throw Exception("- - User unbekannt Exception - -")
        //is klar, ne
    }


    //Folgende ZENTRALE Funktion gibt einen spezifischen Customer zurück, mit all seinen Attributen etc., falls er es geschafft hat sich einzuloggen und nicht 3 mal zu failen:
// Es werden die obe gebauten Funktionen benutzt:
    fun logInUser(): Customer {
        var loggedCoustomer: Customer = Customer()
        println("- - - Log In User - - -")
        println("Bitte Email-Adresse eingeben:")
        val inhName = readln()

        // Den Counter brauchen wir für die do-while Schleife, damit nach drei falschen Passwort Eingabeversuchen der Login für genau dieses Konto eine Stunde lang geblockt wird.
        var counter: Int = 3

        // Die Variable speichert den Bool zustand zwischendurch, um mithilfe der do-while Schleifen nach Bedarf weiterzumachen oder abzubrechen...
        var logInBool: Boolean = false

        do {
            // Überprüfung, ob User überhaupt existiert - wenn Fehler bei der eingabe --> gewünschte Exception -> wird unten abgefangen
            try{
            if (checkUserExistence(inhName)) {
                println("Bitte Passwort eingeben:")
                val pw = readln()
                // Die Überprüfuung des Passwords mittels der Funktion logIn() erfolgt insgesamt so oft, wie in der Variable 'counter' steht
                logInBool = checkPW(inhName, pw)

                if (logInBool) {
                    //Sobald Passwort richtig ist, wird counter auf 0 gesetzt, weil nicht weiter runtergezählt werden muss und darf!!!
                    counter = 0

                    // Hier wird der Kunde mit dem richtigen PW UND der richtigen Email (doppelte Absicherung, falls PW-Doubletten exisistieren) gesucht und gespeichert & am Ende returned !!!  (danach Abbruch der Schleife)
                    for (it in customersList) {
                        if (it.email == inhName) {
                            for (it in customersList) {
                                if (it.password == pw)
                                    loggedCoustomer = it
                            }
                            // Hier hatte ich das Problem (2 h), dass wenn zwei Leute das gleiche PW hatten, kam immer nur der erste raus
                            // ich bin sicher es geht auch einfacher mit Lambda... aber ich war so froh, als das endlich lief ...
                            // müsste noch der Fall abgefangen werde, wo zwei Kunden sowohl das gleiche PW als auch die gleiche Email haben, was ja nicht geht. Muss irgendwie bei der eingabe des PW erfolgen ... ja und der Email erfolgen... TODO Bonus
                            println("Hallo ${it.name}, Du hast Dich erfolgreich eingeloggt.  ")
                            break
                        }
                    }
                    // Falls das Passwort falsch ist, hat man 3 Chancen, es zu wiederholen:
                } else {
                    counter--
                    println(" Falsches Passwort \nDu hast noch $counter Versuche... ")
                    if (counter == 0) {
                        println(
                            "Sorry, nach 3 falschen Passworteingaben wird der Login für eine Stunde geblockt " +
                                    "\nund eine Sicherheits-Email an den Kontoinhaber gesendet. " +
                                    "\nAnzeige ist raus... "
                        )
                        break
                    }
                }
                // Falls der Kontoinhaber nicht existiert, wird eine vorher definierte Exception ausgeschmissen:
            }
            }catch (e: Exception){
                println("User unbekannt - bitte nochmal probieren:")
                logInUser()   // Und wieder eine Abfangrekursion, diesmal mit Ansage
            }
            // es geht weiter und evtl. von vorne, bis 3 mal das falsche PW eingegeben wurde:
        } while (counter > 0)

        return loggedCoustomer
    }


    fun logOutUser() {
        this.logged = false
        println("--------------- - ---------------- - ---------------- - ------------")
        Thread.sleep(1500)
        println("                - Du hast Dich erfolgreich ausgeloggt - ")
        Thread.sleep(1500)
        startSeite()
    }


}