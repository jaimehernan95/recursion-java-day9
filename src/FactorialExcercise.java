import java.util.Scanner;

public class FactorialExcercise {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println(" Enter a number to calculate the factorial : ");
            int n = in.nextInt();
            in.close();

            System.out.println("The factorial of " + n + " is = " + factorial(n));
        }

        private static int factorial(int n) {
            if (n == 1) return 1;
            return factorial(n - 1) * n;
        }
    }