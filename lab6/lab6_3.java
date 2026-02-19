package lab6;
import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

class NumberProcessor {
    public void processInput(int num) throws NegativeNumberException {
        if (num < 0) {
            throw new NegativeNumberException("number should be positive");
        } else {
            System.out.println("Double value: " + (num * 2));
        }
    }
}

public class lab6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberProcessor np = new NumberProcessor();

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        try {
            np.processInput(number);
        } catch (NegativeNumberException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e);
        }

        sc.close();
    }
}

