import java.util.Scanner;

public class GroupArray {
    public static void inputArray(int[] a, Scanner input) {
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }
    }

    public static void soLe(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.print(a[i] + " ");
            }
        }
    }

    public static void soChan(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Nhap mang a");
        inputArray(a, sc);
        soLe(a);
        soChan(a);
    }
}
