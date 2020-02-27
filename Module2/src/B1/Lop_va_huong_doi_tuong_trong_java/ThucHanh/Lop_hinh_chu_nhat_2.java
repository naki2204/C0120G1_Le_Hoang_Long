package B1.Lop_va_huong_doi_tuong_trong_java.ThucHanh;
import java.util.Scanner;


public class Lop_hinh_chu_nhat_2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the width");
        double width = scanner.nextDouble();
        System.out.println("Enter the height");
        double height =scanner.nextDouble();
        Rectangle rectangle =new Rectangle(width,height);
        System.out.println("Your rectangle:\n"+rectangle.display());
        System.out.println("Permeter your rectangle:\t"+rectangle.getPerimeter());
        System.out.println("Area your rectangle:\t"+rectangle.getArea());


    }
}
