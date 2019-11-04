package lt.bit.java.day5.hw;

import java.util.*;

public class Zodynas {
//    ND 10.30
//    --------
//    2. Duotas bet koks sąrašas žodžių (žodžiai negali kartotis, pasirinkite tinkamą kolekcijos tipą). Sukurkite žodyną, kuriame būtų saugoma statistinė informacija, apie žodžių kiekį tame sąraše pagal pirmąją raidę neatsižvelgiant į jos dydį.
//    Pvz., jeigu sąraše turime žodžius {"kaimas", "Silvija", "saulė", "kalnas", "sninga", "ajajai"}, tai žodyne būtų tokia informacija: {a=1, k=2, s=3}.
//    Informacija turi būti saugoma surikiuota pagal abėcėlę, raktams ir reikšmėms negalima naudoti String duomenų tipo.

    public static void main(String[] args) {
        Set<String> zodziai = new HashSet<>(Arrays.asList("kaimas",
            "Silvija",
            "saulė",
            "kalnas",
            "sninga",
            "ajajaj"
        ));

        zodynoStatistika(zodziai);
    }

    private static void zodynoStatistika(Set<String> collection){
        Map<Character,Integer> stats = new TreeMap<>();

        for (String word : collection) {
            char firstLetter    = word.toLowerCase().charAt(0);
            Integer count       = stats.get(firstLetter);

            if (count == null) stats.put(firstLetter, 1);
            else stats.put(firstLetter, ++count);
        }

        System.out.println(stats);
    }
}
