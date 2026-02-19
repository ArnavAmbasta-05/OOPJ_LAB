package lab6;
import java.util.Scanner;

class HrsException extends Exception {
    public HrsException(String message) {
        super(message);
    }
}

class MinException extends Exception {
    public MinException(String message) {
        super(message);
    }
}

class SecException extends Exception {
    public SecException(String message) {
        super(message);
    }
}

class Time {
    int hours, minutes, seconds;

    public void readTime() throws HrsException, MinException, SecException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours: ");
        hours = sc.nextInt();
        if (hours < 0 || hours > 24) {
            throw new HrsException("hour is not greater than 24");
        }

        System.out.print("Enter minutes: ");
        minutes = sc.nextInt();
        if (minutes < 0 || minutes > 60) {
            throw new MinException("hour is not greater than 60");
        }

        System.out.print("Enter seconds: ");
        seconds = sc.nextInt();
        if (seconds < 0 || seconds > 60) {
            throw new SecException("hour is not greater than 60");
        }

        System.out.println("Correct Time-> " + hours + ":" + minutes + ":" + seconds);
    }
}
public class lab6_4 {
    public static void main(String[] args) {
        Time t = new Time();

        try {
            t.readTime();
        } catch (HrsException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: InvalidHourException:" + e.getMessage());
        } catch (MinException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: InvalidMinuteException:" + e.getMessage());
        } catch (SecException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: InvalidSecondException:" + e.getMessage());
        }
    }
}
