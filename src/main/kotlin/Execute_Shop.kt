fun main() {

    // Konkreten Kunden als Variable abspeichern, mit der dann gearbeitet wird:
    val kunde: Customer = Customer()

    // Soll einen konkreten Kunden raus schmeissen, falls er es schafft, sich einzuloggen:
    personalLogInArea()



}


fun logIn(email: String, password: String): Boolean {
    var bool: Boolean = false
    //Check ob User existiert - sollte unbedingt zuerst erfolgen:
    if (email in passWordDB.keys) {
        //Erst dann kommt Passwort-Check:
        if (password == passWordDB[email]) {
            // Wenn das eingegebene PW auch mit dem hinterlegten Passwort von 'name' übereinstimmt, wird auf 'true' gesetzt; ansonsten ist und bleibt der login defaultmäßig 'false'
            bool = true
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
}

fun personalLogInArea() {
    println("- - - Log In - - -")
    println("Bitte Email-Adresse eingeben:")
    val inhName = readln()

    // Den Counter brauchen wir für die do-while Schleife, damit nach drei falschen Passwort Eingabeversuchen der Login für genau dieses Konto eine Stunde lang geblockt wird.
    var counter: Int = 2

    // Die Variable speichert den Bool zustand zwischendurch, um mithilfe der do-while Schleifen nach Bedarf weiterzumachen oder abzubrechen...
    var logInBool: Boolean = false

    do {
        // Überprüfung, ob Kontoinhaber überhaupt existiert - wenn Fehler bei der eingabe --> gewünschte Exception
        if (checkUserExistence(inhName)) {
            println("Bitte Passwort eingeben:")
            val pw = readln()
            // Die Überprüfuung des Passwords mittels der Funktion logIn() erfolgt insgesamt so oft, wie in der Variable 'counter' steht
            logInBool = logIn(inhName, pw)

            if (logInBool) {
                //Sobald Passwort richtig ist, wird counter auf 0 gesetzt, weil nicht weiter runtergezählt werden muss und darf!!!
                counter = 0
                println("Hallo $inhName. Willkommen in Deinem persönlichen Log-In-Bereich. ")



                //Die Schleife wird wiederholt, solange man eingeloggt ist :
                do {

                } while (logInBool)


                // Falls das Passwort falsch ist, hat man 3 Chancen, es zu wiederholen:
                // es geht weiter bei "while (counter >= 0)" und evtl. von vorne
            } else {
                println(" Falsches Passwort \nDu hast noch $counter Versuche... ")
                counter--

            }
            // Falls der Kontoinhaber nicht existiert, wird eine vorher definierte Exception ausgeschmissen:
        } else {
            // Es wird evtl. die "Kontoinhaber unbekannt - Exception" ausgeführt
            println("User unbekannt")
        }
    } while (counter >= 0)

    println(
        "Sorry, nach 3 falschen Passworteingaben wird der Login für eine Stunde geblockt " +
                "\nund eine Sicherheits-Email an den Kontoinhaber gesendet. " +
                "\nAnzeige ist raus... "
    )

}