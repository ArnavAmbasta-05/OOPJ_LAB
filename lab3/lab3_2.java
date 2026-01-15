package lab3;
import java.util.*;

class Plate {
    int length, width;
    Plate(int l, int w) {
        length = l;
        width = w;
        System.out.println("Plate: length=" + length + " width=" + width);
    }
}

class Box extends Plate {
    int height;
    Box(int l, int w, int h) {
        super(l, w);
        height = h;
        System.out.println("Box: length=" + length + " width=" + width + " height=" + height);
    }
}

class WoodBox extends Box {
    int thick;
    WoodBox(int l, int w, int h, int t) {
        super(l, w, h);
        thick = t;
        System.out.println("WoodBox: length=" + length + " width=" + width + " height=" + height + " thick=" + thick);
    }
}

class lab3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Length:");
        int l = sc.nextInt();
        System.out.println("Width:");
        int w = sc.nextInt();
        System.out.println("Height:");
        int h = sc.nextInt();
        System.out.println("Thickness:" );
        int t = sc.nextInt();
        new WoodBox(l, w, h, t);
    }
}

