public class A2T2 {

    public static void main(String[] args) {
        
        Employee e1 = new Employee("Karen", 21, 1987654, "Westalis", 4565, "Cleanup", "Livestock");

        Manager m1 = new Manager("Kyle", 27, 0123456, "Konoha", 64209, "HR", "Information Technology");

        System.out.println();
        
        System.out.println(e1.printInfo());
        System.out.println(m1.printInfo());
        
    }
    
}
