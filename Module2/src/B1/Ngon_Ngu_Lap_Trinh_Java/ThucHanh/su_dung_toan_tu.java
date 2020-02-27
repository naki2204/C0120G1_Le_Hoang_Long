package B1.Ngon_Ngu_Lap_Trinh_Java.ThucHanh;
import java.util.Scanner;

public class su_dung_toan_tu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float width;
        float height;
        System.out.println("Cho biết chiều rộng hình chữ nhật:");
        width= scanner.nextFloat();
        System.out.println("Cho biết chiều cao hình chữ nhật:");
        height= scanner.nextFloat();
        System.out.print("Diện tích hình chữ nhật là: "+(width*height));
    }
}
