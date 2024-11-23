// Viết chương trình nhập vào 2 số nguyên rows, columns  từ bàn phím.

// - Nhập ma trận số nguyên matrixA kích thước rows x columns từ bàn phím.

// - Nhập ma trận số nguyên matrixB kích thước columns x rows từ bàn phím.

// - Tính ma trận matrixC = matrixA x matrixB, in ma trận matrixC ra màn hình.
import java.util.Scanner;

public class TimesMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap rows");
        int rows = sc.nextInt();
        System.out.println("Nhap columns");
        int columns = sc.nextInt();
        int[][]a = new int[rows][columns];
        int[][]b = new int[columns][rows];
        System.out.println("Nhap phan tu cua ma tran a");
        a = inputMatrix(a, sc);
        System.out.println("Nhap phan tu cua ma tran b");
        b = inputMatrix(b, sc);
        int [][]c = new int [rows][rows];
        c = axb(a, b);
        printMatrix(c);
    }

    public static int [][]inputMatrix(int [][]matrix,Scanner input){
        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0 ; j<matrix[0].length; j++) {
                matrix[i][j] = input.nextInt();
            }   
        }
        return matrix;
    }

    public static void printMatrix(int [][]matrix){
        System.out.println("Ma tran ket qua la:");
        for (int i = 0; i < matrix.length; i++) {
            for(int j=0; j<matrix[0].length;j++) {
                System.out.print(matrix[i][j]+" ");
    
            }   
            System.out.println();
        }
    }

    public static int [][] axb (int [][]a, int[][]b){
        int [][]c = new int [a.length][a.length];
        for (int i=0;i<a.length;i++){
            for (int j=0;j<b[0].length;j++){
                for (int k=0;k<a[0].length;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        return c;
    }
}
