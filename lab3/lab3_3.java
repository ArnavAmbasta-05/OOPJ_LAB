package lab3;
class Apple {
    void show() { System.out.println("Show from Apple"); }
}

class Banana extends Apple {
    void show() { System.out.println("Show from Banana"); }
}

class Cherry extends Apple {
    void show() { System.out.println("Show from Cherry"); }
}

public class lab3_3 {

    public static void main(String[] args) {
        Apple ref;
        ref = new Apple();
        ref.show();
        ref = new Banana();
        ref.show();
        ref = new Cherry();
        ref.show();
    }
}

