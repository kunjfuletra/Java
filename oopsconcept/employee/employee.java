package oopsconcept.employee;

public class employee {
    private String employeeName;
    private String designation;
    private String email;

    public employee(String employeeName, String designation, String email) {
        this.employeeName = employeeName;
        this.designation = designation;
        this.email = email;
    }

    
    public String getEmployeeName() {
        return employeeName;
    }

    
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

 
    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "name="+employeeName+" Designation="+ designation + " email="+email;
    }
}
