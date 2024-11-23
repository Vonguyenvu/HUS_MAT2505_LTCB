package Week3;
//Viet chuong trinh kiem tra mot so nguyen duong n nhap tu ban phim co phai la so hoan hao hay khong

import java.util.Scanner;


public class PerfectNumber { 
    public static void main(String[] args) {
        System.out.println("Nhap so nguyen n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPerfect(n));
    }
    public static boolean isPerfect (int a){
    if (a>0){
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
