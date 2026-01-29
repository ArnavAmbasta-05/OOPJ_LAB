package lab4;
import java.util.Scanner;

interface Employee {
    void getDetails(int empId, String empName);
}

interface manager extends Employee {
    void getDeptDetails(int deptId, String deptName);
}

class Head implements manager {
    int id;
    String name;
    int deptId;
    String deptName;

    public void getDetails(int empId, String empName) {
        id = empId;
        name = empName;
    }

    public void getDeptDetails(int dId, String dName) {
        deptId = dId;
        deptName = dName;
    }

    public void printDetails() {
        System.out.println("Employee id - " + id);
        System.out.println("Employee name - " + name);
        System.out.println("Department id - " + deptId);
        System.out.println("Department name - " + deptName);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int empId = 123;
        String empName = "Sidharth Ambani";
        int dId = 06;
        String dName = "Marketing";

        Head h = new Head();
        h.getDetails(empId, empName);
        h.getDeptDetails(dId, dName);
        h.printDetails();
    }
}
