import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1, str2, insertStr;
        char ch;

        // i) Change case of string
        System.out.print("Enter a String: ");
        str1 = sc.nextLine();

        StringBuilder changedCase = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if (Character.isLowerCase(c))
                changedCase.append(Character.toUpperCase(c));
            else if (Character.isUpperCase(c))
                changedCase.append(Character.toLowerCase(c));
            else
                changedCase.append(c);
        }
        System.out.println("The string after changing the case is " + changedCase);

        // ii) Reverse the string
        String reversed = new StringBuilder(str1).reverse().toString();
        System.out.println("The string after reversing is " + reversed);

        // iii) Compare two strings
        System.out.print("\nEnter the second string for comparison: ");
        str2 = sc.nextLine();
        int diff = str1.compareTo(str2);
        System.out.println("The difference between ASCII value is " + diff);

        // iv) Insert one string into another
        System.out.print("\nEnter the string to be inserted into first string: ");
        insertStr = sc.nextLine();
        String inserted = str1 + " " + insertStr;
        System.out.println("The string after insertion is: " + inserted);

        // v) Convert to upper and lower case
        System.out.print("\nEnter a String: ");
        str1 = sc.nextLine();
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());

        // vi) Check character presence and position
        System.out.print("\nEnter a String: ");
        str1 = sc.nextLine();
        System.out.print("Enter a character: ");
        ch = sc.next().charAt(0);
        sc.nextLine(); // clear buffer

        int pos = str1.indexOf(ch);
        if (pos != -1)
            System.out.println("Position of entered character: " + pos);
        else
            System.out.println("Entered character is not present");

        // vii) Palindrome check
        System.out.print("\nEnter a String: ");
        str1 = sc.nextLine();
        String rev = new StringBuilder(str1).reverse().toString();
        if (str1.equals(rev))
            System.out.println("Entered string is palindrome");
        else
            System.out.println("Entered string is not a palindrome");

        // viii) Count words, vowels, consonants
        System.out.print("\nEnter a String: ");
        str1 = sc.nextLine();

        int words = 0, vowels = 0, consonants = 0;
        boolean inWord = false;

        for (int i = 0; i < str1.length(); i++) {
            char c = Character.toLowerCase(str1.charAt(i));

            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1)
                    vowels++;
                else
                    consonants++;
            }

            if (!Character.isWhitespace(str1.charAt(i)) && !inWord) {
                words++;
                inWord = true;
            } else if (Character.isWhitespace(str1.charAt(i))) {
                inWord = false;
            }
        }

        System.out.println("No. of words: " + words);
        System.out.println("No. of vowels: " + vowels);
        System.out.println("No. of consonants: " + consonants);

        sc.close();
    }
}
