import java.util.Scanner;

public class Fibonacci {

    static int[] dp = new int[100];

    static int dp_fib(int n) {
        if (dp[n] != 0) {
            return dp[n];
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            dp[n] = dp_fib(n - 1) + dp_fib(n - 2);
            return dp[n];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = scanner.nextInt();

        System.out.println(dp_fib(a));
    }
}
