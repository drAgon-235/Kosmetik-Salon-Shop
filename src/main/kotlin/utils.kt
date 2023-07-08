





var testCustomer_01: Customer = Customer(1, "Olga Mueller", "Hauptstr. 23, 12345 Mustercity", "o.mueller@gmx.de", "abc123", 0.0)
var testCustomer_02: Customer = Customer(2, "Johanna Sensimilja", "Erich-Fromm-Weg 7, 23456 Magnolienstadt", "Joe123@web.de", "Kickerickie1234", 0.0 )
var testCustomer_03: Customer = Customer(3,"Marijke van den Hutten", "Baumallee 52, 15890 Eisenhüttenstadt", "marHutten@yahoo.com", "huttenTutten789", 0.0)
var testCustomer_04: Customer = Customer(4,"Yesim Keskinsoy", "Am Aubuckel 19, 36546 Obergartenhausen", "YesKes4576@alibaba.com", "MuNaHeDschin", 0.0)
var testCustomer_05: Customer = Customer(5, "Erwin Przybilla", "Schweriner Weg 34, 04333 Leipzig", "epry_Diamond@gmail.com", "masturabiato12345", 0.0)


/*
// Pseudo_DB: ClassicProducts:
// Sortiment von "AFON":
var BP_01_01: BeautyProduct = BeautyProduct( Category.GESICHT, "Gesichtscreme Tag", Brands.AFON, "Stabilisierende Abwehr gegen die 'Freien Radikale' im Alltag. Kontinuierliche Abgabe von Feuchtigkeitslipiden und permanenter Schutz Dank Q10 Enzymen und vielen Vitaminen und Mineralien.", 49.50, 5)
var BP_01_02: BeautyProduct = BeautyProduct( Category.GESICHT, "Gesichtscreme Nacht", Brands.AFON, "Beruhigende ätherische Öle tun der Haut gut und die Mineralienmischung hilft der Haut bei der Regeneration.", 39.50, 5)
var BP_01_03: BeautyProduct = BeautyProduct( Category.GESICHT, "Gesichtsmaske - 10er Pack", Brands.AFON, "Eine auf biologisch-natürlichen Rohstoffen basierende Gesichtsmaske zur Tiefenreinigung der Poren und Erfrischung des Taints.", 13.50, 5)
var BP_01_04: BeautyProduct = BeautyProduct( Category.BODY, "Bodylotion - Small (500 ml)", Brands.AFON, "Ein Feuchtigkeit spendendes Muss nach jeder Dusche mit diesem super-harten Wasser in diesem Land.", 10.50, 5)
var BP_01_05: BeautyProduct = BeautyProduct( Category.BODY, "Bodylotion - Big (1 l)", Brands.AFON, "Die Familienpackung: Ein Feuchtigkeit spendendes Muss nach jeder Dusche mit diesem super-harten Wasser in diesem Land.", 15.50, 5)
var BP_01_06: BeautyProduct = BeautyProduct( Category.GEMISCHT, "Geschenkkorb Small", Brands.AFON, "Eine nette Aufmerksamkeit für jede Gelegenheit. Beinhaltet: \n - Gesichtscreme - Tag  \n - Bodylotion Small", 42.50, 5)
var BP_01_07: BeautyProduct = BeautyProduct( Category.GEMISCHT, "Geschenkkorb Big", Brands.AFON, "Eine besondere Aufmerksamkeit für eine außergewöhnliche Gelegenheit. Beinhaltet: \n - Gesichtscreme - Tag \n - Gesichtscreme Nacht  \n - Bodylotion Big  \n - Gesichtsmaske - 10er Pack", 73.50, 5)

// Sortiment von "NIFEA":
var BP_02_01: BeautyProduct = BeautyProduct( Category.GESICHT,  "Gesichtscreme Tag", Brands.NIFEA, "Stabilisierende Abwehr gegen die 'Freien Radikale' im Alltag. Kontinuierliche Abgabe von Feuchtigkeitslipiden und permanenter Schutz Dank Q10 Enzymen und vielen Vitaminen und Mineralien.", 40.99, 5)
var BP_02_02: BeautyProduct = BeautyProduct( Category.GESICHT, "Gesichtscreme Nacht", Brands.NIFEA, "Beruhigende ätherische Öle tun der Haut gut und die Mineralienmischung hilft der Haut bei der Regeneration.", 30.99, 5)
var BP_02_03: BeautyProduct = BeautyProduct( Category.GESICHT, "Gesichtsmaske - 10er Pack", Brands.NIFEA, "Eine auf biologisch-natürlichen Rohstoffen basierende Gesichtsmaske zur Tiefenreinigung der Poren und Erfrischung des Taints.", 10.99, 5)
var BP_02_04: BeautyProduct = BeautyProduct( Category.BODY, "Bodylotion - Small (500 ml)", Brands.NIFEA, "Ein Feuchtigkeit spendendes Muss nach jeder Dusche mit diesem super-harten Wasser in diesem Land.", 8.99, 5)
var BP_02_05: BeautyProduct = BeautyProduct( Category.BODY, "Bodylotion - Big (1 l)", Brands.NIFEA, "Die Familienpackung: Ein Feuchtigkeit spendendes Muss nach jeder Dusche mit diesem super-harten Wasser in diesem Land.", 11.99, 5)
var BP_02_06: BeautyProduct = BeautyProduct( Category.GEMISCHT, "Geschenkkorb Small", Brands.NIFEA, "Eine nette Aufmerksamkeit für jede Gelegenheit. Beinhaltet: \n - Gesichtscreme - Tag  \n - Bodylotion Small", 30.99, 5)
var BP_02_07: BeautyProduct = BeautyProduct( Category.GEMISCHT, "Geschenkkorb Big", Brands.NIFEA, "Eine besondere Aufmerksamkeit für eine außergewöhnliche Gelegenheit. Beinhaltet: \n - Gesichtscreme - Tag \n - Gesichtscreme Nacht  \n - Bodylotion Big  \n - Gesichtsmaske - 10er Pack", 50.99, 5)


// Pseudo_DB: BP_NailPolish:
// Sortiment von BP_Nailpolishes
var NP_01_01: BP_NailPolish = BP_NailPolish( Category.HAENDE,"Nail Series", Brands.AFON, 7.99, "blue", 9)
var NP_01_02: BP_NailPolish = BP_NailPolish(Category.HAENDE,"Nail Series", Brands.AFON, 7.99, "lilac", 7)
var NP_01_03: BP_NailPolish = BP_NailPolish( Category.HAENDE,"Nail Series", Brands.AFON, 7.99, "bordeaux", 13)
var NP_01_04: BP_NailPolish = BP_NailPolish( Category.HAENDE,"Nail Series", Brands.AFON, 7.99, "black", 13)


// Pseudo_DB: BP_Soap:
// Sortiment von BP_Soaps
var Soap_01: BP_Soap = BP_Soap( Category.GESICHT, "Gesichtsseife", Brands.NIFEA, 9.99, "Vanille", 14)
var Soap_02: BP_Soap = BP_Soap( Category.GESICHT, "Gesichtsseife", Brands.NIFEA, 9.99, "Himbeere", 14)
var Soap_03: BP_Soap = BP_Soap( Category.BODY, "Duschgel", Brands.AFON, 19.99, "Meeresbrise", 8)
var Soap_04: BP_Soap = BP_Soap( Category.BODY, "Duschgel", Brands.AFON, 19.99, "Pinienwald", 4)


 */

