public class AverageEvens {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        while (n > 0) {
            int sum = 0;
            int count = 0;
            int avg;
            for (int i = 1; i < n; i += 2) {
                sum += i;
                count += 1;
            }
            avg = sum / count;
            System.out.println(avg);
            break;
        }
    }
}
