package lt.bit.java.day2;

class SchoolBoy {
    String vardas, pavarde;
    int klase;

    SchoolBoy(String vardas, String pavarde, int klase) {
        this.vardas     = vardas;
        this.pavarde    = pavarde;
        this.klase      = klase;
    }

    SchoolBoy() {
        vardas = "Vardenis";
        pavarde = "Pavardenis";
        klase   = 1;
    }
}

public class Task1 {
//    1. Tarkime turime masyvą objektų Mokinys. Reikia atspausdinti
//    mokinių vardus ir pavardes surūšiuotus pagal klases ir pagal
//    pavardes bei vardus. Pastaba: nustatykite keliems iš vienos klasės
//    mokiniams tas pačias pavardes bet skirtingus vardus, kad patikrinti
//    ar gerai rūšiuoja. *string tipo kintamųjų palyginimui naudokite
//    metodą pvz: vardas.compareToIgnoreCase();

    public static void main(String[] args) {
        SchoolBoy mokiniai[] = {
            new SchoolBoy("Antanas", "Baranauskas", 9),
            new SchoolBoy(),
            new SchoolBoy("Sakalas", "Uždavinys", 1),
            new SchoolBoy("Artūras", "Židinys", 9),
            new SchoolBoy("Artūras", "Muraška", 1),
            new SchoolBoy("Marek", "Silko", 3),
            new SchoolBoy("Artūras", "Cololo", 9),
            new SchoolBoy("Giedrius", "Viršilas", 7),
            new SchoolBoy("Antanas", "B.", 2),
            new SchoolBoy("Antanas", "A.", 2),
            new SchoolBoy("Cecilija", "E.", 2),
            new SchoolBoy("Cecilija", "A.", 2),
        };

        orderByClassAndFullName(mokiniai);
        System.out.println("Mokiniai surūšiuoti pagal klases ir vardus bei pavardes:");

        for (int i = 0; i < mokiniai.length; i++) System.out.println(mokiniai[i].klase + "kl. " + mokiniai[i].vardas + " " + mokiniai[i].pavarde);
    }

    static void orderByClassAndFullName(SchoolBoy[] arr) {
        for (int i = 0; i < arr.length - 1 ; i++) {
            for (int j = 0; j < arr.length - 1 ; j++) {
                SchoolBoy val = arr[j];

                if (arr[j].klase > arr[j+1].klase) {
                    arr[j] = arr[j+1];
                    arr[j+1] = val;
                }

                SchoolBoy value = arr[j];

                if(arr[j].klase == arr[j+1].klase) {
                    if (arr[j].vardas.compareToIgnoreCase(arr[j+1].vardas) >= 0) {
                        if(arr[j].vardas == arr[j+1].vardas) {
                            if (arr[j].pavarde.compareToIgnoreCase(arr[j+1].pavarde) > 0) {
                                arr[j] = arr[j+1];
                                arr[j+1] = value;
                            }
                        } else {
                            arr[j] = arr[j+1];
                            arr[j+1] = value;
                        }
                    }
                }
            }
        }
    }
}
