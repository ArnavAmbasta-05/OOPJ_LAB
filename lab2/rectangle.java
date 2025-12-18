package lab2;
import java.util.*;
class rectangle {
    double length,breadth;

    rectangle(double l, double b){
        length = l;
        breadth = b;
    }
    void area(){
        System.out.println("Area of the Rectangle:" + (length*breadth));
    }
    void  perimeter(){
        System.out.println("Perimeter of the Rectangle:" + (2*(length + breadth)));
    }
    public static void main(String args[]){
        rectangle r = new rectangle(10,5);
        r.area();
        r.perimeter();
    }
}
