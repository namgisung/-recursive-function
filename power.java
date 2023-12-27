import java.util.Scanner;

public class Main {
    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }else {
            return base * power(base, exponent - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two numbers (separated by a space): ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result = power(a,b);
        System.out.println(result);

    }
    
}
