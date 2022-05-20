package string.problems;
import java.util.Locale;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        String word;
        Scanner sc = new Scanner(System.in);


        System.out.println("enter a string");
        word = sc.next();
        if (isPalindrome(word)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " " + "is not  a Palindrome");

        }
        sc.close();

    }
    public static boolean isPalindrome(String string) {
        String reverse = "";
        for (int i = 0; i < string.length(); i++) {
            reverse = string.charAt(i) + reverse.toLowerCase();
        }
        if (string.toLowerCase().equals(reverse)) {
            return true;
        } else
            return false;
    }


}

