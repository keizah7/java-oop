package lt.bit.java.day3.nd;

import lt.bit.java.day3.Shape;

class Rectangle extends Shape {
//    2. Sukurti klasę Rectangle, kuri praplėstų mūsų sukurtą Shape ir joje implementuoti visus metodus, kurių reikalauja mūsų abstrakti klasė.
//    Taip pat pridėti papildomą metodą isSquare(), kuris turi grąžinti true, jei objektas yra kvadratas.
    private double a, b;

    Rectangle(String color, double a, double b) {
        super(color);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return 2 * (a + b);
    }

    boolean isSquare() {
        return (a == b);
    }
}