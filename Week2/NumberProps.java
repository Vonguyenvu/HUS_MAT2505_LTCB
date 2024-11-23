public class NumberProps {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(isPrime(n));
    }

    public static boolean isPrime(int n) {
        while (n > 0) {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
