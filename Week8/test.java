import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        input(a, sc);
        uniqueNumber(a);
        System.out.println();
        System.out.println(checkPerfect(a) + " ");
    }

    public static void input(int[] arr, Scanner keyboard) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = keyboard.nextInt();
        }
    }

    public static void uniqueNumber(int[] a) {
        boolean check = false;
        for (int i = 0; i < a.length; i++) {
            int count = 1;
            for (int j = 0; j < a.length; j++) {
                if (i != j && a[i] == a[j]) {
                    count++;
                }
            }
            if (count == 1) {
                check = true;
                System.out.print(a[i] + " ");
            }
        }
        if (check == false) {
            System.out.println("NONE");
        }
    }

    // public static int left (int k,int []arr){
    // int leftSum =0;
    // for (int i=0;i<k;i++){
    // leftSum+=arr[i];
    // }
    // return leftSum;
    // }

    // public static int right (int k,int []arr){
    // int rightSum =0;
    // for (int i=k+1;i<arr.length;i++){
    // rightSum+=arr[i];
    // }
    // return rightSum;
    // }

    public static int checkPerfect(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {

            int leftSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }

            int rightSum = 0;
            for (int k = i + 1; k < arr.length; k++) {
                rightSum += arr[k];
            }
            // int leftSum = left(i,arr);
            // int rightSum= right(i,arr);
            if (leftSum == rightSum && leftSum == arr[i]) {
                return arr[i];
            }
        }
        return -1;
    }
}
