
import java.util.Scanner;

// Hoàn thiện các phương thức trong file De1_bai2.java theo các yêu cầu sau:
// 1. Phương thức public static int[] readArray(Scanner reader) thực hiện đọc vào số nguyên dương n và trả lại mảng n số nguyên nhập từ bàn phím.
// 2. Phương thức public static void PrintArray(int[] arr) thực hiện việc in mảng số nguyên arr ra màn hình, các phần tử cách nhau bởi đúng 01 khoảng trống, xuống dòng sau khi in xong.
// 3. Phương thức public static boolean isEvenArithmetic(int[] arr) thực hiện kiểm tra một dãy số nguyên có lập thành cấp số cộng với công sai chẵn hay không, nếu đúng trả lại giá trị true, ngược lại trả lại giá trị false.
// 4. Phương thức public static int secondMax(int[] arr) trả về giá trị lớn thứ hai trong các phần tử mảng arr.
// Ví dụ mảng a = {12 32 41 55 17 8 9}, kết quả trả về là 41
// b = {21 63 80 10}, kết quả trả về là 63
// 5. Phương thức public static void list2ndMax(int[] arr) thực hiện liệt kê chỉ số các phần tử có giá trị bằng số lớn thứ hai trong mảng trên cùng một dòng, nếu nhiều hơn một chỉ số thì các chỉ số cách nhau đúng 01 khoảng trống, in xong xuống dòng.
// Ví dụ mảng a = {14 12 13 14 15 14}, kết quả in ra là 0 3 5
public class De1_bai2 {

    public static int[] readArray(Scanner reader){
        int n = reader.nextInt();
        int []arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]= reader.nextInt();
        }
        return arr;
    }

    public static void PrintArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static boolean isEvenArithmetic(int[] arr){
        int d = arr[1]-arr[0];
        for (int i=1;i<arr.length-1;i++){
            if(d%2!=0 || d!=(arr[i+1]-arr[i])){
                return false;
            }
        }
        return true;
    }

    public static int secondMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int x : arr){
            if(x>max){
                second = max;
                max = x;
            }
            else if (x<max && x>second) {
                second = x;
            }
        }
        return second;
    }

    public static void list2ndMax(int[] arr){
        int num = secondMax(arr);
        for (int i=0;i<arr.length;i++){
            if (arr[i]==num){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr =readArray(sc);
        System.out.println();
        System.out.println(isEvenArithmetic(arr));
        System.out.println(secondMax(arr));
        PrintArray(arr);
        System.out.println();
        list2ndMax(arr);

    }
}
