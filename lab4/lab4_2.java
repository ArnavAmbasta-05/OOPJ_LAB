package lab4;
interface motors{
    int capacity = 500;
    void run();
    void consume();
}
class washingMachine implements motors{
    @Override
    public void run() {
        System.out.println("Motor running....!");
    }

    @Override
    public void consume() {
        System.out.println("Power consumed...!");
    }
}
public class lab4_2 {
    public static void main(String args[]){
        washingMachine wm = new washingMachine();
        wm.run();
        wm.consume();
        System.out.println("Capacity of the motor is:" + motors.capacity);
    }
}
