package Week3;

import java.util.Scanner;

public class NPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen n");
        int n = sc.nextInt();
        int count =0;
        int a = Integer.MAX_VALUE;
        for(int i=2;i<a;i++){
            while(count<n){
                if(isPrime(i)){
                    System.out.print(i+" ");
                count++;
                }
                break;
            }
        }
    }

    public static boolean isPrime (int a){
        if (a<2){
            return false;
        }
        for (int i=2;i<=a/2;i++){
            if (a%i==0){
                return false;
            }
        }
        return true;
        }
    }
