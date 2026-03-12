package lab7;
import java.io.*;
import java.util.*;

public class lab7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Roll No: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Subject: ");
            String subject = sc.nextLine();

            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter file name: ");
            String fileName = sc.nextLine();

            FileWriter fw = new FileWriter(fileName, true);
            fw.write(roll + " " + name + " " + subject + " " + marks + "\n");
            fw.close();

            System.out.println("\nContent of file:");

            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
