package lab2;
import java.util.*;
class RectArea {
    double length, breadth;

    RectArea() {
        length = 10;
        breadth = 20;
    }

    RectArea(double l, double b) {
        length = l;
        breadth = b;
    }

    void area() {
        System.out.println("Area = " + (length * breadth));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length:");
        double l = sc.nextDouble();
        System.out.println("Enter the breadth");
        double b = sc.nextDouble();

        RectArea r1 = new RectArea();
        r1.area();

        RectArea r2 = new RectArea(l, b);
        r2.area();
    }
}
