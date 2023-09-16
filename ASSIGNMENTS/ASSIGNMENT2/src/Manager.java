public class Manager extends Member {

    private String specialization;
    private String department;

    Manager(String name, int age, long phone, String address, double salary, String specialization, String department) {

        super(name, age, phone, address, salary);
        this.specialization = specialization;
        this.department = department;
    }
    
    public String getSpecialization() {
        
        return specialization;
    }

    public String getDepartment() {
        
        return department;
    }

    public void setSpecialization(String specialization) {
        
        this.specialization = specialization;
    }

    public void setDepartment(String department) {
        
        this.department = department;
    }

    public String printInfo() {

        return super.getName() + "'s age is: " + super.getAge() + 
                ", phone number is: " + super.getPhone() + 
                ", address is: " + super.getAddress() + 
                ", salary is: " + super.printSalary() + 
                ", specialization is: " + this.getSpecialization() + 
                ", and department is: " + this.getDepartment() + "\n";
    }

}