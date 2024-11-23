
import java.util.Scanner;

public class TrigonometryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextInt();
        while (x<=30 ){
            System.out.println(calculateSin(x));
        }
    }
    public static double calculateSin(double x) {
        double sum =x;
        double soHang = x;
        for (int i=1;i<=28;i+=2){
            soHang*=-Math.pow(x, 2)/((i+1)*(i+2));
            sum+=soHang;
        }
        return sum;
    }
}
