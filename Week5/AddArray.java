import java.util.Scanner;

public class AddArray {
    public static void inputArray(int[] a, Scanner input) {
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }
    }

    public static int[] sum2array(int[] a, int[] b) {
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] + b[i];
        }
        return c;
    }

    public static void printArray(int[] a) {
        System.out.print("Tong 2 mang la ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen n");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        System.out.println("Nhap mang a");
        inputArray(a, sc);
        System.out.println("Nhap mang b");
        inputArray(b, sc);
        c = sum2array(a, b);
        printArray(c);
    }
}
