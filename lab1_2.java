import java.util.*;
public class lab1_2 {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks out of 100:");
        int marks = sc.nextInt();
        if(marks >= 90){
            System.out.println("Grade is O");
        } else if (marks >= 80 & marks <= 89) {
            System.out.println("Grade is E");
        } else if (marks >= 70 & marks <=79) {
            System.out.println("Grade is A");
        } else if (marks >= 60 & marks <=69) {
            System.out.println("Grade is B");
        } else{
            System.out.println("Grade is C");
        }
    }
}
