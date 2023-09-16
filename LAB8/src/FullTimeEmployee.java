public class FullTimeEmployee extends Employee {

    private double basic;
    private double allowance;

    public FullTimeEmployee() {

        basic = 0;
        allowance = 0;
    }

    public FullTimeEmployee(String name, int age, String address, String department, String designation, double basic, double allowance) {

        super(name, age, address, department, designation);
        this.basic = basic;
        this.allowance = allowance;
    }

    public double getBasic() {

        return basic;
    }

    public double getAllowance() {

        return allowance;
    }

    public void setBasic(double basic) {

        this.basic = basic;
    }

    public void setAllowance(double allowance) {

        this.allowance = allowance;
    }

    public double salary() {

        return (getBasic()) + ((getAllowance()/100) * getBasic());
    }

    public String toString() {

        return super.toString() + ", Basic: " + this.basic + ", Rate: " + this.allowance + "%" + ", Salary: " + salary();
    }
}
