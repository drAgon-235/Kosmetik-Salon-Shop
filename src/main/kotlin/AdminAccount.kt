class AdminAccount {
    var logged = false


    fun homeMenueAd(admin: Admin, adminAccount: AdminAccount) {
        println(
            " - -- - -- -  Admin - Menue - -- - -- - " +
                    "\n 1. Neues Produkt erstellen " +
                    "\n 2. Neuen Admin-Kollegen erstellen" +
                    "\n 3. Logout" +
                    "\n    Bitte Nr. eingeben: "
        )
        var mainMenue = readln()

        when (mainMenue) {
            "1" -> admin.createBP(admin, adminAccount)
            "2" -> admin.createCoAdmin(admin, adminAccount)
            "3" -> adminAccount.logOutA()
            else -> {
                println("Falsche Eingabe")
                // Methode ruft sich einfach selbst nochmal auf - rekursiv - somit fängt sie sich selbst auf !!!
                homeMenueAd(admin, adminAccount)
            }
        }
    }


    fun checkAdminExistence(accOwner: String): Boolean {
        if (accOwner in passWordDBAdmin.keys)
            return true
        else
            throw Exception("- - Admin unbekannt - -")
        //is klar, ne
    }


    fun logInAdmin(): Admin {
        var loggedAdmin: Admin = Admin()
        println("- - - Log In Admin - - -")
        println("Bitte Email-Adresse eingeben:")
        val inhName = readln()

        // Den Counter brauchen wir für die do-while Schleife, damit nach drei falschen Passwort Eingabeversuchen der Login für genau dieses Konto eine Stunde lang geblockt wird.
        var counter: Int = 3

        // Die Variable speichert den Bool zustand zwischendurch, um mithilfe der do-while Schleifen nach Bedarf weiterzumachen oder abzubrechen...
        var logInBool: Boolean = false

        do {
            // Überprüfung, ob Admin überhaupt existiert - wenn Fehler bei der eingabe --> gewünschte Exception -> wird unten abgefangen
            try{
            if (checkAdminExistence(inhName)) {
                println("Bitte Passwort eingeben:")
                val pw = readln()
                // Die Überprüfuung des Passwords mittels der Funktion logInAdmin() erfolgt insgesamt so oft, wie in der Variable 'counter' steht
                logInBool = logInA(inhName, pw)   //  !!!!!

                if (logInBool) {
                    //Sobald Passwort richtig ist, wird counter auf 0 gesetzt, weil nicht weiter runtergezählt werden muss und darf!!!
                    counter = 0

                    // Hier wird der Admin mit dem richtigen PW gesucht und gespeichert & am Ende returned !!!  (danach Abbruch der Schleife)
                    for (it in adminsList) {
                        if (it.password == pw) {
                            loggedAdmin = it
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
                    } else {
                        // Just Chill
                    }
                }
                // Falls der Kontoinhaber nicht existiert, wird eine vorher definierte Exception ausgeschmissen:
            } else {
                // Es wird evtl. die "Kontoinhaber unbekannt - Exception" ausgeführt
                //println("User unbekannt")
            }}catch (e: Exception){
                println(" Unbekannter Admin - bitte nochmal probieren")
                logInAdmin()
            }
            // es geht weiter und evtl. von vorne, bis 3 mal das falsche PW eingegeben wurde:
        } while (counter > 0)

        return loggedAdmin
    }


    fun logInA(email: String, password: String): Boolean {
        var bool: Boolean = false
        //Check ob User existiert - sollte unbedingt zuerst erfolgen:
        if (email in passWordDBAdmin.keys) {
            //Erst dann kommt Passwort-Check:
            if (password == passWordDBAdmin[email]) {
                // Wenn das eingegebene PW auch mit dem hinterlegten Passwort von 'name' übereinstimmt, wird auf 'true' gesetzt; ansonsten ist und bleibt der login defaultmäßig 'false'
                bool = true
                this.logged = true
            }
        } else {
            // Info-Meldung, wenn User nicht in DB: (optional, (kann gerne aus Sicherheitsgründen weggelassen werden))
            println("Admin unbekannt")
        }
        return bool
    }


    fun logOutA(){
        this.logged = false
        println("--------------- - ---------------- - ---------------- - ------------")
        Thread.sleep(1500)
        println("                - Du hast Dich erfolgreich ausgeloggt - ")
        Thread.sleep(1500)
        startSeite()
    }


}