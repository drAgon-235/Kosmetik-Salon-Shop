import java.time.LocalDate

fun main(){
// Chronologisch - jüngster Test ganz oben:

    var test = soaps[soaps.lastIndex].id
    println(test)
    var testlist: List<String> = test.split('_')
    var newID = testlist[1].toInt() + 1
    println(testlist[0])
    println(newID)
    var newIDString = testlist[0] + "_" + newID.toString()
    println(newIDString)
/*
// Test Funktion sortPrice():
var kunde = Customer(6, "Alfred", "Sommerstrasse 23", "email@gmx.de", "passwort123", 0.0 )

    println("Vor dem Sortieren:")
    for (it in soaps){
        it.showEssentials()
    }

    kunde.sortPriceAsc(soaps)

    println()
    println("Nach dem Sortieren:")
    for (it in soaps){
        it.showEssentials()
    }

 */




    /*
// Test Soap:
    println("Seifen:")
    Soap_01.showEssentials()
    Soap_03.showDetails()


// Test BP_NailPolish
    println("Nagellacke:")
    NP_01_01.showEssentials()   // Überschriebene eigene Methode, funzt perfekt.
    NP_01_02.showDetails()      //Geerbte Methode: Keine Probleme bei fehlenden Variablen !!, macht einfach weiter mit leerer Zeile - faszinierend !!!
    println("Description: ${NP_01_03.description}")     // WAHNSINN !!! Er stürtzt nicht ab, obwohl die Variable description fehlt (STOPP, sie fehlt nicht, sie wird default vom Konstruktor übergeben mit Initialwert: "" ) Jetzt richtig kapiert, darum experimentiere ich lieber länger ... ich will genau wissen was passiert, dazu muss ich dauernd irgendwelchen Parameter testweise ändern - und ggf. anpassen - lieber jetzt als später wenn da 1000 Zeilen Code sind

     */



    /*
//Tests Database BeautyProducts in utils.kt   check[x]
    BP_01_01.showDetails()
    println()
    BP_02_04.showDetails()
    println()
    BP_02_07.showDetails()
    println()
    BP_02_05.showDetails()

     */



//Tests einzelne Objekte:
    /*
    var microNeedling: ClassicService = ClassicService("123", "Anti-Aging", "Microneedling", "Hochwertige kosmetische Behandlung mit Mikronadeln und speziellen Seren zur Hauterneuerung", 199.99, 60 )
    microNeedling.showEssentials()
    println(microNeedling)
    microNeedling.showDetails()

     */

/*
    // var testCustomer: Customer = Customer()
    //var testCustomer: Customer = Customer(1, "Alfred Müller", "Hauptstr. 23, 12345 Mustercity", "a.mueller@gmx.de", "abcd123", 0.0)
    // 'testCustomer_01' ist nun in utils.kt - Pseudo_DB
    println(testCustomer_01)
    println(testCustomer_01.name)
    println(testCustomer_01.adress)
    println("Liste der Termine: ${testCustomer_01.appointments}")
    println("Passwort: ${testCustomer_01.password}")

    val date: LocalDate = LocalDate.now()
    println(date)

 */




}