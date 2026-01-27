package Core_Basics.OOP;

public class InheritanceLearning1 {

    private String empName;
    private Long empId;
    private Double empSalary;
    public static Long empHiringCount;

    public InheritanceLearning1(String empName, Long empId, Double empSalary) {
        this.empName = empName;
        this.empId = empId;
        this.empSalary = empSalary;
    }


    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public Double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(Double empSalary) {
        this.empSalary = empSalary;
    }

    public static Long getEmpHiringCount() {
        return empHiringCount;
    }

    public static void setEmpHiringCount(Long empHiringCount) {
        InheritanceLearning1.empHiringCount = empHiringCount;
    }
}
