import java.util.Scanner;

public class Main {
    public static int factorial(int n) {
        if (n == 0) { 
            return 1;
        } else { 
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = scanner.nextInt();

        int result = factorial(a);
        System.out.println(result);
    }

    
}
