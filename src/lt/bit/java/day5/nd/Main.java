package lt.bit.java.day5.hw;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Main {
//    ND 10.29
//    --------
//    Tarkime yra parduota kažkiek prekių (x) už kažkokią kainą (y) ir tai sudaro kažkokią sumą (z).
//    Visos šitos sumos yra su PVM 21%. Parašykite metodą/funkciją su parametrais (kiekis - int, suma su PVM - BigDecimal), kuri atspausdintų pardavimo įrašą tokiu formatu:
//    1. prekės kaina be PVM (tikslumas - 2 ženklai po kablelio)
//    2. kiekis
//    3. suma be PVM (tikslumas 2 ženklai po kablelio)
//    4. PVM suma (tikslumas 2 ženklai po kablelio)
//    5. visa suma su PVM (tikslumas 2 ženklai po kablelio).
//
//    Formulės:
//    [suma su PVM] = 100% + 21%
//    [suma be PVM = [suma su PVM] / 121 * 100
//    [prekes vieneto kaina be PVM] = [suma be PVM] / [kiekis]
//    [PVM suma] = [suma su PVM] - [suma be PVM]

    public static void main(String[] args) {
        Preke preke1 = new Preke(2, "12.1");
        Preke preke2 = new Preke(2, "6.05");
        Preke preke3 = new Preke(5, "100");
    }
}

class Preke {
    private BigDecimal suma, kiekis;

    Preke(int kiekis, String suma) {
        this.kiekis = new BigDecimal(kiekis);
        this.suma   = new BigDecimal(suma);
        printInfo();
    }

    private void printInfo () {
        int scale                   = 2;
        BigDecimal pvm              = BigDecimal.valueOf(1.21);
        BigDecimal prekesKaina      = suma.divide(kiekis, scale, RoundingMode.HALF_UP);
        BigDecimal prekesKainaBePvm = prekesKaina.divide(pvm, scale, RoundingMode.HALF_UP);
        BigDecimal sumaBePvm        = prekesKainaBePvm.multiply(kiekis);
        BigDecimal pvmSuma          = suma.subtract(sumaBePvm);

        System.out.println("\n1. Prekės kaina be PVM: "+ df(prekesKainaBePvm));
        System.out.println("2. Prekės kiekis: "+ kiekis);
        System.out.println("3. Bendra suma be PVM: "+ df(sumaBePvm));
        System.out.println("4. PVM suma: "+ df(pvmSuma));
        System.out.println("5. Bendra suma su PVM: "+ df(suma));
    }

    private String df(BigDecimal value) {
        DecimalFormat df = new DecimalFormat(".00 €");
        return df.format(value);
    }
}