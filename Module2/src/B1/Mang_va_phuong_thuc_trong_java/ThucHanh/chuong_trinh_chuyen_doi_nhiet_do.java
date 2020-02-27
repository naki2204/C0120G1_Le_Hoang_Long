package B1.Mang_va_phuong_thuc_trong_java.ThucHanh;
import java.util.Scanner;

public class chuong_trinh_chuyen_doi_nhiet_do {
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit=(9.0/5)*celsius+32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5/9.0)*(fahrenheit-32);
        return celsius;
    }
    public static void displaymainmenu (){
        double fahrenheit;
        double celsius;
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1.Fahrenheit to Celsius");
            System.out.println("2.Celsius to Fahrenheit");
            System.out.println("3.Exit");
            Scanner input = new Scanner(System.in);

            choice=input.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter the Fahrenheit");
                    fahrenheit = input.nextDouble();
                    System.out.println("The Celsius: "+ fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter the Celsius ");
                    celsius = input.nextDouble();
                    System.out.println("The Fahrenheit: "+celsiusToFahrenheit(celsius));
                    break;
                case 3:
                    System.exit(3);
            }
        }while (choice != 3);
    }

    public static void main(String[] args) {
        displaymainmenu();

    }
}
