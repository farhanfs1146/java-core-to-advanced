package Core_Basics.Implementations;

import Core_Basics.Interfaces.Employee;
import Core_Basics.Interfaces.User;

import java.util.Scanner;

// interfaces resolve the issue in Java like Multiple-Inheritance.
// instead of creating classes use implements multiple interfaces.
public class UserImplementation implements User, Employee {

    private static String userNameFixed = "Farhan Ali";;
    private static int counter;

    @Override
    public void displayUserName(){

        counter++;
        System.out.println("Latest username is : " + userNameFixed);
    }

    @Override
    public void getUserId(){

        counter++;
        System.out.println("My Id is : " + 1);
    }

    @Override
    public void setUserName() {

        String userName;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new username : ");
        userName = scanner.nextLine();

        if (userName.length() <= 6) {
            userNameFixed = userName;
            counter++;
            System.out.println("New username updated with : "
                    + userNameFixed + " with counter : " + counter);
        } else {
            System.out.println("Try with valid username (max 6 characters)");
        }
    }


    @Override
    public void employeeCardNumberAssigning() {
        
    }

    @Override
    public void getEmployeeCardNumber() {

    }
}
