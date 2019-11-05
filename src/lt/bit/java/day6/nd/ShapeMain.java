package lt.bit.java.day6.nd;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class ShapeMain {
    private static List<Shape> shapes;
//    ND 11.04
//    --------
//    Sukurti klasę ShapeComparators su statiniais metodais, kurie grąžina keturis comparatorius:
//    1. Lyginimas pagal plotą didėjimo tvarka;
//    2. Lyginimas pagal plotą mažėjimo tvarka;
//    3. Lyginimas pagal perimetrą didėjimo tvarka;
//    4. Lyginimas pagal perimetrą mažėjimo tvarka.
//
//    Atskiroje klasėje su main() metodu sukurti sąrašą iš skirtingų figūrų (Circle, Triangle, Rectangle) ir surikiuoti jas panaudojus visus comparatorius.
//
//    Jei pavyks su google pagalba panaudoti dar ir penktą būdą: surikiuoti pagal ploto ir perimetro comparatorius (panaudoti Comparator.thenComparing) didėjimo tvarka.
//    Tokiu atveju, jei plotai sutaps, bus atsižvelgiama į perimetrą.
//    Atspausdinti rezultatus po kiekvieno rikiavimo.
    public static void main(String[] args) {
        shapes = Arrays.asList(
            new Circle("red", 1),
            new Triangle("blue", 2, 2, 2),
            new Rectangle("green", 2, 3)
        );

        printShapes();
        Collections.sort(shapes, ShapeComporators.orderByAreaAsc());
        printShapes("1. Lyginimas pagal plotą didėjimo tvarka");

        Collections.sort(shapes, ShapeComporators.orderByAreaDesc());
        printShapes("2. Lyginimas pagal plotą mažėjimo tvarka");

        Collections.sort(shapes, ShapeComporators.orderByPerimeterAsc());
        printShapes("3. Lyginimas pagal perimetrą didėjimo tvarka");

        Collections.sort(shapes, ShapeComporators.orderByPerimeterDesc());
        printShapes("4. Lyginimas pagal perimetrą mažėjimo tvarka");

        Comparator<Shape> compareByAreaAndPerimeter = Comparator.comparing(Shape::getArea).thenComparing(Shape::getPerimeter);
        Collections.sort(shapes, compareByAreaAndPerimeter);
        printShapes("5. Surikiuoti pagal ploto ir perimetro comparatorius didėjimo tvarka");
    }

    static void printShapes() {
        System.out.println(shapes);
    }
    static void printShapes(String text) {
        System.out.println("\n"+text+": "+shapes);
    }
}