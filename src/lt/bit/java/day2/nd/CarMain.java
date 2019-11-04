package lt.bit.java.day2.nd;

public class CarMain {
//    ND 10.24
//    --------
//    1. Sukurti public klasę CarMain su main metodu. Po ja tame pačiame faile sukurti klase Car su laukais: String gearBox; int maxSpeed;
//    Sukurti get ir set metodus Car klaseje, kurie keistų ir grąžintų atitinkamas laukų reikšmes: getGearbox(), setGearBox, getMaxSpeed(), setMaxSpeed.
//
//    Sukurti Car klasės konstruktorius: su abiem parametrais, be parametrų, su vienu skirtingu parametru (2 konstruktoriai, po vieną kiekvienam laukui).
//
//    Klaseje Car pridėti laukelį name, kuriame bus saugomas automobilio pavadinimas.
//    Sukurti masyvą is penkių skirtingų automobilių. Automobiliai gali tureti gearBox reikšmes "manual" arba "automatic", maxSpeed gali būti tik teigiamas skaičius.
//
//    Atspausdinti automobilio pavadinima su didžiausiu greičiu.
//    Suskaičiuoti automobilius pagal pavarų dėžės tipą ir atspasdinti kiek turime su automatine ir kiek su mechanine pavarų dėže.
//
//    2. Turime du masyvus int[] a = {5, 6, 10, 15, 8, 4} ir int[] b = {8, 5, 3}. Raskite kiekvieno masyvo skaičių vidurkį ir atspausdinkite jų skirtumą (atimant iš didesniojo mažesnįjį).
//
//    3 [BONUS]. Tobuluoju skaičiumi vadinamas natūralusis skaičius, lygus
//    * visų savo daliklių, mažesnių už save patį, sumai (pvz 28 = 1 + 2 + 4 + 7 + 14).
//    * Suraskite visus tokius skaičius iš intervalo 1…1000.

    public static void main(String[] args) {
        Car automobiliuParkas[] = {
                new Car("Lada", "manual", 120),
                new Car("Prius", "automatic", 150),
                new Car("Ferrari", "manual", 300),
                new Car("Golf", "manual", 200),
        };

        printFastestCarAndGearboxCounts(automobiliuParkas);
        secondTask();
        thirdTask();
    }

    static void printFastestCarAndGearboxCounts(Car[] automobiliuParkas){
        int maxSpeed = 0, automaticCount = 0, manualCount   = 0;
        String fastestCarName                               = "";

        for (Car c : automobiliuParkas) {
            if (maxSpeed < c.maxSpeed) {
                maxSpeed        = c.maxSpeed;
                fastestCarName  = c.name;
            }

            if (c.gearBox == "manual") manualCount++; else automaticCount++;
        }

        System.out.println(
                "1. Automobilis " + fastestCarName + " vazuoja greiciausiai " + maxSpeed + "(km/h)\n"+
                "Automobiliu parke yra " + automaticCount + " automobiliai su automatine deze ir " + manualCount + " mechanine"
        );
    }

    static void secondTask() {
        int a[] = {5, 6, 10, 15, 8, 4};
        int b[] = {8, 5, 3};

        System.out.print("2. Masyvų vidurkių skirtumas atimant iš didesniojo mažesnįjį: ");
        if (arrAverage(a) > arrAverage(b)) System.out.println(arrAverage(a) - arrAverage(b));
        else System.out.println(arrAverage(b) - arrAverage(a));
    }

    static double arrAverage(int[] arr) {
        double suma = 0;

        for (int i = 0; i < arr.length; i++) suma += arr[i];

        return suma / arr.length;
    }

    static void thirdTask() {
        System.out.print("3. Tobulieji skaičiai:");
        for (int i = 1; i <= 1000; i++) {
            int suma = 0;

            for (int j = 1; j < i; j++) if (i % j == 0) suma += j;

            if(suma == i) System.out.print(" " + i);
        }
    }
}

class Car {
    String name, gearBox;
    int maxSpeed;

    public Car(String name, String gearBox, int maxSpeed) {
        this.name = name;
        this.gearBox = gearBox;
        this.maxSpeed = maxSpeed;
    }

    public Car(String gearBox, int maxSpeed) {
        this.gearBox = gearBox;
        this.maxSpeed = maxSpeed;
    }

    public Car() {
    }

    public Car(String gearBox) {
        this.gearBox = gearBox;
    }

    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getGearBox() {
        return gearBox;
    }

    public void setGearBox(String gearBox) {
        if (gearBox == "automatic" || gearBox == "manual") {
            this.gearBox = gearBox;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        }
    }
}

