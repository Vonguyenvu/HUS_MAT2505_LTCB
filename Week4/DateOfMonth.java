package Week4;

public class DateOfMonth {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int year = Integer.parseInt(args[1]);
        if (month < 1 || month > 12 || year < 0) {
            System.out.println("Incorrect!");
        } else {
            System.out.println(SoNgay(month, year));
        }
    }

    public static int SoNgay(int thang, int nam) {
        if ((nam % 4 == 0 && nam % 100 != 0) || nam % 400 == 0) {
            switch (thang) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                case 2:
                    return 29;
                default:
                    return 30;
            }
        } else {
            switch (thang) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;

                case 2:
                    return 28;
                default:
                    return 30;
            }
        }
    }
}