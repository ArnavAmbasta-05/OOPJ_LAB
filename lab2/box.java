package lab2;
import java.util.*;
class box{
    double length, width , height;

    void volume(){
        System.out.println("Volume of the Box is:" + (length*width*height));
    }
}
class demo{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        box b = new box();

        System.out.println("Enter the length of the box:");
        b.length= sc.nextDouble();
        System.out.println("Enter the width of the box:");
        b.width= sc.nextDouble();
        System.out.println("Enter the height of the box:");
        b.height= sc.nextDouble();

        b.volume();
    }
}
