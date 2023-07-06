

var passWordDB: MutableMap<String, String> = mutableMapOf(
    "a.mueller@gmx.de" to "abc123",
    "olga123@web.de" to "Kickerickie1234"
)



var testCustomer_01: Customer = Customer(1, "Olga Seitz", "Hauptstr. 23, 12345 Mustercity", "a.mueller@gmx.de", "abc123", 0.0)
var testCustomer_02: Customer = Customer(2, "Johanna Sensimilja", "Erich-Fromm-Weg 7, 23456 Magnolienstadt", "olga123@web.de", "Kickerickie1234", 0.0 )


// Pseudo_DB: ClassicProducts:
// Sortiment von "AFON":
var BP_01_01: BeautyProduct = BeautyProduct("BP_01_01", "Gesicht", "Gesichtscreme Tag", "AFON", "Stabilisierende Abwehr gegen die 'Freien Radikale' im Alltag. Kontinuierliche Abgabe von Feuchtigkeitslipiden und permanenter Schutz Dank Q10 Enzymen und vielen Vitaminen und Mineralien.", 49.50, 5)
var BP_01_02: BeautyProduct = BeautyProduct("BP_01_02", "Gesicht", "Gesichtscreme Nacht", "AFON", "Beruhigende ätherische Öle tun der Haut gut und die Mineralienmischung hilft der Haut bei der Regeneration.", 39.50, 5)
var BP_01_03: BeautyProduct = BeautyProduct("BP_01_03", "Gesicht", "Gesichtsmaske - 10er Pack", "AFON", "Eine auf biologisch-natürlichen Rohstoffen basierende Gesichtsmaske zur Tiefenreinigung der Poren und Erfrischung des Taints.", 13.50, 5)
var BP_01_04: BeautyProduct = BeautyProduct("BP_01_04", "Körper", "Bodylotion - Small (500 ml)", "AFON", "Ein Feuchtigkeit spendendes Muss nach jeder Dusche mit diesem super-harten Wasser in diesem Land.", 10.50, 5)
var BP_01_05: BeautyProduct = BeautyProduct("BP_01_05", "Körper", "Bodylotion - Big (1 l)", "AFON", "Die Familienpackung: Ein Feuchtigkeit spendendes Muss nach jeder Dusche mit diesem super-harten Wasser in diesem Land.", 15.50, 5)
var BP_01_06: BeautyProduct = BeautyProduct("BP_01_06", "Gemischt", "Geschenkkorb Small", "AFON", "Eine nette Aufmerksamkeit für jede Gelegenheit. Beinhaltet: \n - Gesichtscreme - Tag  \n - Bodylotion Small", 42.50, 5)
var BP_01_07: BeautyProduct = BeautyProduct("BP_01_07", "Gemischt", "Geschenkkorb Big", "AFON", "Eine besondere Aufmerksamkeit für eine außergewöhnliche Gelegenheit. Beinhaltet: \n - Gesichtscreme - Tag \n - Gesichtscreme Nacht  \n - Bodylotion Big  \n - Gesichtsmaske - 10er Pack", 73.50, 5)

// Sortiment von "NIFEA":
var BP_02_01: BeautyProduct = BeautyProduct("BP_02_01", "Gesicht",  "Gesichtscreme Tag", "NIFEA", "Stabilisierende Abwehr gegen die 'Freien Radikale' im Alltag. Kontinuierliche Abgabe von Feuchtigkeitslipiden und permanenter Schutz Dank Q10 Enzymen und vielen Vitaminen und Mineralien.", 40.99, 5)
var BP_02_02: BeautyProduct = BeautyProduct("BP_02_02", "Gesicht", "Gesichtscreme Nacht", "NIFEA", "Beruhigende ätherische Öle tun der Haut gut und die Mineralienmischung hilft der Haut bei der Regeneration.", 30.99, 5)
var BP_02_03: BeautyProduct = BeautyProduct("BP_02_03", "Gesicht", "Gesichtsmaske - 10er Pack", "NIFEA", "Eine auf biologisch-natürlichen Rohstoffen basierende Gesichtsmaske zur Tiefenreinigung der Poren und Erfrischung des Taints.", 10.99, 5)
var BP_02_04: BeautyProduct = BeautyProduct("BP_02_04", "Körper", "Bodylotion - Small (500 ml)", "NIFEA", "Ein Feuchtigkeit spendendes Muss nach jeder Dusche mit diesem super-harten Wasser in diesem Land.", 8.99, 5)
var BP_02_05: BeautyProduct = BeautyProduct("BP_02_05", "Körper", "Bodylotion - Big (1 l)", "NIFEA", "Die Familienpackung: Ein Feuchtigkeit spendendes Muss nach jeder Dusche mit diesem super-harten Wasser in diesem Land.", 11.99, 5)
var BP_02_06: BeautyProduct = BeautyProduct("BP_02_06", "Gesicht", "Geschenkkorb Small", "NIFEA", "Eine nette Aufmerksamkeit für jede Gelegenheit. Beinhaltet: \n - Gesichtscreme - Tag  \n - Bodylotion Small", 30.99, 5)
var BP_02_07: BeautyProduct = BeautyProduct("BP_02_07", "Gemischt", "Geschenkkorb Big", "NIFEA", "Eine besondere Aufmerksamkeit für eine außergewöhnliche Gelegenheit. Beinhaltet: \n - Gesichtscreme - Tag \n - Gesichtscreme Nacht  \n - Bodylotion Big  \n - Gesichtsmaske - 10er Pack", 50.99, 5)


// Pseudo_DB: BP_NailPolish:
// Sortiment von BP_Nailpolishes
var NP_01_01: BP_NailPolish = BP_NailPolish("NP_01_01", "Hände","Nail Series", "AFON", 7.99, "blue", 9)
var NP_01_02: BP_NailPolish = BP_NailPolish("NP_01_02","Hände","Nail Series", "AFON", 7.99, "lilac", 7)
var NP_01_03: BP_NailPolish = BP_NailPolish("NP_01_03", "Hände","Nail Series", "AFON", 7.99, "bordeaux", 13)
var NP_01_04: BP_NailPolish = BP_NailPolish("NP_01_04", "Hände","Nail Series", "AFON", 7.99, "black", 13)


// Pseudo_DB: BP_Soap:
// Sortiment von BP_Soaps
var Soap_01: BP_Soap = BP_Soap("So_01_01", "Gesicht", "Gesichtsseife", "NIFEA", 9.99, "Vanille", 14)
var Soap_02: BP_Soap = BP_Soap("So_01_02", "Gesicht", "Gesichtsseife", "NIFEA", 9.99, "Himbeere", 14)
var Soap_03: BP_Soap = BP_Soap("So_01_03", "Körper", "Duschseife", "AFON", 19.99, "Meeresbrise", 8)
var Soap_04: BP_Soap = BP_Soap("So_01_04", "Körper", "Duschseife", "AVON", 19.99, "Pinienwald", 4)


