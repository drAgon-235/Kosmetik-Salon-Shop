




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

    var accLogin = Account()
    // Die Methode .logInUser() soll einen konkreten Kunden zurückgeben, falls er es schafft, sich einzuloggen (er/sie/es hat 3 Versuche!!!):
    var kunde = accLogin.logInUser()
    //TEST: Hab ich den Kunden rausgefischt?
    //println(kunde.name)     // YES !!!
    // Es wird eine blanko Shopping Cart (Einkaufswagen) erstellt:
    var shoppingCart: ShoppingCart = ShoppingCart()

    if (accLogin.logged){
        homeMenue(shoppingCart, kunde)

        println()
        println("Einkaufskiste nochmal zeigen:")
        shoppingCart.showShoppingCart(kunde)
        println("Nun lösche ich die Einkaufskiste:")
        shoppingCart.flushShoppingCart()
        homeMenue(shoppingCart, kunde)
        println()
        println("Nun zeige ich die leere Liste mit der Funktion showShoppingCart():")
        shoppingCart.showShoppingCart(kunde)
    } else {
        println("Zutritt aus Sicherheitsgründen für 1 Stunde gesperrt !!!")
    }
}

fun homeMenue(shoppingCart: ShoppingCart, kunde: Customer) {
    println(
        " - -- - -- -  Home - Menue - -- - -- - " +
                "\n 1. Einkaufskorb " +
                "\n 2. Alle Beauty Produkte " +
                "\n 3. Alle Kategorien  " +
                "\n 4. Mein Profil" +
                "\n    Bitte Nr. eingeben: "
    )
    var mainMenue = readln()

    when (mainMenue) {
        "1" -> shoppingCart.showShoppingCart(kunde)
        "2" -> kunde.chooseBPAction(shoppingCart, kunde)
        "3" -> kunde.chooseCategoryAction(shoppingCart, kunde)
        "4" -> println("Mein Profil ausgewählt")
        else -> println("Falsche Eingabe")
    }
}

