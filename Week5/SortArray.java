import java.util.Scanner;

public class SortArray {

    public static void inputArray(int[] a, Scanner input) {
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }
    }

    public static int[] sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen n");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Nhap mang a");
        inputArray(a, sc);
        a = sort(a);
        printArray(a);
    }
}