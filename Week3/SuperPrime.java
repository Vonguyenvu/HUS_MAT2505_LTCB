// Bài lập trình kiểm tra một số có là số siêu nguyên tố không
// kết quả in ra True nếu số là số siêu nguyên tố, False nếu số không là số siêu nguyên tố
package Week3;

import java.util.Scanner;

public class SuperPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen n");
        int n = sc.nextInt();
        while (n > 0) {
            if (isPrime(n)) {
                n = n / 10;
            }
            break;
        }
        if (isPrime(n)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

    public static boolean isPrime(int a) {
        if (a < 2) {
            return false;
        }
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
