package math.problems;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        num();

    }
    public static int num () {
        int a = 5;
        int b = 1;
        for (int i = 1; i <= 5; i++) {
            b *=  i;
            System.out.println(b);

        }
        return b;
    }
}
