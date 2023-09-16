public class L62T1 {


    public static void main(String[] args) {
        
        //assigned student (1, i)
        Student s1 = new Student();

        s1.name = "Anya";
        s1.id = 4260;
        s1.age = 7;
        s1.marks = 73;

        char result = s1.grading(s1.marks);

        System.out.println();

        System.out.println(s1.name+"'s grade is: "+result);

        System.out.println();

        //parametarized student (1, ii)
        Student s2 = new Student("Loid", 7294, 31, 97);

        result = s2.grading(s2.marks);

        System.out.println();

        System.out.println(s2.name+"'s grade is: "+result);

        System.out.println();

        //assigned teacher (2, i)
        Teacher t1 = new Teacher();

        t1.name = "Yor";
        t1.id = 5985;
        t1.subject = "Martial Arts";
        t1.experience = 6;

        double payment = t1.salary(t1.experience);

        System.out.println();

        System.out.println(t1.name+"'s salary is: "+payment);

        System.out.println();

        //parametarized teacher (2, ii)
        Teacher t2 = new Teacher("Bond", 3582, "Mathematics", 8);

        payment = t2.salary(t2.experience);

        System.out.println();

        System.out.println(t2.name+"'s salary is: "+payment);

        System.out.println();
    }
}