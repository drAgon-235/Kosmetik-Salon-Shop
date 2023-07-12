// Produktlisten:

var abstractProducts: MutableList<BeautyProduct> = mutableListOf(
    mixed_01, mixed_02, mixed_03, mixed_04, mixed_05, mixed_06
)
var soaps: MutableList<BeautyProduct> = mutableListOf(
    Soap_01,
    Soap_02,
    Soap_03,
    Soap_04,
    Soap_05,
    Soap_06,
    Soap_07,
    Soap_08,
    Soap_09,
    Soap_10,
    Soap_11,
    Soap_12,
    Soap_13,
    Soap_14,
    Soap_14,
    Soap_15,
    Soap_16
)
var cremes: MutableList<BeautyProduct> = mutableListOf(
    Cr_01, Cr_02, Cr_03, Cr_04, Cr_05, Cr_06, Cr_07, Cr_08, Cr_09, Cr_10, Cr_11, Cr_12, Cr_13, Cr_14, Cr_15, Cr_16
)
var peelings: MutableList<BeautyProduct> = mutableListOf(
    Peel_01, Peel_02, Peel_03, Peel_04, Peel_05, Peel_06, Peel_07, Peel_08, Peel_09, Peel_10, Peel_11, Peel_12, Peel_13
)
var nailPolishes: MutableList<BeautyProduct> = mutableListOf(
    NP_01, NP_02, NP_03, NP_04, NP_05, NP_06, NP_07, NP_08, NP_09, NP_10, NP_11, NP_12
)
var bathAddits: MutableList<BeautyProduct> = mutableListOf(
    BA_01,
    BA_02,
    BA_03,
    BA_04,
    BA_05,
    BA_06,
    BA_07,
    BA_08,
    BA_09,
    BA_10,
    BA_11,
    BA_12,
    BA_13,
    BA_14,
    BA_15,
    BA_16,
    BA_17,
    BA_18,
    BA_19,
    BA_20
)


// Es werden nur die drei folgenden Listen direkt vom Programm benutzt:
// alle Produkte (Eine Liste von Listen):
var allBPs: MutableList<MutableList<BeautyProduct>> = mutableListOf(
    abstractProducts, soaps, cremes, peelings, nailPolishes, bathAddits
)

// Liste mit Bestandskunden: (mutable, flexibel und bearbeitbar)
var customersList: MutableList<Customer> = mutableListOf(
    testCustomer_01,
    testCustomer_02,
    testCustomer_03,
    testCustomer_04,
    testCustomer_05
)

// Map mit Passwörtern aller User - mutable, flexibel und bearbeitbar
var passWordDB: MutableMap<String, String> = mutableMapOf(
    "o.mueller@gmx.de" to "abc123",
    "Joe123@web.de" to "Kickerickie1234",
    "marHutten@yahoo.com" to "huttenTutten789",
    "YesKes4576@alibaba.com" to "MuNaHeDschin",
    "epry_Diamond@gmail.com" to "masturabiato12345"
)


// Liste mit Admins:
var adminsList: MutableList<Admin> = mutableListOf(
    testAdmin_01, testAdmin_02
)

// Map mit Passwörtern aller Admuns - mutable, flexibel und bearbeitbar
var passWordDBAdmin: MutableMap<String, String> = mutableMapOf(
    "gau_pali@yahoo.in" to "ganesha123",
    "MarDi@djs.tv" to "suoergeil123"
)


fun main() {










    startSeite()











}


fun startSeite() {
    println("----------------------------------------------------------------")
    println(" - - - - - - -  Willkommen im Online Beauty Shop - - - - - - - ")
    println()
    println(" 1. User - Login \n 2. Admin - Login \n 3. Sign in (neuen User erstellen) ")
    println()
    println(" Bitte Auswahl eingeben:")
    var input = readln()
    when (input) {
        "1" -> {
            println("-- - -- Deine persönliche Shopping Area -- - --")
            customersLogIn()
        }

        "2" -> {
            println("-- - -- Deine persönliche Admin Area -- - --")
            adminsLogIn()
        }

        "3" -> {
            createNewCustomer()
        }

        else -> {
            println("Falsche eingabe")
            // Einfach selbst auffangen durch Rekursion ;-D
            startSeite()
        }
    }
}


