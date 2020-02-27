package B1.Ngon_Ngu_Lap_Trinh_Java.ThucHanh;

import java.util.Scanner;

public class giai_phuong_trrinh_bac_nhat {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập vào hệ số a: ");
        float a=scanner.nextFloat();
        System.out.print("Nhập vào hệ số b:" );
        float b=scanner.nextFloat();
        if(a==0)
            System.out.println("Phương trình vô số nghiệm");
        else
            System.out.println("Phương trình có 1 nghiệm là "+(-b/a));


    }
}
