
import java.util.Scanner;

public class De2_bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap x");
        double x = sc.nextDouble();
        System.out.println("Nhap n");
        int n = sc.nextInt();
        System.out.println(loganepe(x,n));
        System.out.println(F(x, n));
    }

    public static double loganepe (double  x, int n){
        double sum =x;
        double sohang =x;
        for (int i =1;i<=n;i++){
            sohang*=-x*i/(i+1);
            sum+=sohang;
        }
        return sum;
    }

    public static double F(double x, int n){
        return 5*Math.pow(x, 3)*loganepe(x,n)-7*x*x+13;
    }
}
