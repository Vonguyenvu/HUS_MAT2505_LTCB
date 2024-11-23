import java.util.Scanner;

public class ColumnDeletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hang");
        int m = sc.nextInt();
        System.out.println("Nhap so cot");
        int n = sc.nextInt();
        System.out.println("Nhap cot can xoa");
        int index = sc.nextInt();
        int[][] matrix = new int[m][n];
        inputMatrix(matrix, sc);
        int[][] a = new int[matrix.length][matrix[0].length - 1];
        a = deleteColumn(matrix, index);
        print(a);
    }

    public static void inputMatrix(int[][] matrix, Scanner keyboard) {
        System.out.println("Nhap cac phan tu cua ma tran");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = keyboard.nextInt();
            }
        }
    }

    public static int[][] deleteColumn(int[][] matrix, int index) {
        int[][] a = new int[matrix.length][matrix[0].length - 1];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < index; j++) {
                a[i][j] = matrix[i][j];
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = index; j < matrix[0].length-1; j++) {
                a[i][j] = matrix[i][j + 1];
            }
        }
        return a;
    }

    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
