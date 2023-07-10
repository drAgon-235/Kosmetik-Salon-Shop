import java.time.LocalDate

class Order() {
    val idNr: Int = 0
    var itemsList: MutableList<BeautyProduct> = mutableListOf()
    var totalPrice: Double = 0.0
    var payed: Boolean = false
    var shipped: Boolean = false
    var date: LocalDate = LocalDate.now()
    // Liste mit Bestellungen:
    var ordersList: MutableList<Order> = mutableListOf()


    init {
        date = LocalDate.now()
    }
     constructor(itemslist: MutableList<BeautyProduct>, total: Double ) : this(){
         this.itemsList = itemslist
         this.totalPrice = total
     }

    fun showOrderDetails(){
        println("---------------------------------------------------------")
        println(" - - Bestellung vom Datum: ${this.date}")
        // Pritet die einzelnen Produkte der Bestellung aus - wer das versteht: Glückwunsch !!!!
        for (it in this.ordersList){
            for (iti in this.itemsList){
            iti.showEssentials()
            }
            // TODO alot
        }
        println("-----  Summe: ${this.totalPrice} €  -----")
        println(" - bezahlt \n - verschickt")
        println("---------------------------------------------------------")
    }



    fun showItem(){


    }


    fun addToOrdersList(){
        ordersList.add(this)
    }
    // Zeile 16 bei ShoppingCart wird es gebraucht

}