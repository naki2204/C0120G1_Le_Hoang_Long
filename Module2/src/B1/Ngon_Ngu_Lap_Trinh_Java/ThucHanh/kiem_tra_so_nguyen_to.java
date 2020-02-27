package B1.Ngon_Ngu_Lap_Trinh_Java.ThucHanh;
import java.util.Scanner;

public class kiem_tra_so_nguyen_to {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        if(number<2)
            System.out.println(+number+" không phải là số nguyên tố.");
        if(number==2)
            System.out.println(+number+" là số nguyên tố.");
        if(number>2){
            int i=2;
            int count=0;
            for(i=2;i<number;i++){
                if (number % i == 0) {
                    count++;
                }

            }
            if (count < 2) {
                System.out.println("snt");
            } else {
                System.out.println("kpsnt");
            }

        }


    }
};

