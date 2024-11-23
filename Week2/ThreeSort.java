// Sắp xếp. Viết chương trình ThreeSort.java nhận 3 giá trị nguên từ dòng lệnh và 
// in ra màn hình 3 giá trị theo thứ tự tăng dần. Sử dụng hàm Math.min() và Math.max().

//Viết chương trình theo mô tả.
//Đầu vào là 3 số nguyên nhận từ đối dòng lệnh, 
//kết quả là 3 số theo thứ tự tăng dần in trên 1 dòng. (dùng phương thức println in kết quả)
public class ThreeSort {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int min = Math.min(Math.min(a, b), c);
        int max = Math.max(Math.max(a, b), c);
        int mid = a + b + c - min - max;
        System.out.println(min + " " + mid + " " + max);
    }
}
