package string.problems;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

            String string1;
            String string2;
            Scanner sc = new Scanner(System.in);


            System.out.println(" Please enter the first string ");
            string1 = sc.next();
            System.out.println(" Please enter the second string ");
            string2 = sc.next();

            if (isAnagram(string1, string2)) {
                System.out.println(string1 + " and " + string2 + " are Anagram");
            } else
                System.out.println(string1 + " and " + string2 + " are  not Anagram");

            sc.close();


        }
        public static boolean isAnagram (String string1, String string2){

            if (string1.length() != string2.length()) {
                return false;
            }

            char[] array1 = (string1.toCharArray());
            char[] array2 = string2.toCharArray();
            Arrays.sort(array1);
            Arrays.sort(array2);
            return Arrays.equals(array1, array2);

        }
    }