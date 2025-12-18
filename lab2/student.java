package lab2;
import java.util.*;
class student {
    int roll;
    String name;
    double cgpa;
}
class studentDemo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of Students:");
        int n = sc.nextInt();

        student[] s = new student[n];
        int min = 0;

        System.out.println("Enter the details of " + n + " students:");
        for (int i = 0; i < n; i++) {
            s[i] = new student();
            s[i].roll = sc.nextInt();
            s[i].name = sc.next();
            s[i].cgpa = sc.nextDouble();

            if (s[i].cgpa < s[min].cgpa) {
                min = i;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(s[i].roll + " " + s[i].name + " " + s[i].cgpa);
        }
        System.out.println("Lowest CGPA Student: " + s[min].name);
    }
}
