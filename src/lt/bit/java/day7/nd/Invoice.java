package lt.bit.java.day7.nd;

import java.math.BigDecimal;
import java.time.LocalDate;

class Invoice {
//    2. Sukurkite sąskatas faktūras aprašančią klasę, kurioje būtų sąskaitos
//    datos laukas (LocalDate), kliento laukas (klasė arba tik String tipo ) ir
//    sumos laukas BigDecimal Sukurkite sąrašą tokių įrašų su
//    skirtingomis datomis ir sumomis Parašykite metodą kuris iš sąrašo
//    suformuoja kitą sąrašą ataskaitą parodančią kokios yra pajamos
//    pagal ketvirčius.
    private LocalDate data;
    private String client;
    private BigDecimal sum;

    Invoice(LocalDate data, String client, String sum) {
        this.data = data;
        this.client = client;
        this.sum = new BigDecimal(sum);
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "data=" + data +
                ", client='" + client + '\'' +
                ", sum=" + sum +
                '}';
    }

    public LocalDate getData() {
        return data;
    }

    public BigDecimal getSum() {
        return sum;
    }
}
