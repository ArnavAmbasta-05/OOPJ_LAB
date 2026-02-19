import java.util.Scanner;
import Marketing.sales;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the employee id:");
        int id = sc.nextInt();
        System.out.print("Enter the Employee name:");
        String name = sc.next();
        System.out.print("Enter the basic of the employee:");
        double basic = sc.nextDouble();

        sales s = new sales(id, name, basic);

        System.out.println("The emp id of the employee is " + s.getEmpId());
        System.out.println("The total earning is " + s.totalEarning());
    }
}

