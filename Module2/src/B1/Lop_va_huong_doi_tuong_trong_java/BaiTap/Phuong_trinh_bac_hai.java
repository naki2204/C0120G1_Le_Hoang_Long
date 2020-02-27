package B1.Lop_va_huong_doi_tuong_trong_java.BaiTap;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Phuong_trinh_bac_hai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the coefficient a");
        double a =input.nextDouble();
        System.out.println("Enter the coefficient b");
        double b =input.nextDouble();
        System.out.println("Enter the coefficient c");
        double c =input.nextDouble();
        QuadraticEquation phuongTrinh1 = new QuadraticEquation(a,b,b);
        if (phuongTrinh1.getDiscriminant()==0){
            System.out.println("phương trình có 1 nghiệm duy nhất: "+phuongTrinh1.getRoot1());
        }
        if(phuongTrinh1.getDiscriminant()>0){
            System.out.println("phương trình có 2 nghiệm phân biệt:"+phuongTrinh1.getRoot1()+" và "+phuongTrinh1.getRoot2());
        }
        if(phuongTrinh1.getDiscriminant()<0){
            System.out.println("phương trình vô nghiệm.");
        }

    }

}
