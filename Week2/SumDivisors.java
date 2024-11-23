public class SumDivisors {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        while (n > 0) {
            int sum = 0;
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            System.out.println(sum);
            break;
        }
    }
}
