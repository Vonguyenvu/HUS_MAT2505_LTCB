
import java.util.Scanner;

public class De1_bai1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap x");
        double x = sc.nextDouble();
        System.out.println("Nhap n");
        int n = sc.nextInt();
        System.out.println("Gia tri arctan: "+arctan(x, n));
        System.out.println("Gia tri f(x): "+F(x, n));
    }
    public static double arctan (double x, int n){
        double sum = x;
        double sohang =x;
        for (int i=1;i<=n;i++){
            sohang*=-x*x*(2*i-1)/(2*i+1);
            sum+=sohang;
        }
        return sum;
    }

    public static double F(double x, int n) {
        return x*x*x*arctan(x, n)-9*x*x+5;
    }
}