//-----------------------------------------------------------------------------------------------------------------------


//Pseudo DB Neue Struktur:
// Soap:
var Soap_01: BP_Soap = BP_Soap( Category.GESICHT, "Gesichtsseife", Brands.NIFEA, 5.99, "Vanille", 14)
var Soap_02: BP_Soap = BP_Soap( Category.GESICHT, "Gesichtsseife", Brands.NIFEA, 5.99, "Himbeere", 14)
var Soap_03: BP_Soap = BP_Soap( Category.BODY, "Duschgel", Brands.NIFEA, 9.99, "Vanille", 14)
var Soap_04: BP_Soap = BP_Soap( Category.BODY, "Duschgel", Brands.NIFEA, 9.99, "Himbeere", 14)
var Soap_05: BP_Soap = BP_Soap( Category.GESICHT, "Gesichtsseife", Brands.AFON, 9.99, "Vanille", 14)
var Soap_06: BP_Soap = BP_Soap( Category.GESICHT, "Gesichtsseife", Brands.AFON, 9.99, "Himbeere", 14)
var Soap_07: BP_Soap = BP_Soap( Category.BODY, "Duschgel", Brands.AFON, 19.99, "Meeresbrise", 8)
var Soap_08: BP_Soap = BP_Soap( Category.BODY, "Duschgel", Brands.AFON, 19.99, "Pinienwald", 4)
var Soap_09: BP_Soap = BP_Soap( Category.GESICHT, "Gesichtsseife", Brands.NONAME, 2.99, "Meeresbrise", 8)
var Soap_10: BP_Soap = BP_Soap( Category.BODY, "Duschgel", Brands.NONAME, 6.99, "Pinienwald", 4)



