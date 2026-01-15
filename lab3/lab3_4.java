package lab3;
import java.util.*;

class Account {
    int acc_no;
    double balance;
    void input(Scanner sc) {
        acc_no = sc.nextInt();
        balance = sc.nextDouble();
    }
    void disp() {
        System.out.println("Acc No: " + acc_no + " Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    long aadhar_no;
    @Override
    void input(Scanner sc) {
        name = sc.next();
        aadhar_no = sc.nextLong();
        super.input(sc);
    }
    @Override
    void disp() {
        System.out.println("Name: " + name + " Aadhar: " + aadhar_no + " Acc No: " + acc_no + " Balance: " + balance);
    }
}

public class lab3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] p = new Person[3];
        System.out.println("Enter the details of 3 persons:");
        for (int i = 0; i < 3; i++) {
            p[i] = new Person();
            p[i].input(sc);
        }
        for (int i = 0; i < 3; i++) p[i].disp();
    }
}
