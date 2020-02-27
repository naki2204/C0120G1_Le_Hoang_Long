package B1.Mang_va_phuong_thuc_trong_java.BaiTap;

import java.util.Scanner;

public class tim_phan_tu_lon_nhat_trong_mang_hai_chieu {

    public static int max(int[][] array) {
        int max = 0;
        String index;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int[][] array;
        Scanner input = new Scanner(System.in);
        int cot;
        int dong;
        System.out.println("Số dòng mảng 2 chiều cần tạo");
        dong = input.nextInt();
        System.out.println("Số cột mảng 2 chiều cần tạo");
        cot = input.nextInt();
        array = new int[dong][cot];
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.println("Nhập giá trị dòng thứ " + (i + 1) + " cột thứ " + (j + 1));
                array[i][j] = input.nextInt();
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là: " + max(array));

    }


}
