package Week3;
import java.util.Scanner;

public class NPerfects {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap so nguyen n");
        int n = sc.nextInt();
        for (int i=1;i<n;i++){
            if (isPerfect(i)){
                System.out.println("Cac so hoan hao nho hon "+n+" la "+i+" ");
            }
        }
    }

    public static boolean isPerfect (int a){
        if (a>1){
            int sum =0;
            for (int i=1;i<=a/2;i++){
                sum+=i;
                }
            if(sum ==a){
                return true;
            }   
        }
        return false;
    }
}
