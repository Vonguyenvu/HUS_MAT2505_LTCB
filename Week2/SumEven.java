// Chương trình tính tổng các số chẵn nhỏ hơn n, với n được nhập từ đối dòng lệnh

import java.util.Scanner;

public class SumEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
            System.out.println(sum);
            break;
        }
    }
}
