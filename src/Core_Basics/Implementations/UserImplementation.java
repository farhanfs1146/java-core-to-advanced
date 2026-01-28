package Core_Basics.Implementations;

import Core_Basics.Interfaces.Employee;
import Core_Basics.Interfaces.EmployeeInfo;
import Core_Basics.Interfaces.User;

import java.util.Scanner;

// interfaces resolve the issue in Java like Multiple-Inheritance.
// instead of creating classes use implements multiple interfaces.
public class UserImplementation implements User, Employee, EmployeeInfo {

    private static String userNameFixed = "Farhan Ali";;
    private static int counter = 0;

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
    public void setUserName(String userName) {

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

    @Override
    public void setEmployeeName() {

    }

    @Override
    public void setEmployeeCardNo() {

    }
}
