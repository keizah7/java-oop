package lt.bit.java.day6.nd;

import java.util.Comparator;

public class ShapeComporators {
    public static Object orderByPerimeterAsc;

    static Comparator<Shape> orderByAreaAsc() {
        return new Comparator<Shape>() {
            public int compare(Shape o1, Shape o2) {
                return Double.compare(o1.getArea(), o2.getArea());
            }
        };
    }

    static Comparator<Shape> orderByAreaDesc() {
        return new Comparator<Shape>() {
            public int compare(Shape o1, Shape o2) {
                return Double.compare(o2.getArea(), o1.getArea());
            }
        };
    }

    static Comparator<Shape> orderByPerimeterAsc() {
        return new Comparator<Shape>() {
            public int compare(Shape o1, Shape o2) {
                return Double.compare(o1.getPerimeter(), o2.getPerimeter());
            }
        };
    }

    static Comparator<Shape> orderByPerimeterDesc() {
        return new Comparator<Shape>() {
            public int compare(Shape o1, Shape o2) {
                return Double.compare(o2.getPerimeter(), o1.getPerimeter());
            }
        };
    }
}
