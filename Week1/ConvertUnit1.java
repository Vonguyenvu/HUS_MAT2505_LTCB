
// Viết chương trình đổi đơn vị từ m -> inches

// Chương trình cho phép nhập một số thực x qua đối dòng lệnh, sau đó coi x là chiều dài tính bằng mét, hãy in ra số đo y của chiều dài đó tính bằng inches.

// Lưu ý: 1 meter = 39.3700787 inches
// Kết quả được làm tròn đến 2 số phần thập phân, sử dụng công thức Math.round(a * 100.0) / 100.0 để làm tròn số a

public class ConvertUnit1 {
    public static void main(String[] args) {
        double x = Double.parseDouble(args [0]);
        double y = x*39.3700787;
    System.out.println(Math.round(y*100.0)/100.0);    
    }
}