// Es folgt die zentrale Funktion, welche den Einkaufswagen und den eingeloggten Kunden übergeben bekommt und dann
// an entsprechende Funktionen weiterreicht, was für ein hohes Maß an Persistenz, Konsistenz und Kohärenz sorgt:
// Das ermöglicht eine zu 100% rekursive Implementierung - die Schleifen rufen sich gegenseitig so auf, wie es der Flow erfordert und aktualisieren dabei ggf. gewünschte Datensätze (Attribute/Variablen) - in EndlosSchleife -> ohne (großartige) SCHLEIFEN !!!.
fun customersLogIn() {
    var accLogin = CustomerAccount()
    // Die Methode .logInUser() soll einen konkreten Kunden zurückgeben, falls er es schafft, sich einzuloggen (er/sie/es hat 3 Versuche!!!):
    var kunde = accLogin.logInUser()
    // Wenn Kunde sich einloggen kann (3 Versuche), kommt er ins HomeMenue, wo sich alle andere objektorientiert abspielt:
    if (accLogin.logged) {
        // Es wird eine Shopping Cart (Einkaufswagen) für den Kunden erstellt (noch leer):
        var shoppingCart: ShoppingCart = ShoppingCart()
        // Die folgende Methode ist quasi das ganze Programm - objektorientiert eben:
        kunde.homeMenueUser(shoppingCart, kunde, accLogin)
        // Die eben erstellten 3 zetralen Objekte 'shoppingCart', 'kunde' und 'accLogin' werden von nun an, an alle zentralen Funktionen weitergegeben.
        // das ermöglicht eine zu 100% rekursive Implementierung - die Schleifen rufen sich gegenseitig so auf, wie es der Flow erfordert und aktualisieren ggf. gewünschte Datensätze (Attribute/Variablen) - in endlosSchleife-ohne (großartige) SCHLEIFEN (zumindest in der main() ) !!!.

    } else {
        println("Irgendwas ist schiefgelaufen - zurück zur Startseite")
        startSeite()
    }
}


fun adminsLogIn() {
    var adminAcc = AdminAccount()
    // Es wird ein 'leerer' Admin erstellt:
    var admin: Admin = adminAcc.logInAdmin()
    // Der wird im Falle des Einloggens konkretisiert und "eingeloggt"  -  sonst Sperre für 1 Stunde

    // Wenn Admin sich einloggen kann (3 Versuche), kommt er ins HomeMenue, wo sich alles andere objektorientiert abspielt:
    if (adminAcc.logged) {
        adminAcc.homeMenueAd(admin, adminAcc)

    } else {
        println("Irgendwas ist schiefgelaufen - zurück zur Startseite")
        startSeite()
    }
}


fun createNewCustomer() {
    println(" --  --  --  Erstelle einen neuen Kundenaccount  --  --  --")
    println("Bitte Name eingeben:")
    var name = readln()
    println()
    println("Bitte Adresse eingeben:")
    var adress = readln()
    println()
    println("Bitte email Adresse eingeben:")
    var email = readln()
    println()
    println("Bitte Password eingeben:")
    var pw1 = readln()
    //println("Bitte Passwort wiederholen")
    //var pw2 = readln()

    var custumNr = customersList[customersList.lastIndex].customNr + 1
    var newCustomer: Customer = Customer()

    println()
    println("Sind Ihre Eingaben korrekt? ")
    println("Name: $name")
    println("Adresse: $adress")
    println("email: $email")
    println("Passwort: $pw1")
    println("Nr: $custumNr")
    println()
    println("Sind die Daten korrekt? \n 1. Ja, einchecken bitte. \n 2. Nein, nochmal von vorne \n 3. Home")
    var input = readln()
    when (input) {
        "1" -> {
            newCustomer = Customer(custumNr, name, adress, email, pw1, 0.0)
            customersList.add(newCustomer)
            passWordDB[email] = pw1
            /*
            println(" Listen Test ")
            for (it in passWordDB) {
                println("Wert:")
                println(it.value)
                println("Key:")
                println(it.key)
            }

             */
            Thread.sleep(1500)
            println()
            println(". . .")
            println()
            startSeite()
            println("Der Account wurde erfolgreich erstellt - Sie können sich jetzt einloggen")
            Thread.sleep(1500)
            println()
            println(". . .")
            println()
            startSeite()
        }

        "2" -> {
            createNewCustomer()
        }

        "3" -> startSeite()
        else -> {
            println("Etwas ist schief gelaufen - nochmal von vorne bitte:")
            createNewCustomer()
        }
    }
}








