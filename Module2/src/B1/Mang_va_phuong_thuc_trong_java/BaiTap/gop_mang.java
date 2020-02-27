package B1.Mang_va_phuong_thuc_trong_java.BaiTap;
import java.util.Random;
import java.util.Scanner;

public class gop_mang {
    public static void nhapArray(int[] array){
        Random rd = new Random();

        for(int i=0;i<array.length;i++){
            array[i]=rd.nextInt(11);
        }
    }
    public static void hienThiArray(int[] array){
        for (int i=0;i<array.length;i++){
            System.out.println("phần tử thứ "+(i+1)+": "+array[i]);
        }
    }

    public static void main(String[] args) {
        int[] array1;
        int[] array3;
        int[] array2;
        array1 =new int[7];
        array2 =new int[12];
        array3 =new int[19];
        nhapArray(array1);
        nhapArray(array2);
        System.out.println("List of array1: ");
        hienThiArray(array1);
        System.out.println();
        System.out.println("List of array2: ");
        hienThiArray(array2);
        for (int i=0;i<array1.length;i++){
            array3[i]=array1[i];
        }
        for (int i=0;i<array2.length;i++){
            array3[array1.length+i]=array2[i];
        }
        System.out.println();
        System.out.println("List of array3: ");
        hienThiArray(array3);


    }
}
