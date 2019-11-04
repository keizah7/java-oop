package lt.bit.java.day4.nd;

public class Main {
//    ND 10.28
//    --------
//    Sukurti interfeisą Driver. Interfeise turi būti metodai canDriveACar() ir canRideABike(), kurie grąžins boolean reikšmes.
//    Sukurti abstrakčia klase FamilyMember, kurioje būtų laukai: name, age. Šie laukai turetų būti final ir nustatomi tik iš konstruktoriaus.
//
//    Sukurti FamilyMember vaikines klases Father (gali vairuoti visas transporto priemones),
//    Mother (yra vairuotoja, bet šiuo metu negali vairuoti jokios transporto priemonės),
//    Son (gali važiuoti dviračiu, o vairuoti automobilį tik jei yra pilnametis),
//    Daughter (gali važiuoti tik dviračiu),
//    Dog (yra šeimos narys, bet ne vairuotojas).
//    Driver turi būti implementuotas visiems šeimos nariams-vairuotojams.
//
//    Sukurti klasę su main metodu. Metode turime sukurti dvi šeimas palyginimui. Vieną sudaro  tėvas, mama, sūnus ir dukra, kitoje auga tik vienas vaikas (nesvarbu koks) ir šuniukas.
//    Šioje dalyje jau galima koreguoti, kas ką gali vairuoti, paduodant papildomus parametrus iš vaikinių klasių ar kviečiant set metodus.
//
//    Atspausdinti šeimų statistiką
//    1) kiek šeimos narių kiekvienoje šeimoje;
//    2) kiek vairuotojų šeimoje;
//    3) kiek iš jų gali vairuoti visas transporto priemones;
//    4) kuris šeimos narys yra vyriausias;
//    5) koks yra amžiaus vidurkis šeimoje.
//
//    Visi skaičiavimai turi būti aprašyti atskiroje klasėje FamilyStats. Ši klasė turi turėti konstruktorių su parametru paduoti šeimai, o visa statistika spausdinama per tos klasės metodus, pvz.: stats = new FamiStats(family1); stats.countFamilyMembers(); ir t.t.

    public static void main(String[] args) {
        FamilyMember[] familyOne = {
            new Father("Viktoras", 59),
            new Mother("Liubov", 61),
            new Son("Artūras", 24),
            new Daughter("Nijolė", 22),
            new Dog("Tobas", 1),
        };

        FamilyMember[] familyTwo = {
            new Father("Saimonas", 33),
            new Mother("Andžela", 29),
            new Son("Michaelis", 17),
            new Dog("Rex", 3),
        };

        FamilyStats familyOneStats = new FamilyStats(familyOne);
        familyOneStats.printFamilyStats();

        FamilyStats familyTwoStats = new FamilyStats(familyTwo);
        familyTwoStats.printFamilyStats();
    }
}
