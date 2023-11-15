import static java.lang.Float.NaN;

interface Average {
        abstract float average();
}

interface scholarship {
    abstract float rate();
}

class person {
    String p_name;

    person() {

    }

    person(String name) {
        p_name = name;
    }
}

class student extends person implements Average, scholarship {
    int no_grades;
    employee parent1;
    employee parent2;
    int[] grade = new int[6];

    student() {

    }

    student(String name, int n, employee r1, employee r2) {
        super(name);
        no_grades = n;
        parent1 = r1;
        parent2 = r2;

        for(int i=0; i < no_grades; i++) {
            grade[i] = (int) (Math.random() * (10 - 5 + 1)) + 5;
        }
    }

    public float rate() {
        return average() * 6 + (60000 - (parent1.average() + parent2.average())) *  4;
    };

    public float average() {
        float avg = 0;
        for(int i=0; i < no_grades; i++) {
            avg += grade[i];
        }
        avg /= no_grades;
        return avg;
    };
}

class employee extends person implements Average {
    int no_salaries;
    int[] salary = new int[12];

    employee(String name, int n) {
        super(name);
        no_salaries = n;

        for(int i=0; i < no_salaries; i++) {
            salary[i] = (int) (Math.random() * (30000 + 1));
        }

    }

     public float average() {
        float avg = 0;
        for(int i=0; i < no_salaries; i++) {
            avg += salary[i];
        }
        avg /= no_salaries;
        if(Float.isNaN(avg)) {
            return 0;
        }
        return avg;
    }

}

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        employee[] employees = new employee[6];
        employees[0] = new employee("Marijan", 10);
        employees[1] = new employee("Elena", 0);
        employees[2] = new employee("Petar", 10);
        employees[3] = new employee("Sonja", 10);
        employees[4] = new employee("Dragan", 10);
        employees[5] = new employee("Nadezhda", 0);

        student[] students = new student[3];
        students[0] = new student("Student_0", 6, employees[0], employees[1]);
        students[1] = new student("Student_1", 2, employees[2], employees[3]);
        students[2] = new student("Student_2", 5, employees[4], employees[5]);

        for (student student : students) {
            System.out.println("Student: " + student.p_name);
            System.out.println("Average: " + student.average());
            System.out.println("Parent 1: " + student.parent1.p_name + " - Average: " + student.parent1.average());
            System.out.println("Parent 2: " + student.parent2.p_name + " - Average: " + student.parent2.average());
            System.out.println("=========");
        }

        float maxi = 0;
        student top_student = new student();
        for (student student : students) {
            if(student.rate() > maxi) {
                maxi = student.rate();
                top_student = student;
            }
            System.out.println(student.p_name + " scholarship rate: " + student.rate());
        }

        System.out.println("Student " + top_student.p_name + " will get scholarship!");

    }
}
