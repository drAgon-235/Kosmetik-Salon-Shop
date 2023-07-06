import java.time.LocalDate

fun main(){

    // Test Soap:


    // Test BP_NailPolish
    NP_01_01.showEssentials()
    NP_01_02.showDetails()


    /*
    //Tests Database in utils.kt   check[x]
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
    //var testCustomer: Customer = Customer(1,"Alfred Müller", "Musterstr. 11, 12345 Musterstadt", "musterMail@gmail.com", "BallaBalla123")
    var testCustomer: Customer = Customer()
    println(testCustomer)
    println(testCustomer.name)
    println(testCustomer.adresse)
    println(testCustomer.appointments)

    val date: LocalDate = LocalDate.now()
    println(date)

 */


}