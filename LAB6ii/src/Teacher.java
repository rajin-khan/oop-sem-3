public class Teacher {

    String name;
    long id;
    String subject;
    int experience;

    Teacher() {

        name = "NA";
        id = -1;
        subject = "NA";
        experience = -1;
    }

    Teacher(String name, long id, String subject, int experience) {

        this.name = name;
        this.id = id;
        this.subject = subject;
        this.experience = experience;
    }

    double salary(int experience) {

        double pay = 0;

        if (experience>=0 && experience<=3) {

            pay = 30000;
        }
        if (experience>=4 && experience<=6) {

            pay = 50000;
        }
        if (experience>=7 && experience<=8) {

            pay = 70000;
        }
        if (experience>8) {

            pay = 100000;
        }

        return pay;
    }
}
