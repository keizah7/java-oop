package lt.bit.java.day13.generics.hw.pizza;

/**
 * Sukurti enum'a Sauce (MILD, SPICY, MIX) su lauku description, kuriame butu detalesne informacija apie padaza
 * (metodas toString() turi isvesti si aprasyma).
 * Sukurti klase Pizza, su lauku name (metodas toString() turi isvesti si pavadinima).
 * Sukurti generic klase Box<T1, T2>, kuri butu wrapperis musu picai ir padazui. Ji atitks dezutes savoka musu produktams.
 * Box klaseje aprasyti metoda, kuris atspausdintu jos turini (pvz. jei ideta pica Margarita,
 * o padazas svelnus, rezultatas turetu buti: Margarita+svelnus).
 * Naujoje klaseje (pvz. PizzaMain) sukurti dezute, ideti i ja pica su padazu ir patikrinti dezutes turini.
 */

class PizzaMain {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("Margarita");
        Box<Pizza, Sauce> box = new Box<>(pizza, Sauce.MIX);
        box.showContents();

        Box<Sauce, Pizza> box2 = new Box<>(null, new Pizza("Acapulco"));
        box2.showContents();

        Box<String, Integer> box3 = new Box<>("Baltic", 1);
        box3.showContents();
    }
}
