public class Main {
    public static void main(String[] args) {
        System.out.println(sumNaturalNumber(5)); // 15
    }

    public static int sumNaturalNumber(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumNaturalNumber(n - 1);
        }
    }
}
