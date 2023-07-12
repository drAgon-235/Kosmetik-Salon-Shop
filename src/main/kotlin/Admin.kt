class Admin() {
    var adminNr: Int = 0
    var name: String = ""
    var email: String = ""
    var password: String = ""
    var inCharge: Boolean = true


    constructor(adminNr: Int, name: String, email: String, pw: String) : this() {
        this.adminNr = adminNr
        this.name = name
        this.email = email
        this.password = pw
    }


    // Folgende Funktion erstellt ein BeautyProduct und fügt es automatisch in die entsprechende Artikelliste ein, welche sofort aktualisiert wird und sofort durch User genutzt werden kann:
    fun createBP(admin: Admin, adminAccount: AdminAccount) {
        var newBP: BeautyProduct = BeautyProduct()

        println("Zuerst wählen Sie bitte die Herstellerfirma: \n 1. AFON \n 2. NIFEA \n 3. No name (oder andere)")
        var producer = readln()
        var brand = Brands.NONAME
        when (producer) {
            "1" -> brand = Brands.AFON
            "2" -> brand = Brands.NIFEA
            "3" -> {}
            else -> {
                println("Etwas ist schief gelaufen - nochmal von vorne bitte:")
                createBP(admin, adminAccount)
            }

        }
        println()

        println("Bitte nun den Namen, die Beschreibung des Produkts eingeben (erscheint in der Produktübersicht):")
        var bpName = readln()
        println()

        println("Als nächstes bitte den Bruttopreis eingeben (in €)")
        var price = readln().toDouble()
        println()

        println("Nun Anfangslagerbestand eingeben (ggf. 0):")
        var stock = readln().toInt()
        println()


        println(
            "Wählen Sie jetzt bitte die Kategorie des neuen Produkts:" +
                    "\n 1. Gesicht" +
                    "\n 2. Hände " +
                    "\n 3. Füße " +
                    "\n 4. Körper " +
                    "\n 5. Andere"
        )
        var inputCat = readln()

        var cat: Category = Category.GEMISCHT
        when (inputCat) {
            "1" -> cat = Category.GESICHT
            "2" -> cat = Category.HAENDE
            "3" -> cat = Category.FUESSE
            "4" -> cat = Category.BODY
            "5" -> cat = Category.GEMISCHT
            else -> {
                println("Etwas ist schief gelaufen - nochmal von vorne bitte:")
                Thread.sleep(2000)
                createBP(admin, adminAccount)
            }
        }
        println()

        println(
            "Nun wählen Sie bitte die Art des Produkts: " +
                    "\n 1. Seifen " +
                    "\n 2. Crèmes " +
                    "\n 3. Peelings " +
                    "\n 4. Badezusätze " +
                    "\n 5. Nagellacke " +
                    "\n 6. Andere"
        )
        var inputBP = readln()
        when (inputBP) {
            "1" -> {
                println("Füe eine Seife muss noch der Duft angegeben werden: ")
                var fragrance = readln()
                println("Bei Flüssigseifen oder Gels bitte noch den Inhalt in ml eingeben (ansonsten 0 eingeben): ")
                var volume = readln().toInt()
                newBP = BP_Soap(cat, bpName, brand, price, fragrance, volume, stock)
                soaps.add(newBP)
                Thread.sleep(2000)
            }

            "2" -> {
                println("Bei Crèmes bitte noch den Inhalt in ml eingeben: ")
                var volumeCreme = readln().toInt()
                newBP = BP_Creme(cat, bpName, brand, price, volumeCreme, stock)
                cremes.add(newBP)
                Thread.sleep(2000)
            }

            "3" -> {
                println("Bei Peelings bitte noch den Inhalt in ml eingeben: ")
                var volumePeel = readln().toInt()
                newBP = BP_Peeling(cat, bpName, brand, price, volumePeel, stock)
                peelings.add(newBP)
                Thread.sleep(2000)
            }

            "4" -> {
                println("Bei Badezusätzen bitte noch den Inhalt in ml eingeben (ggf. 0): ")
                var volumeBA = readln().toInt()
                println("Bei Badezusätzen bitte noch das Gewicht in g eingeben (ggf. 0): ")
                var weightBA = readln().toInt()
                newBP = BP_BathAddits(cat, bpName, brand, price, volumeBA, weightBA, stock)
                bathAddits.add(newBP)
                Thread.sleep(2000)
            }

            "5" -> {
                println("Bei Nagellacken bitte noch die Farbe eingeben: ")
                var color = readln()
                newBP = BP_NailPolish(cat, bpName, brand, price, color, stock)
                nailPolishes.add(newBP)
                Thread.sleep(2000)
            }

            "6" -> {
                println("Ein Standard Beauty Produkt bedarf keiner weiteren Eingaben ...")
                newBP = BeautyProduct(cat, bpName, brand, price, stock)
                abstractProducts.add(newBP)
                Thread.sleep(2000)
            }

            else -> {
                println("Etwas ist schief gelaufen - nochmal von vorne bitte:")
                Thread.sleep(2000)
                createBP(admin, adminAccount)
            }
        }
        println()
        println("Sie haben folgendes Beauty Product erstellt: ")
        newBP.showEssentials()
        println()
        println("Es wurde automatisch in die entsprechende Artikelliste einsortiert und ist AB SOFORT kaufbar! (Verfügbarkeit vorausgesetzt)")

        println("Was möchten Sie jetzt tun? \n 1. Weiteres Produkt erstellen \n 2. Fertig - Home ")

        var lastOption = readln()
        when (lastOption) {
            "1" -> createBP(admin, adminAccount)
            "2" -> adminAccount.homeMenueAd(admin, adminAccount)
            else -> {
                println("Etwas ist schief gelaufen - nochmal von vorne bitte:")
                Thread.sleep(2000)
                adminAccount.homeMenueAd(admin, adminAccount)
            }
        }
        /*
        println("Test der aktualisierten Liste")
        var test = soaps[soaps.lastIndex]
        test.showEssentials()

        // check OK
         */
    }

    // Folgende Funktion erstellt einen neuen Admin, der sofort nach dem Ausloggen des alten loslegen kann:
    fun createCoAdmin(admin: Admin, adminAccount: AdminAccount) {
        println("- - Neuen Admin erstellen - -")
        println()
        println("Bitte Name eingeben:")
        var name = readln()
        println("Bitte email Adresse eingeben:")
        var email = readln()
        println("Bitte Passwort festlegen:")
        var pw1 = readln()

        var id = adminsList[adminsList.lastIndex].adminNr + 1
        var newAdmin: Admin = Admin()

        println()
        println("Sind Ihre Eingaben korrekt? ")
        println("Name: $name")
        println("email: $email")
        println("Passwort: $pw1")
        println("Nr: $id")
        println()
        println("Sind die Daten korrekt? \n 1. Ja, einchecken bitte. \n 2. Nein, nochmal von vorne \n 3. Home")

        var input = readln()
        when(input){
            "1" -> {
                newAdmin = Admin(id, name, email, pw1)
                adminsList.add(newAdmin)
                passWordDBAdmin[email] = pw1
                Thread.sleep(1500)
                println()
                println(". . .")
                println()
                println("Der Account wurde erfolgreich erstellt und kann SOFORT genutzt werden")
                Thread.sleep(1500)
                println()
                println(". . .")
                println()
                adminAccount.homeMenueAd(admin, adminAccount)
            }
            "2" -> {createCoAdmin(admin, adminAccount)}
            "3" -> {adminAccount.homeMenueAd(admin, adminAccount)}
            else -> {
                println("Etwas ist schief gelaufen - nochmal von vorne bitte:")
                createCoAdmin(admin, adminAccount)
            }
        }


    }


    fun changePrice() {
        // TODO

    }
}