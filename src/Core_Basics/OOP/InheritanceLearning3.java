package Core_Basics.OOP;

public class InheritanceLearning3 extends InheritanceLearning2{

    protected Boolean activeStatus;
    protected String characterRemarks;

    public InheritanceLearning3(String empName, Long empId, Double empSalary, Long empHiringCount, Long empCardNo) {
        super(empName, empId, empSalary, empHiringCount, empCardNo);
    }

    public InheritanceLearning3(String empName, Long empId, Double empSalary, Long empHiringCount, Long empCardNo, Boolean activeStatus, String characterRemarks) {
        super(empName, empId, empSalary, empHiringCount, empCardNo);
        this.activeStatus = activeStatus;
        this.characterRemarks = characterRemarks;
    }

    public Boolean getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(Boolean activeStatus) {
        this.activeStatus = activeStatus;
    }

    public String getCharacterRemarks() {
        return characterRemarks;
    }

    public void setCharacterRemarks(String characterRemarks) {
        this.characterRemarks = characterRemarks;
    }
}
