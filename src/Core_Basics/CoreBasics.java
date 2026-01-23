package Core_Basics;

public class CoreBasics {

    private Long empId;
    private String empName;
    private String empFatherName;

    public CoreBasics(Long empId, String empName, String empFatherName){

        this.empId = empId;
        this.empName = empName;
        this.empFatherName = empFatherName;
    }

    public Long setEmpId(Long empId){

        return this.empId = empId;
    }

    public String setEmpName(String empName){

        return this.empName = empName;
    }

    public String setEmpFatherName(String empFatherName){

        return this.empFatherName = empFatherName;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpFatherName() {
        return empFatherName;
    }

    public Long getEmpId(){

       return this.empId;
    }

}
