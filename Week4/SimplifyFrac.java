package Week4;

public class SimplifyFrac {

    // tử số là Nume, mẫu số là Denom, tính và in ra dạng tối giản của Nume/Denom
    public static void printSimplest(int Nume, int Denom) {
        int gcd = findGcd(Nume, Denom);
        if (Denom < 0) {
            System.out.println(-(Nume / gcd) + "/" + (Math.abs(Denom) / gcd));
        } else {
            System.out.println((Nume / gcd) + "/" + (Denom / gcd));
        }

    }

    public static int findGcd(int a, int b) {
        int gcd = 1;
        for (int i = Math.min(Math.abs(a), Math.abs(b)); i >= 1; i--) {
            if (Math.abs(a) % i == 0 && Math.abs(b) % i == 0) {
                gcd = i;
                break;
            }
        }
        return gcd;
    }

    public static void main(String args[]) {
        // edit method main here
        int Nume = Integer.parseInt(args[0]);
        int Denom = Integer.parseInt(args[1]);
        printSimplest(Nume, Denom);
    }
}