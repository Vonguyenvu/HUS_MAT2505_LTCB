
import java.util.Scanner;



/**
 * Program to calculate approximately value of sinx
 */
public class TrigonometryCalculator {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        System.out.println(calculateSin(x));
    }
    
    public static double calculateSin(double x) {
            double sin = x;
            double sohang = x;
            int n =1;
            while (Math.abs(sin-Math.sin(x))>=0.0001){
              sohang*= -Math.pow(x,2)/(2*n*(2*n+1));
              sin += sohang;
              n++;
            }
            return sin;
        }
}    