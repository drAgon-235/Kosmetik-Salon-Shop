

var testAdmin_01: Admin = Admin(1, "Gautam Kutrapali", "gau_pali@yahoo.in", "ganesha123")
var testAdmin_02: Admin = Admin(2, "Marusha Dimitrova", "MarDi@djs.tv", "suoergeil123")



var testCustomer_01: Customer = Customer(1, "Olga Mueller", "Hauptstr. 23, 12345 Mustercity", "o.mueller@gmx.de", "abc123", 0.0)
var testCustomer_02: Customer = Customer(2, "Johanna Sensimilja", "Erich-Fromm-Weg 7, 23456 Magnolienstadt", "Joe123@web.de", "Kickerickie1234", 0.0 )
var testCustomer_03: Customer = Customer(3,"Marijke van den Hutten", "Baumallee 52, 15890 Eisenhüttenstadt", "marHutten@yahoo.com", "huttenTutten789", 0.0)
var testCustomer_04: Customer = Customer(4,"Yesim Keskinsoy", "Am Aubuckel 19, 36546 Obergartenhausen", "YesKes4576@alibaba.com", "MuNaHeDschin", 0.0)
var testCustomer_05: Customer = Customer(5, "Erwin Przybilla", "Schweriner Weg 34, 04333 Leipzig", "epry_Diamond@gmail.com", "masturabiato12345", 0.0)



//Pseudo DB Neue Struktur:
// Allgemeine Produkte (Mutterklasse BeautyProduct):
var mixed_01: BeautyProduct = BeautyProduct(Category.GEMISCHT, "Buch: 'Wie bleibe ich ewig jung'", Brands.NONAME, 19.40, 14)
var mixed_02: BeautyProduct = BeautyProduct(Category.GEMISCHT, "Buch: 'Das Geheimnis ewiger Jugend'", Brands.NONAME, 9.30, 17)
var mixed_03: BeautyProduct = BeautyProduct(Category.GEMISCHT, "Kalender 2024 - Exzentrische Make-ups", Brands.AFON, 24.80, 31)
var mixed_04: BeautyProduct = BeautyProduct(Category.GEMISCHT, "Buch: 'Die Geschichte der Kosmetik und Beautybranche'", Brands.AFON, 39.90, 28)
var mixed_05: BeautyProduct = BeautyProduct(Category.GEMISCHT, "Überraschungskorb - Hände (1 x Handseife, 1 x Handcreme,  1 x Handpeeling, 1 x Duschgel ", Brands.NIFEA, 29.90, 12)
var mixed_06: BeautyProduct = BeautyProduct(Category.GEMISCHT, "Überraschungskorb - Gesicht (1 x Gesichtsseife, 1 x Gesichtscreme,  1 x Gesichtspeeling, 1 x Duschgel ", Brands.NIFEA, 35.90, 15)



// Soap:
var Soap_01: BP_Soap = BP_Soap( Category.GESICHT, "Gesichtsseife", Brands.NIFEA, 5.99, "Vanille", 0, 19)
var Soap_02: BP_Soap = BP_Soap( Category.GESICHT, "Gesichtsseife", Brands.NIFEA, 5.99, "Himbeere", 0, 34)
var Soap_03: BP_Soap = BP_Soap( Category.BODY, "Duschgel", Brands.NIFEA, 9.99, "Vanille", 250, 27)
var Soap_04: BP_Soap = BP_Soap( Category.BODY, "Duschgel", Brands.NIFEA, 9.99, "Himbeere", 250, 31)
var Soap_05: BP_Soap = BP_Soap( Category.GESICHT, "Gesichtsseife", Brands.AFON, 9.99, "Vanille", 0, 40)
var Soap_06: BP_Soap = BP_Soap( Category.GESICHT, "Gesichtsseife", Brands.AFON, 9.99, "Himbeere", 0, 35)
var Soap_07: BP_Soap = BP_Soap( Category.BODY, "Duschgel", Brands.AFON, 19.99, "Meeresbrise", 300, 28)
var Soap_08: BP_Soap = BP_Soap( Category.BODY, "Duschgel", Brands.AFON, 19.99, "Pinienwald", 300, 24)
var Soap_09: BP_Soap = BP_Soap( Category.GESICHT, "Gesichtsseife", Brands.NONAME, 2.99, "Meeresbrise", 0, 33)
var Soap_10: BP_Soap = BP_Soap( Category.BODY, "Duschgel", Brands.NONAME, 6.99, "Pinienwald", 300, 34)
var Soap_11: BP_Soap = BP_Soap( Category.HAENDE, "Tief reinigende Handseife", Brands.NONAME, 3.99, "Jasmin", 0, 24)
var Soap_12: BP_Soap = BP_Soap( Category.HAENDE, "Antibakterielle Flüssig-Handseife", Brands.NIFEA, 9.99, "Alkohol", 400, 27)
var Soap_13: BP_Soap = BP_Soap( Category.HAENDE, "Seifen-Balsam", Brands.AFON, 8.99, "Lotusblüte", 175, 22)
var Soap_14: BP_Soap = BP_Soap( Category.HAENDE, "Kernseife", Brands.NONAME, 1.99, "Neutral", 0, 42)
var Soap_15: BP_Soap = BP_Soap(Category.FUESSE, "Spezialseife für Füße gegen Fusspilz", Brands.NONAME, 6.80, "Latschenkiefer", 0, 21)
var Soap_16: BP_Soap = BP_Soap(Category.FUESSE, "Antibakterielle Fussseife", Brands.NIFEA, 9.70, "Waldkräuter", 0, 21)


