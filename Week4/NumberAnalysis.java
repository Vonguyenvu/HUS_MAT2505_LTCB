import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen duong n");
        int n = sc.nextInt();
        int a = n;
        while (n > 1) {
            for (int i = 2; i <= a / 2; i++) {
                while (n % i == 0) {
                    System.out.print(i + " ");
                    n /= i;
                }
            }
        }
    }
}