package Core_Basics.Interfaces;

public interface EmployeeInfo {

    // Interfaces provides ability to also define 'default' methods.
    // We can override default methods as well and use without override.
    default void userInfo(){

        System.out.println("I am default method of Employee Info Interface");
        System.out.println("Would you use me in future? Yes, of course.");
    }

    // if you don't define any method in Interfaces then you can't define the body of the methods.
    public void setEmployeeName();
    public void setEmployeeCardNo();
}
