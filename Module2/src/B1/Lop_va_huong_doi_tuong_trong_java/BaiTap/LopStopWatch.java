package B1.Lop_va_huong_doi_tuong_trong_java.BaiTap;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class LopStopWatch {
    public static void main(String[] args) {
        Random rd =new Random();
        int[] array;
        array = new int[100000];
        for (int i= 0;i< array.length;i++){
            array[i] = rd.nextInt(1000000);
        }
        StopWatch time =new StopWatch();
        time.start();
        Arrays.sort(array);
        time.stop();
        System.out.println(time.getElapsedTime());

    }
}
