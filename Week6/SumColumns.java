
/** 
* Nhập ma trận matrixA cỡ rows x columns, sau đó in ra tổng các phần tử của các cột.
*/

import java.util.Scanner;

public class SumColumns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hang");
        int m = sc.nextInt();
        System.out.println("Nhap so cot");
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        inputMatrix(a, sc);
        int[] arr = new int[n];
        arr = sumColumns(a);
        printArray(arr);
    }

    public static void inputMatrix(int[][] matrix, Scanner keyboard) {
        System.out.println("Nhap cac phan tu cua ma tran");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = keyboard.nextInt();
            }
        }
    }

    public static int[] sumColumns(int[][] matrix) {
        int[] array = new int[matrix[0].length];
        for (int j = 0; j < matrix[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][j];
            }
            array[j] = sum;
        }
        return array;
    }

    public static void printArray(int[] array) {
        System.out.print("Mang: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}