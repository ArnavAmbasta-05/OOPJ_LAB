package lab3;
import java.util.*;
class plastic_sheet{
    double length,breadth;

    void data2D(double l, double b){
        this.length = l;
        this.breadth = b;
    }

    void cost_sheet(){
        System.out.println("Cost of 2D Sheet Plastic: Rs "+ 40*(length*breadth));
    }
}
class plastic_cubic extends plastic_sheet{
    double height;

    void data3D(double l, double b, double h){
        super.length = l;
        super.breadth = b;
        this.height = h;
    }

    void cost_cubic(){
        System.out.println("Cost of 3D Cubic Plastic: Rs "+ 60*(length*breadth*height));
    }
}
public class lab3_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the sheet: ");
        double l = sc.nextDouble();
        System.out.println("Enter the breadth of the sheet: ");
        double b = sc.nextDouble();

        plastic_sheet p1 = new plastic_sheet();
        p1.data2D(l,b);
        p1.cost_sheet();

        System.out.println("Enter the height of the cubic: ");
        double h = sc.nextDouble();

        plastic_cubic p2 = new plastic_cubic();
        p2.data3D(l,b,h);
        p2.cost_cubic();
    }
}
