import java.util.Scanner;

public class Problem_8 {
    public static boolean isAllDigits(String s, int index) {
        if (index == s.length()) return true;
        if (!Character.isDigit(s.charAt(index))) return false;
        return isAllDigits(s, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(isAllDigits(s, 0) ? "Yes" : "No");
    }
}
