package B1.Ngon_Ngu_Lap_Trinh_Java.ThucHanh;

import java.util.Scanner;

public class tim_gia_tri_trong_mang<i, isExist> {
    public static void main(String[] args) {
        String[] students ={"Chritian","Michael","Camila","Sienna","Tanya","Connor","Zachariah","Mallory","Zoe","Emilly"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name's student: ");
        String input_name=scanner.nextLine();
        boolean isExist=false;
        for(int i=0; i<students.length; i++){
            if(students[i].equals(input_name)){
                System.out.println("Position of the students in the list"+input_name+"is: "+(i+1));
                isExist =true;
                break;
            }

        }

        if(!isExist)
            System.out.println("Not found"+input_name+" in the list");


    }

}
