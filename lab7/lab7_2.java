package lab7;
import java.io.*;
import java.util.*;

public class lab7_2 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter source file name: ");
        String source = sc.nextLine();

        System.out.print("Enter destination file name: ");
        String dest = sc.nextLine();

        // Character Stream
        FileReader fr = new FileReader(source);
        FileWriter fw = new FileWriter(dest);

        int ch;
        while ((ch = fr.read()) != -1) {
            fw.write(ch);
        }

        fr.close();
        fw.close();

        // Byte Stream
        FileInputStream fis = new FileInputStream(source);
        FileOutputStream fos = new FileOutputStream(dest);

        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }

        fis.close();
        fos.close();

        System.out.println("File Copied");
    }
}
