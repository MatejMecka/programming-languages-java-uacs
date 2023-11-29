import java.io.*;
import java.io.Serializable;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class Student implements Serializable {
    String name;
    String phoneNum;
    int indexNum;
    transient int recordNum;
    public Student(){

    }

    public Student(String name_inp, String phoneNum_inp, int indexNum_inp, int recordNum_inp) {
        name = name_inp;
        phoneNum = phoneNum_inp;
        indexNum = indexNum_inp;
        recordNum = recordNum_inp;

    }
}

class StudentFileStream {
    public void printData(Student student) {
        System.out.println("Student Name: " + student.name);
        System.out.println("Student Phone Number: " + student.phoneNum);
        System.out.println("Student Index Num: " + student.indexNum);
        System.out.println("Student Record Num: " + student.recordNum);
    }

    public void writeToFile(Student student, String fileName) {
        try {
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(student);

            out.close();
            file.close();

            System.out.println("Object has been serialized\nData before Deserialization.");
            printData(student);

        } catch (IOException ex) {
            System.out.println("IOException!");
        }
    }

    public Student readFromFile(String fileName) {
        Student student = new Student();
        try {
            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(file);

            student = (Student) in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized\nData after Deserialization.");
            printData(student);

        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("IOException!");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException!");
        }
        return student;
    }
}

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Student student = new Student("Petko","+38975432123",5555,1234);
        StudentFileStream fileStream = new StudentFileStream();
        String fileName = "student_info.txt";
        fileStream.writeToFile(student, fileName);
        fileStream.readFromFile(fileName);
    }
}
