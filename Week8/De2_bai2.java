// Hoàn thiện các phương thức trong file De2_bai2.java theo các yêu cầu sau:

// 1.    Phương thức public static int[] readArray(Scanner reader) thực hiện đọc vào số nguyên dương n và trả lại mảng n số nguyên nhập từ bàn phím.

// 2.    Phương thức public static void PrintArray(int[] arr) thực hiện việc in mảng số nguyên arr ra màn hình, các phần tử cách nhau bởi đúng 01 khoảng trống, xuống dòng sau khi in xong.

// 3.    Phương thức public static boolean isIncreasing(int[] arr) thực hiện kiểm tra một dãy số arr có tăng ngặt hay không, nếu đúng trả lại giá trị true, ngược lại trả lại giá trị false.

// 4.    Phương thức public static int maxValue(int[] arr)  trả về giá trị lớn nhất trong các phần tử mảng arr.

// Ví dụ mảng a = {12 32 41 55 17 8 9}, kết quả trả về là 55

//                    b = {21 63 80 10}, kết quả trả về là 80

// 5.    Phương thức public static void listPrime(int[] arr) thực hiện liệt kê chỉ số các phần tử là số nguyên tố có trong mảng trên cùng một dòng, nếu nhiều hơn một chỉ số thì các chỉ số cách nhau đúng 01 khoảng trống, in xong xuống dòng.

// Ví dụ mảng a = {11 12 13 4 15 29}, kết quả in ra là 0 2 5

import java.util.Scanner;
public class De2_bai2 {

    public static int[] readArray(Scanner reader){
        int n = reader.nextInt();
        int []arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]= reader.nextInt();
        }
        return arr;
    }

    public static void PrintArray(int[] arr){
        for (int x:arr){
            System.out.print(x+" ");
        }
        System.err.println();
    }

    public static boolean isIncreasing(int[] arr){
        for (int i =0;i<arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static int maxValue(int[] arr){
        int max = arr[0];
        for (int x : arr){
            if (max<x ){
                max =x;
            }
        }
        return max;
    }

    public static boolean isPrime (int a){
        if(a<2){
            return false;
        }
        for (int i=2;i<=a/2;i++){
            if (a%i==0){
                return false;
            }
        }
        return true;
    }

    public static void listPrime(int[] arr){
        for (int x: arr){
            if (isPrime(x)){
                System.out.print(x+" ");
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = readArray(sc);
        PrintArray(arr);
        System.out.println(isIncreasing(arr));
        System.out.println(maxValue(arr));
        listPrime(arr);
    }
}

