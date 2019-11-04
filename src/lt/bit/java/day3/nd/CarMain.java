package lt.bit.java.day3.hw;

public class CarMain {
//    ND 10.25
//    --------
//    1. Klasę Car (kurią sukūrėte ankstesniame ND, jei dar ne.. tai reikėtų ir jos) padaryti abstrakčia ir papildyti laukais: make, model Įdeti abstraktų metodą getFuelType() su grąžinamu tipu String.
//    Sukurti vaikines klases DieselCar ir PetrolCar, kurios implementuotų getFuelType() ir grąžintų reikšmes "diesel" arba "petrol" (reikšmes aprasyti konstantose). Visas klases kurti atskiruose failuose.
//    2. Sukurti klasę Rectangle, kuri praplėstų mūsų sukurtą Shape ir joje implementuoti visus metodus, kurių reikalauja mūsų abstrakti klasė.
//    Taip pat pridėti papildomą metodą isSquare(), kuris turi grąžinti true, jei objektas yra kvadratas.

    public static void main(String[] args) {
        Car automobiliuParkas[] = {
            new PetrolCar("Lada", "manual", 120),
            new PetrolCar("Prius", "automatic", 150),
            new PetrolCar("Ferrari", "manual", 300),
            new DieselCar("Golf", "manual", 200),
        };

        printFastestCarAndGearboxCounts(automobiliuParkas);
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
}