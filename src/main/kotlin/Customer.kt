class Customer() {
    var customNr: Int = 0
    var name: String = ""
    var adress: String = ""
    var email: String = ""
    var password: String = ""
    var saldo: Double = 0.0

    var appointments: MutableList<String> = mutableListOf()
    var purchases: MutableList<String> = mutableListOf()

    constructor(customNr: Int, name: String, adress: String, email: String, password: String, saldo: Double ) : this(){
        this.customNr = customNr
        this.name = name
        this.adress = adress
        this.email = email
        this.password = password
        this.saldo
    }



}