// Creme:
var Cr_01: Creme = Creme(Category.GESICHT, "Gesichtscreme Tag", Brands.AFON, 49.50, 60, 5 )
var Cr_02: Creme = Creme(Category.GESICHT, "Gesichtscreme Nacht", Brands.AFON, 39.50, 50, 7 )
var Cr_03: Creme = Creme(Category.GESICHT, "Gesichtscreme Tag", Brands.NIFEA, 29.50, 45, 5 )
var Cr_04: Creme = Creme(Category.GESICHT, "Gesichtscreme Nacht", Brands.NIFEA, 35.50, 45, 7 )
var Cr_05: Creme = Creme(Category.GESICHT, "Gesichtscreme Tag", Brands.NONAME, 19.50, 40, 5 )
var Cr_06: Creme = Creme(Category.GESICHT, "Gesichtscreme Nacht", Brands.NONAME, 15.50, 40, 7 )
var Cr_07: Creme = Creme(Category.HAENDE, "Handcreme Deluxe", Brands.AFON, 15.50, 65, 5 )
var Cr_08: Creme = Creme(Category.HAENDE, "All Day Handcreme", Brands.NIFEA, 8.50, 55, 7 )
var Cr_09: Creme = Creme(Category.HAENDE, "Just Handcreme", Brands.NONAME, 3.50, 55, 5 )


// Mask:



// Peeling:



// NailPolish:
var NP_01: BP_NailPolish = BP_NailPolish( Category.HAENDE,"Nail Series", Brands.AFON, 10.99, "blue", 9)
var NP_02: BP_NailPolish = BP_NailPolish( Category.HAENDE,"Nail Series", Brands.AFON, 10.99, "lilac", 7)
var NP_03: BP_NailPolish = BP_NailPolish( Category.HAENDE,"Nail Series", Brands.AFON, 10.99, "bordeaux", 13)
var NP_04: BP_NailPolish = BP_NailPolish( Category.HAENDE,"Nail Series", Brands.AFON, 10.99, "black", 13)
var NP_05: BP_NailPolish = BP_NailPolish( Category.HAENDE,"Nagellack +", Brands.NIFEA, 7.99, "himmelblau", 9)
var NP_06: BP_NailPolish = BP_NailPolish( Category.HAENDE,"Nagellack +", Brands.NIFEA, 7.99, "violett", 7)
var NP_07: BP_NailPolish = BP_NailPolish( Category.HAENDE,"Nagellack +", Brands.NIFEA, 7.99, "rot", 13)
var NP_08: BP_NailPolish = BP_NailPolish( Category.HAENDE,"Nagellack +", Brands.NIFEA, 7.99, "obsidian", 13)
var NP_09: BP_NailPolish = BP_NailPolish( Category.HAENDE,"Nagellack", Brands.NONAME, 4.99, "silber", 9)
var NP_10: BP_NailPolish = BP_NailPolish( Category.HAENDE,"Nagellack", Brands.NONAME, 4.99, "gold", 7)
var NP_11: BP_NailPolish = BP_NailPolish( Category.HAENDE,"Nagellack", Brands.NONAME, 4.99, "orange", 13)
var NP_12: BP_NailPolish = BP_NailPolish( Category.HAENDE,"Nagellack", Brands.NONAME, 4.99, "gelb", 13)


// BathAddits:




