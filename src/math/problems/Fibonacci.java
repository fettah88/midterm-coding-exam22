package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        int num=40;
        int a=0;
        int b=1;
        for(int i=1;i<=num;i++){
            int sum=a+b;
            System.out.println(a);
            a=b;
            b=sum;



        }

    }
}
