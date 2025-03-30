import java.util.Scanner;

public class Problem_2 {
    public static double findAverage(int[] arr, int n) {
        if (n == 1) return arr[0];
        return (arr[n - 1] + (n - 1) * findAverage(arr, n - 1)) / (double) n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(findAverage(arr, n));
    }
}
