import java.util.Scanner;

public class Problem_3 {
    public static boolean isPrime(int n, int i) {
        if (n < 2) return false;
        if (i * i > n) return true;
        if (n % i == 0) return false;
        return isPrime(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isPrime(n, 2) ? "Prime" : "Composite");
    }
}
