public class Employee extends Person {

    private String department;
    private String designation;

    public Employee() {

        department = "null";
        designation = "null";
    }

    public Employee(String name, int age, String address, String department, String designation) {

        super(name, age, address);
        this.department = department;
        this.designation = designation;

    }

    public String getDepartment() {

        return department;
    }

    public String getDesignation() {

        return designation;
    }

    public void setDepartment(String department) {

        this.department = department;
    }

    public void setDesignation(String designation) {

        this.designation = designation;
    }

}
