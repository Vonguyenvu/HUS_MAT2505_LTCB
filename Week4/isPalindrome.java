import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen n");
        int n = sc.nextInt();
        System.out.println(checkNumber(n));
    }

    public static boolean checkNumber(int n) {
        int m = n;
        int temp = 0;
        int sum = 0;
        while (n > 0) {
            temp = n % 10;
            sum = sum * 10 + temp;
            n = n / 10;
        }
        if (m == sum) {
            return true;
        }
        return false;
    }
}