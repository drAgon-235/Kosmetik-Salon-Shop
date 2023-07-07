


// Liste mit Bestandskunden: (mutable, flexibel und bearbeitbar)
var customersList: MutableList<Customer> = mutableListOf(testCustomer_01, testCustomer_02, testCustomer_03, testCustomer_04, testCustomer_05 )

fun main() {

    var accLogin = Account()
    // Die Methode .logInUser() soll einen konkreten Kunden zurückgeben, falls er es schafft, sich einzuloggen (er/sie/es hat 3 Versuche!!!):
    var kunde = accLogin.logInUser()
    //TEST: Hab ich den Kunden rausgefischt?
    //println(kunde.name)     // YES !!!

    if (accLogin.logged){
        kunde.homeMenue()

    } else {
        println("Zutritt aus Sicherheitsgründen für 1 Stunde gesperrt !!!")
    }

}

