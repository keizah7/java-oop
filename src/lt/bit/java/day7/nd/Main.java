package lt.bit.java.day7.nd;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDate;
import java.time.temporal.IsoFields;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
//    ND 11.05
//    --------
//    1. Sukurkite miestu enum reiksmes. Kiekvienam enum tipo miestui
//    priskirkite zmoniu sveika skaiciu. Pvz Vilnius 20000;
//    Atspausdinkite miestus didejimo tvarka pagal zmoniu skaiciu.
//
//    2. Sukurkite sąskatas faktūras aprašančią klasę, kurioje būtų sąskaitos
//    datos laukas (LocalDate), kliento laukas (klasė arba tik String tipo ) ir
//    sumos laukas BigDecimal Sukurkite sąrašą tokių įrašų su
//    skirtingomis datomis ir sumomis Parašykite metodą kuris iš sąrašo
//    suformuoja kitą sąrašą ataskaitą parodančią kokios yra pajamos
//    pagal ketvirčius.
    public static void main(String[] args) {
        City[] cityOrderedByPopulationAsc = City.values();
        Arrays.sort(cityOrderedByPopulationAsc, Comparator.comparing(City::getPopulation));

        System.out.println("1."+ Arrays.toString(cityOrderedByPopulationAsc));

        Invoice[] invoices = {
            new Invoice(LocalDate.of(2019, 12, 26),"BIT", "100"),
            new Invoice(LocalDate.of(2019, 11, 26),"BIT", "1200"),
            new Invoice(LocalDate.of(2019, 3, 26),"Artūras", "50"),
            new Invoice(LocalDate.of(2019, 8, 26),"Saulius", "70"),
            new Invoice(LocalDate.of(2019, 8, 26),"Paulius", "250")
        };

        printQuarterResults(invoices);
    }

    static void printQuarterResults(Invoice[] invoices) {
        System.out.println("\n2. ");

        BigDecimal[] quarterIncome = new BigDecimal[4];
        Arrays.fill(quarterIncome, BigDecimal.ZERO);

        for (Invoice i : invoices) {
            int quarter = i.getData().get(IsoFields.QUARTER_OF_YEAR);

            quarterIncome[quarter - 1] = quarterIncome[quarter - 1].add(i.getSum());
        }

        for (int i = 0; i < quarterIncome.length; i++)  System.out.println(i + 1 + " ketvirčio pajamos yra "+ df(quarterIncome[i]));
    }

    private static String df(BigDecimal value) {
//        if(value.compareTo(BigDecimal.ZERO) == 0) return "0 €";

        DecimalFormat df = new DecimalFormat("0.00 €");
        return df.format(value);
    }
}
