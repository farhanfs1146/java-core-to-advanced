package Core_Basics.OOP;

public class InheritanceLearning2 extends InheritanceLearning1{

    private Long empCardNo;

    public InheritanceLearning2(String empName, Long empId, Double empSalary, Long empHiringCount, Long empCardNo){
        super(empName, empId, empSalary);
        InheritanceLearning1.setEmpHiringCount(empHiringCount);
        this.empCardNo = empCardNo;
    }

    public InheritanceLearning2(String empName, Long empId, Double empSalary, Long empCardNo) {
        super(empName, empId, empSalary);
        this.empCardNo = empCardNo;
    }

    public Long getEmpCardNo() {
        return empCardNo;
    }

    public void setEmpCardNo(Long empCardNo) {
        this.empCardNo = empCardNo;
    }
}
