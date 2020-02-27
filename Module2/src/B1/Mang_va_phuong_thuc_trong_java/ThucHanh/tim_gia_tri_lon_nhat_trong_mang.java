package B1.Mang_va_phuong_thuc_trong_java.ThucHanh;
import java.util.Scanner;

public class tim_gia_tri_lon_nhat_trong_mang {
    public static int[] array;

    public static void nhapArray() {
        Scanner input = new Scanner(System.in);
        int size;

        do {
            System.out.println("Nhập vào độ dài mảng bạn muốn tạo: ");
            size = input.nextInt();
            if (size>20)
                System.out.println("Độ dài mảng không được lớn hơn 20");

        }while (size>20);

        array = new int[size];

        for(int i = 0; i < size ; i++){
            System.out.print("Nhập vào phần tử thứ "+(i+1)+" của mảng: ");
            array[i]= input.nextInt();
        }
    }
    public static void max(){
        int max=array[0];
        int i=1;
        String index="tai vi tri 1"+"\t";//ý kiến tham khảo từ quốc hoặc chạy thêm 1 vòng for

        for (i=1;i<array.length;i++){
            if(max<array[i]){
                max = array[i];
                index=(i+1)+"\t";
            } else if (array[i] == max) {
                index+=(i+1)+"\t";
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là: "+max);
        System.out.println(index);
    }

    public static void main(String[] args) {
        nhapArray();

        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.println();
        max();

    }


}
