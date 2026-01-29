package lab4;
import java.util.Scanner;

interface Salary {
    double earnings(double basic);
    double deductions(double basic);
    double bonus(double basic);
}

class Manager implements Salary {
    public double earnings(double basic) {
        return basic + (0.80 * basic) + (0.15 * basic);
    }

    public double deductions(double basic) {
        return 0.12 * basic;
    }

    public double bonus(double basic) {
        throw new UnsupportedOperationException();
    }
}

class Substaff extends Manager {
    public double bonus(double basic) {
        return 0.50 * basic;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double basic = 50000;
        Substaff s = new Substaff();

        double earn = s.earnings(basic);
        double ded = s.deductions(basic);
        double bon = s.bonus(basic);

        System.out.println("Earnings - " + earn);
        System.out.println("Deduction - " + ded);
        System.out.println("Bonus - " + bon);
    }
}
