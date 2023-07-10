// Diese Klasse verwaltet vor allem den Login zum Account
class Account {

    // Zentrales Attribut. Wird erst nach Instaziierung gesetted und entscheidet (in der Main) über den weiteren Flow
    var logged: Boolean = false

    // Liste mit Passwörtern aller User - mutable, flexibel und bearbeitbar
    // (inkl. "Bestandskunden")
    var passWordDB: MutableMap<String, String> = mutableMapOf(
        "o.mueller@gmx.de" to "abc123",
        "Joe123@web.de" to "Kickerickie1234",
        "marHutten@yahoo.com" to "huttenTutten789",
        "YesKes4576@alibaba.com" to "MuNaHeDschin",
        "epry_Diamond@gmail.com" to "masturabiato12345"
    )


    fun logOut(){
        this.logged = false
        println("--------------- - ---------------- - ---------------- - ------------")
        Thread.sleep(1500)
        println("                - Du hast Dich erfolgreich ausgeloggt - ")
        Thread.sleep(1500)
        startSeite()
    }


    fun logIn(email: String, password: String): Boolean {
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
            throw Exception("- - User unbekannt - -")
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
            // Überprüfung, ob User überhaupt existiert - wenn Fehler bei der eingabe --> gewünschte Exception
            if (checkUserExistence(inhName)) {
                println("Bitte Passwort eingeben:")
                val pw = readln()
                // Die Überprüfuung des Passwords mittels der Funktion logIn() erfolgt insgesamt so oft, wie in der Variable 'counter' steht
                logInBool = logIn(inhName, pw)

                if (logInBool) {
                    //Sobald Passwort richtig ist, wird counter auf 0 gesetzt, weil nicht weiter runtergezählt werden muss und darf!!!
                    counter = 0

                    // Hier wird der Kunde mit dem richtigen PW gesucht und gespeichert & am Ende returned !!!  (danach Abbruch der Schleife)
                    for (it in customersList) {
                        if (it.password == pw) {
                            loggedCoustomer = it
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
            }
            // es geht weiter und evtl. von vorne, bis 3 mal das falsche PW eingegeben wurde:
        } while (counter > 0)

        return loggedCoustomer
    }


    fun createNewUser() {


        //Einfügen in die globale Liste aller User:


    }


    fun menue() {

    }
}