// Creme:
var Cr_01: BP_Creme = BP_Creme(Category.GESICHT, "Gesichtscreme Tag", Brands.AFON, 49.50, 60, 15 )
var Cr_02: BP_Creme = BP_Creme(Category.GESICHT, "Gesichtscreme Nacht", Brands.AFON, 39.50, 50, 37 )
var Cr_03: BP_Creme = BP_Creme(Category.GESICHT, "Gesichtscreme Tag", Brands.NIFEA, 29.50, 45, 35 )
var Cr_04: BP_Creme = BP_Creme(Category.GESICHT, "Gesichtscreme Nacht", Brands.NIFEA, 35.50, 45, 29 )
var Cr_05: BP_Creme = BP_Creme(Category.GESICHT, "Gesichtscreme Tag", Brands.NONAME, 19.50, 40, 35 )
var Cr_06: BP_Creme = BP_Creme(Category.GESICHT, "Gesichtscreme Nacht", Brands.NONAME, 15.50, 40, 27 )
var Cr_07: BP_Creme = BP_Creme(Category.HAENDE, "Handcreme Deluxe", Brands.AFON, 15.50, 65, 35 )
var Cr_08: BP_Creme = BP_Creme(Category.HAENDE, "All Day Handcreme", Brands.NIFEA, 8.50, 55, 25 )
var Cr_09: BP_Creme = BP_Creme(Category.HAENDE, "Just Handcreme", Brands.NONAME, 3.50, 55, 35 )
var Cr_10: BP_Creme = BP_Creme(Category.FUESSE, "Fusscreme mit anti-pilz Wirkung", Brands.AFON, 15.50, 75, 25 )
var Cr_11: BP_Creme = BP_Creme(Category.FUESSE, "Creme für tägliche Fusshygiene", Brands.NIFEA, 13.50, 75, 28 )
var Cr_12: BP_Creme = BP_Creme(Category.FUESSE, "Antibakterielle Fusscreme", Brands.NONAME, 7.50, 60, 35 )
var Cr_13: BP_Creme = BP_Creme(Category.BODY, "Bodylotion Deluxe", Brands.AFON, 17.60, 600, 22)
var Cr_14: BP_Creme = BP_Creme(Category.BODY, "Bodylotion trockene Haut", Brands.AFON, 18.60, 600, 17)
var Cr_15: BP_Creme = BP_Creme(Category.BODY, "Bodylotion Unisex", Brands.NIFEA, 13.60, 700, 32)
var Cr_16: BP_Creme = BP_Creme(Category.BODY, "Bodylotion", Brands.NONAME, 9.60, 700, 27)


