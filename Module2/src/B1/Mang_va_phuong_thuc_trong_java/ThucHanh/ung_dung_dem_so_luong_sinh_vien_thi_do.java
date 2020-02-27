package B1.Mang_va_phuong_thuc_trong_java.ThucHanh;
import java.util.Scanner;
import java.util.Random;

public class ung_dung_dem_so_luong_sinh_vien_thi_do {
    public static void nhapArray(){
        int[] array;
        Scanner input = new Scanner(System.in);
        Random rd = new Random();
        int count =0;
        int element;
        do {
            System.out.println("Nhập vào số lượng học sinh cần xét điểm: ");
            element = input.nextInt();
            if(element>30)
                System.out.println("Số lượng học sinh không vượt quá 30");
        }while (element > 30);
        array =new int[element];

        for (int i = 0;i<element;i++){
            array[i]=rd.nextInt(11);
        }

        System.out.print("List of array: ");
        for (int j = 0;j< array.length; j++){
            System.out.println(array[j] + "\t");
            if(array[j]>=5)
                count++;
        }
        System.out.println("Số lượng học sinh đậu là: "+ count);

    }

    public static void main(String[] args) {
        nhapArray();

    }


}
