import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen n");
        int n = sc.nextInt();
        int answer = 1;
        while (n > 0) {
            if (n % 2 == 0) {
                for (int i = 2; i <= n; i += 2) {
                    answer *= i;
                }
            } else {

                for (int i = 1; i <= n; i += 2) {
                    answer *= i;
                }
            }
            break;
        }
        System.out.println(answer);
    }
}
