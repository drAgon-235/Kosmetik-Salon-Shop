


// Liste mit Bestandskunden: (mutable, flexibel und bearbeitbar)
var customersList: MutableList<Customer> = mutableListOf(
    testCustomer_01,
    testCustomer_02,
    testCustomer_03,
    testCustomer_04,
    testCustomer_05
)
/*
var allBPs: MutableList<BeautyProduct> = mutableListOf(
    // Sortiment von "AFON":
    BP_01_01,
    BP_01_02,
    BP_01_03,
    BP_01_04,
    BP_01_05,
    BP_01_06,
    BP_01_07,
    // Sortiment von "NIFEA":
    BP_02_01,
    BP_02_02,
    BP_02_03,
    BP_02_04,
    BP_02_05,
    BP_02_06,
    BP_02_07,
    // Sortiment von BP_Nailpolishes
    NP_01_01,
    NP_01_02,
    NP_01_03,
    NP_01_04,
    // Sortiment von BP_Soaps
    Soap_01,
    Soap_02,
    Soap_03,
    Soap_04,

)

 */
// Produktlisten:
var allClassicBPs: MutableList<BeautyProduct> = mutableListOf(
    // Sortiment von "AFON":
    BP_01_01,
    BP_01_02,
    BP_01_03,
    BP_01_04,
    BP_01_05,
    BP_01_06,
    BP_01_07,
    // Sortiment von "NIFEA":
    BP_02_01,
    BP_02_02,
    BP_02_03,
    BP_02_04,
    BP_02_05,
    BP_02_06,
    BP_02_07,
)
var allNailPolishes: MutableList<BeautyProduct> = mutableListOf(
    // Sortiment von BP_Nailpolishes
    NP_01_01,
    NP_01_02,
    NP_01_03,
    NP_01_04,
)
var allSoaps: MutableList<BeautyProduct> = mutableListOf(
    // Sortiment von BP_Soaps
    Soap_01,
    Soap_02,
    Soap_03,
    Soap_04,
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
        kunde.homeMenue(shoppingCart)

        println("Nun lösche ich die Einkaufskiste:")
        shoppingCart.flushShoppingCart()
        println()
        println("Nun zeige ich die leere Liste mit der Funktion showShoppingCart():")
        shoppingCart.showShoppingCart()
    } else {
        println("Zutritt aus Sicherheitsgründen für 1 Stunde gesperrt !!!")
    }

}

