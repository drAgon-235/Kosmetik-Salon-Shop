




// Produktlisten:
var abstractProducts: MutableList<BeautyProduct> = mutableListOf(
    mixed_01, mixed_02, mixed_03, mixed_04, mixed_05, mixed_06
)
var soaps: MutableList<BeautyProduct> = mutableListOf(
    Soap_01, Soap_02, Soap_03, Soap_04, Soap_05, Soap_06, Soap_07, Soap_08, Soap_09, Soap_10, Soap_11, Soap_12, Soap_13, Soap_14, Soap_14, Soap_15, Soap_16
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
    BA_01, BA_02, BA_03, BA_04, BA_05, BA_06, BA_07, BA_08, BA_09, BA_10, BA_11, BA_12, BA_13, BA_14, BA_15, BA_16, BA_17, BA_18, BA_19, BA_20
)


// Es werden nur die zwei folgenden Listen beutzt:
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



fun main() {

    startSeite()

}

fun startSeite(){
    println("----------------------------------------------------------------")
    println(" - - - - - - -  Willkommen im Online Beauty Shop - - - - - - - ")
    println()
    println(" 1. User - Login \n 2. Admin - Login")
    println()
    println(" Bitte Auswahl eingeben:")
    var input = readln()
    when(input){
        "1" -> {
            println("-- - -- Deine persönliche Shopping Area -- - --")
            customersLogIn()}
        "2" -> {
            //TODO
        }
        else -> {
            println("Falsche eingabe")
            // Einfach selbst auffangen durch Rekursion ;-D
            startSeite()
        }
    }
}


// Zentrale Funktion, welche den Einkaufswagen und den eingeloggten Kunden übergeben bekommt und dann
// an entsprechende Funktionen weiterreicht, was für ein hohes Maß an Persistenz, Konsistenz und Kohärenz sorgt:
// Das ermöglicht eine zu 100% rekursive Implementierung - die Schleifen rufen sich gegenseitig so auf, wie es der Flow erfordert und aktualisieren dabei ggf. gewünschte Datensätze (Attribute/Variablen) - in EndlosSchleife -> ohne (großartige) SCHLEIFEN !!!.
fun homeMenue(shoppingCart: ShoppingCart, kunde: Customer, account: Account) {
    println(
        " - -- - -- -  Home - Menue - -- - -- - " +
                "\n 1. Einkaufskorb " +
                "\n 2. Alle Beauty Produkte " +
                "\n 3. Alle Kategorien  " +
                "\n 4. Mein Profil" +
                "\n 5. Logout" +
                "\n    Bitte Nr. eingeben: "
    )
    var mainMenue = readln()

    when (mainMenue) {
        "1" -> shoppingCart.showShoppingCart(shoppingCart, kunde, account)
        "2" -> kunde.chooseBPAction(shoppingCart, kunde, account)
        "3" -> kunde.chooseCategoryAction(shoppingCart, kunde, account)
        "4" -> custLoginArea(shoppingCart, kunde, account)
        "5" -> account.logOut()
        else -> {
            println("Falsche Eingabe")
            // Methode ruft sich einfach selbst nochmal auf - rekursiv - somit fängt sie sich selbst auf !!!
            homeMenue(shoppingCart, kunde, account)
        }
    }
}


fun customersLogIn(){
    var accLogin = Account()
    // Die Methode .logInUser() soll einen konkreten Kunden zurückgeben, falls er es schafft, sich einzuloggen (er/sie/es hat 3 Versuche!!!):
    var kunde = accLogin.logInUser()
    // Wenn Kunde sich einloggen kann (3 Versuche), kommt er ins HomeMenue, wo sich alle andere objektorientiert abspielt:
    if (accLogin.logged){
        // Es wird eine Shopping Cart (Einkaufswagen) für den Kunden erstellt (noch leer):
        var shoppingCart: ShoppingCart = ShoppingCart()
        // Die folgende Methode ist quasi das ganze Programm - objektorientiert eben:
        homeMenue(shoppingCart, kunde, accLogin)
        // Die eben erstellten 3 zetralen Objekte 'shoppingCart', 'kunde' und 'accLogin' werden von nun an, an alle zentralen Funktionen weitergegeben.
        // das ermöglicht eine zu 100% rekursive Implementierung - die Schleifen rufen sich gegenseitig so auf, wie es der Flow erfordert und aktualisieren ggf. gewünschte Datensätze (Attribute/Variablen) - in endlosSchleife-ohne (großartige) SCHLEIFEN (zumindest in der main() ) !!!.

    } else {
        // Nach 3 Fehlversuchen beim Log-in:
        println("Zutritt aus Sicherheitsgründen für 1 Stunde gesperrt !!!")
    }
}

fun custLoginArea(shoppingCart: ShoppingCart, kunde: Customer, account: Account){
    println(" - -- - -- -  Mein Account - -- - -- - ")
    println(" 1. Archiv: Meine Einkäufe \n 2. Aktuelle Einkaufsliste \n 3. Home Menue ( shoppen gehen ;-D ) \n 4. Log Out ")
    var input = readln()
    when(input){
        "1" -> {"noch nicht fertig"}
        "2" -> shoppingCart.showShoppingCart(shoppingCart, kunde, account)
        "3" -> homeMenue(shoppingCart, kunde, account)
        "4" -> account.logOut()
        else -> {
            println("Falsche Eingabe")
            // Methode ruft sich einfach selbst nochmal auf - rekursiv - somit fängt sie sich selbst auf !!!
            custLoginArea(shoppingCart, kunde, account)
        }
    }
}


fun adminsLogIn(){


}
