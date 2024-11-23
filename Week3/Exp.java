package Week3;

public class Exp {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        int n = Integer.parseInt(args[1]);
        double sum = 1;
        double index = 1;
        int a = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            index = index * (x / i);
            sum += index;
        }
        System.out.println(Math.round(sum * 100.0) / 100.0);
    }
}
