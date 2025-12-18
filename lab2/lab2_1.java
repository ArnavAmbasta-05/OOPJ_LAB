package lab2;
import java.util.*;
public class lab2_1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10 ; i++){
            int n = sc.nextInt();
            if(n % 2 == 0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.println("Even Numbers are :" + even);
        System.out.println("Odd Numbers are :" + odd);
    }
}
