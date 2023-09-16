public class Member {

    private String name;
    private int age;
    private long phone;
    private String address;
    private double salary;

    Member() {

        name = null;
        age = 0;
        phone = 0;
        phone = 0;
        address = null;
        salary = 0;
    }

    Member(String name, int age, long phone, String address, double salary) {

        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.salary = salary;
    }

    public String getName() {

        return name;
    }

    public int getAge() {

        return age;
    }

    public long getPhone() {

        return phone;
    }

    public String getAddress() {

        return address;
    }

    public double getSalary() {

        return salary;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public void setPhone(long phone) {

        this.phone = phone;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public void setSalary(double salary) {

        this.salary = salary;
    }

    public String printSalary() {

        return "$" + this.salary;
    }
    
}
