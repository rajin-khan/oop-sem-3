public class Student {

    String name;
    long id;
    int age;
    double marks;

    Student() {

        name = "NA";
        id = -1;
        age = -1;
        marks = -1;
    }

    Student (String name, long id, int age, double marks) {

        this.name = name;
        this.id = id;
        this.age = age;
        this.marks = marks;
    }

    char grading(double marks) {

        char grade = 'U';

        if (marks>80) {

            grade = 'A';
        }
        else if (marks>70 && marks<80) {

            grade = 'B';
        }
        else if (marks>60 && marks<70) {

            grade = 'C';
        }
        else if (marks<60) {

            grade = 'F';
        }

        return grade;
    }

}