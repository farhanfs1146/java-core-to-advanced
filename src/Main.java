import Core_Basics.Implementations.UserImplementation;
import Core_Basics.OOP.CoreBasics;
import Core_Basics.OOP.InheritanceLearning2;
import Core_Basics.OOP.InheritanceLearning3;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        // calling to CoreBasics class and its features.
        CoreBasics coreBasicsObj = new CoreBasics(1L, "Muhammad Ali", "Farhan Ali");
        //playing with fields of this class.
        Long empId;
        empId = coreBasicsObj.getEmpId();
        System.out.println("Employee Id Now : " + empId);
        empId = coreBasicsObj.setEmpId(20L);
        System.out.println("Employee Id after update/set : " + empId);

        // inheritance concept now.
        InheritanceLearning2 inheritanceLearning2Obj = new InheritanceLearning2("Ali", 4L, 55000.0, 2L, 13411L);
        Double empSalary = inheritanceLearning2Obj.getEmpSalary();
        System.out.println("Emp salary now before increment : " + empSalary);

        inheritanceLearning2Obj.setEmpSalary(empSalary + (55000 * 10 / 100));
        Double empSalaryNow = inheritanceLearning2Obj.getEmpSalary();
        System.out.println("Emp salary now after increment : " + empSalaryNow + " of emp card no. " + inheritanceLearning2Obj.getEmpCardNo());

        // inheritance further concept.
        InheritanceLearning3 inheritanceLearning3Obj = new InheritanceLearning3("Farhan Ali", 5L, 550000.0, 2L, 13411L, true, "very good & excellent character");
        Double empSalary3 = inheritanceLearning3Obj.getEmpSalary();
        System.out.println("Emp salary3 now before increment : " + empSalary3);

        // Using Implemented class which is using Interfaces.
        UserImplementation userImplementationsObj = new UserImplementation();
        userImplementationsObj.displayUserName();
        userImplementationsObj.getUserId();
        String userName;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new username : ");
        userName = scanner.nextLine();
        userImplementationsObj.setUserName(userName);
        userImplementationsObj.displayUserName();


    }
}