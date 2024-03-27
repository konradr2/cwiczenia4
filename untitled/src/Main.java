// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Konrad","Rutkowski","s20571","s20571@pjwstk.edu.pl","Puławska 1");

        StudentGroup grupa1 = new StudentGroup("grupa 12");
        grupa1.addStudent(student1);

        student1.printStudentDetails();
        grupa1.printGroupDetails();




    }
}