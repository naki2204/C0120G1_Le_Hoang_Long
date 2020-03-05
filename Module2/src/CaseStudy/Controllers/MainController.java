package CaseStudy.Controllers;

import java.util.Scanner;

public class MainController {
    public void displayMainMenu(){
        Scanner input=new Scanner(System.in);
        System.out.println("Main Menu: " +
                "\n1.Add New Service." +
                "\n2.Show Service." +
                "\n3.Add New Customer." +
                "\n4.Show Information of Customer." +
                "\n5.Add New Booking." +
                "\n6.Show Information of Employee." +
                "\n7.Exit");

        int choose = input.nextInt();
        switch (choose){
            case 1:
                addNewService();
            case 2:
                showService();
            case 3:
                addNewCustomer();
            case 4:
                showInformationCustomer();
            case 5:
                addNewBooking();
            case 6:
                showInformationEmployee();
            case 7:
                break;
        }
    }
    public void addNewService(){
        System.out.println("Menu Service: " +
                "\n1.Add New Villa." +
                "\n2.Add New House" +
                "\n3.Add New Room" +
                "\n4.Back to Main Menu" +
                "\n5.Exit");

    }
    public void showService(){

    }
    public void addNewCustomer(){

    }
    public void showInformationCustomer(){

    }
    public void addNewBooking(){

    }
    public void showInformationEmployee(){

    }
}
