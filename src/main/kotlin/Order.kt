import java.time.LocalDate

class Order {
    val idNr: Int = 0
    val itemsList: ShoppingCart = ShoppingCart()
    val totalPrice: Double = 0.0
    val orderedOn = LocalDate.now()
    var payed: Boolean = false
    var shipped: Boolean = false

}