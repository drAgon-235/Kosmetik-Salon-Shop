import java.time.LocalDate

class Appointment {
    val id: Int = 0
    val dateOfAppointment: LocalDate = LocalDate.now()
    val bookedOn: LocalDate = LocalDate.now()
    val priceTotal: Double = 0.0
    val durationTotal: Int = 0   // in minutes !!!
    var doneOK: Boolean = false


    fun bookAppointment(){
        //TODO
    }
}