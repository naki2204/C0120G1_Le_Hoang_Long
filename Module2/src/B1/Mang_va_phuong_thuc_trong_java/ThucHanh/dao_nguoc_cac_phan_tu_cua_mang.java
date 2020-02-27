package B1.Mang_va_phuong_thuc_trong_java.ThucHanh;

import java.util.Scanner;

import static B1.Mang_va_phuong_thuc_trong_java.ThucHanh.tim_gia_tri_lon_nhat_trong_mang.array;
import static B1.Mang_va_phuong_thuc_trong_java.ThucHanh.tim_gia_tri_lon_nhat_trong_mang.nhapArray;

public class dao_nguoc_cac_phan_tu_cua_mang {

    public static void daoNguoc(){
        int i;
        int j=array.length-1;
        for(i=0;i<=j;i++){
            int x;
            x= array[i] ;
            array[i] = array[j];
            array[j] = x;
            j--;
        }
    }

    public static void main(String[] args) {
        nhapArray();
        daoNguoc();
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }


}
