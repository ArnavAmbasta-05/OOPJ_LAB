import java.util.*;
public class lab1_4 {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int originalNum = sc.nextInt();
        int temp = originalNum;
        int reversedNum = 0;
        int remainder;

        while (temp != 0) {
            remainder = temp % 10;
            reversedNum = reversedNum * 10 + remainder;
            temp /= 10;
        }
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome number.");
        } else {
            System.out.println(originalNum + " is not a palindrome number.");
        }
    }
}


