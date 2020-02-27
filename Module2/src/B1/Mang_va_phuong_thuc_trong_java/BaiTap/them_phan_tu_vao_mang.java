package B1.Mang_va_phuong_thuc_trong_java.BaiTap;
import java.util.Scanner;
import static B1.Mang_va_phuong_thuc_trong_java.ThucHanh.tim_gia_tri_lon_nhat_trong_mang.array;
import static B1.Mang_va_phuong_thuc_trong_java.ThucHanh.tim_gia_tri_lon_nhat_trong_mang.nhapArray;

public class them_phan_tu_vao_mang {
    public static void addElementToArray(){
        Scanner input = new Scanner(System.in);
        int element;
        int index;
        System.out.println("Phần tử cần chèn: ");
        element = input.nextInt();
        System.out.println("Vị trí cần chèn");
        index=input.nextInt()-1;
        for(int i=array.length-1;i>index-1;i--){
            if(i==index){
                array[i]=element;
            }else {
                array[i] = array[i-1];
            }

        }

    }


    public static void main(String[] args) {
        nhapArray();
        addElementToArray();
        System.out.println("Property list: ");
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }


    }


}
