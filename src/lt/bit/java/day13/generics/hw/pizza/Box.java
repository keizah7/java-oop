package lt.bit.java.day13.generics.hw.pizza;

import static java.lang.String.format;

class Box<T1, T2> {
    private final T1 item1;
    private final T2 item2;

    Box(T1 item1, T2 item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    void showContents() {
        System.out.println(format("%s+%s", item1, item2));
    }
}
