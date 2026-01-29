package lab4;
import java.util.*;

abstract class student {
    int rollno;
    long regno;

    void getinput(int r, long rg) {
        rollno = r;
        regno = rg;
    }

    abstract String course();
}

class kiitian extends student {
    @Override
    String course() {
        return "B.Tech. (Computer Science & Engg)";
    }
}

public class lab4_1 {
    public static void main(String[] args) {
        kiitian obj = new kiitian();
        obj.getinput(24051473, 1000229873);

        System.out.println("Rollno - " + obj.rollno);
        System.out.println("Registration no - " + obj.regno);
        System.out.println("Course - " + obj.course());
    }
}
