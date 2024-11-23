import java.util.Scanner;

public class Countvalues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập mảng A
        System.out.print("Nhap so nguyen duong n: ");
        int n = scanner.nextInt();

        int[] A = new int[n];
        System.out.println("Nhap cac phan tu cua mang");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        // Tìm và đếm tần số
        int[] values = new int[n];
        int[] counts = new int[n];
        int uniqueCount = countFrequency(A, values, counts);

        // In kết quả
        System.out.println("Cap gia tri - so lan xuat hien:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(values[i] + ":" + counts[i] + " ");
        }

    }

    // Phương thức đếm tần số
    public static int countFrequency(int[] A, int[] values, int[] counts) {
        int uniqueCount = 0;

        for (int num : A) {
            boolean found = false;

            // Kiểm tra nếu giá trị đã xuất hiện
            for (int j = 0; j < uniqueCount; j++) {
                if (values[j] == num) {
                    counts[j]++;
                    found = true;
                    break;
                }
            }

            // Nếu chưa xuất hiện, thêm vào mảng values
            if (!found) {
                values[uniqueCount] = num;
                counts[uniqueCount] = 1;
                uniqueCount++;
            }
        }
        return uniqueCount;
    }
}