// Peeling:
var Peel_01: BP_Peeling = BP_Peeling(Category.GESICHT, "Gesichtspeeling für Frauenhaut", Brands.AFON, 20.90, 200, 18)
var Peel_02: BP_Peeling = BP_Peeling(Category.GESICHT, "Gesichtspeeling für Männerhaut", Brands.AFON, 20.90, 200, 25)
var Peel_03: BP_Peeling = BP_Peeling(Category.GESICHT, "Gesichtspeeling für Frauen", Brands.NIFEA, 15.90, 220, 23)
var Peel_04: BP_Peeling = BP_Peeling(Category.GESICHT, "Gesichtspeeling für Männer", Brands.NIFEA, 15.90, 220, 29)
var Peel_05: BP_Peeling = BP_Peeling(Category.HAENDE, "Peeling für die Hände (unisex)", Brands.AFON, 19.90, 150, 28)
var Peel_06: BP_Peeling = BP_Peeling(Category.HAENDE, "Peeling für Hände", Brands.NIFEA, 16.90, 130, 25)
var Peel_07: BP_Peeling = BP_Peeling(Category.HAENDE, "Peeling für Hände", Brands.NONAME, 9.90, 140, 23)
var Peel_08: BP_Peeling = BP_Peeling(Category.FUESSE, "Peeling für die Füße", Brands.AFON, 19.90, 250, 19)
var Peel_09: BP_Peeling = BP_Peeling(Category.FUESSE, "Peeling für Füße", Brands.NIFEA, 16.90, 250, 21)
var Peel_10: BP_Peeling = BP_Peeling(Category.FUESSE, "Peeling für Füße", Brands.NONAME, 10.90, 230, 29)
var Peel_11: BP_Peeling = BP_Peeling(Category.BODY, "Peeling für das Dekolletee", Brands.AFON, 19.90, 300, 39)
var Peel_12: BP_Peeling = BP_Peeling(Category.BODY, "Peeling für Dekolletee", Brands.NIFEA, 15.90, 270, 27)
var Peel_13: BP_Peeling = BP_Peeling(Category.BODY, "Universal-Peeling für den ganzen Körper", Brands.NONAME, 14.90, 300, 29)


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
var BA_01: BP_BathAddits = BP_BathAddits(Category.BODY, "Badesalz - Meeresbrise - Big Pack", Brands.AFON, 25.90, 0, 1000, 10)
var BA_02: BP_BathAddits = BP_BathAddits(Category.BODY, "Badesalz - Meeresbrise - Standard Pack", Brands.AFON, 15.90, 0, 500, 8)
var BA_03: BP_BathAddits = BP_BathAddits(Category.BODY, "Badesalz - Honigmelone - Big Pack", Brands.AFON, 25.90, 0, 1000, 5)
var BA_04: BP_BathAddits = BP_BathAddits(Category.BODY, "Badesalz - Honigmelone - Standard Pack", Brands.AFON, 15.90, 0, 500, 8)
var BA_05: BP_BathAddits = BP_BathAddits(Category.BODY, "Badesalz - Erdbeer/Vanille - Big Pack", Brands.AFON, 25.90, 0, 1000, 10)
var BA_06: BP_BathAddits = BP_BathAddits(Category.BODY, "Badesalz - Erdbeer/Vanille - Standard Pack", Brands.AFON, 15.90, 0, 500, 7)
var BA_07: BP_BathAddits = BP_BathAddits(Category.BODY, "Badesalz - Meeresrauschen - Big Pack", Brands.NIFEA, 17.90, 0, 1000, 11)
var BA_08: BP_BathAddits = BP_BathAddits(Category.BODY, "Badesalz - Meeresrauschen - Standard Pack", Brands.NIFEA, 10.90, 0, 500, 8)
var BA_09: BP_BathAddits = BP_BathAddits(Category.BODY, "Badesalz - Himbeere - Big Pack", Brands.NIFEA, 17.90, 0, 1000, 8)
var BA_10: BP_BathAddits = BP_BathAddits(Category.BODY, "Badesalz - Himbeere - Standard Pack", Brands.NIFEA, 10.90, 0, 500, 7)
var BA_11: BP_BathAddits = BP_BathAddits(Category.BODY, "Badesalz - Kokos/Mango - Big Pack", Brands.NIFEA, 17.90, 0, 1000, 3)
var BA_12: BP_BathAddits = BP_BathAddits(Category.BODY, "Badesalz - Kokos/Mango - Standard Pack", Brands.NIFEA, 10.90, 0, 500, 2)
var BA_13: BP_BathAddits = BP_BathAddits(Category.BODY, "Bad Balsam - Honig", Brands.NONAME, 7.90, 750, 0, 12)
var BA_14: BP_BathAddits = BP_BathAddits(Category.BODY, "Bad Balsam - Jasminblüten", Brands.NONAME, 7.90, 750, 0, 7)
var BA_15: BP_BathAddits = BP_BathAddits(Category.BODY, "Bad Balsam - Rosenblüten", Brands.NONAME, 7.90, 750, 0, 6)
var BA_16: BP_BathAddits = BP_BathAddits(Category.FUESSE, "Spezialsalz für's Fussbad mit Bachblütenextrakt", Brands.AFON, 25.90, 0, 250, 13 )
var BA_17: BP_BathAddits = BP_BathAddits(Category.FUESSE, "Spezialsalz für's Fussbad mit Wacholder", Brands.AFON, 25.90, 0, 250, 19 )
var BA_18: BP_BathAddits = BP_BathAddits(Category.FUESSE, "Heilsalz für's Fussbad mit Waldkräutern ", Brands.NIFEA, 15.90, 0, 270, 33 )
var BA_19: BP_BathAddits = BP_BathAddits(Category.FUESSE, "Heilerde für's Fussbad mit Spurenelementen und Mineralien", Brands.NIFEA, 16.90, 0, 240, 29 )
var BA_20: BP_BathAddits = BP_BathAddits(Category.FUESSE, "Badesalz für's Fussbad mit Honigextrakt", Brands.NONAME, 13.90, 0, 255, 27 )
