import Core_Basics.CoreBasics;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

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
    }
}