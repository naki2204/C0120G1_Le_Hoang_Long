package B1.Mang_va_phuong_thuc_trong_java.BaiTap;


import java.util.Random;
import java.util.Scanner;

import static B1.Mang_va_phuong_thuc_trong_java.ThucHanh.tim_gia_tri_lon_nhat_trong_mang.array;

public class xoa_phan_tu_tu_khoi_mang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rd =new Random();
        System.out.println("nhập vào độ dài mảng:");
        int dodai=input.nextInt();
        int[] array;
        array =new int[dodai];
        for(int i=0;i<array.length;i++){
            array[i]=rd.nextInt(5)+1;
        }
        System.out.println("list array:");
        for (int i=0;i<array.length;i++){
            System.out.println("phần tử thứ "+(i+1)+": "+array[i]);
        }

        System.out.println("Phần tử cần xóa: ");
        int element = input.nextInt();
        int count=0;
        for (int i=0;i<array.length;i++){
            if(array[i]==element){
                for(int j=i;j<array.length;j++){
                    if(j==array.length-1)
                        array[j-count]=0;
                    else
                        array[j]=array[j+1];

                }
            }
            count++;
        }

        System.out.println("list array:");
        for (int i=0;i<array.length;i++){
            System.out.println("phần tử thứ "+(i+1)+": "+array[i]);
        }





    }



}
