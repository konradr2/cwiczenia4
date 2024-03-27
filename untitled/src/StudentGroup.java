import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    public String groupName;

    public ArrayList<Student> students;

    public  StudentGroup(String groupname){
        this.groupName = groupname;
        this.students = new ArrayList<>();

    }

    public void addStudent (Student student){
        students.add(student);
    }

    public void removeStudent (Student student){
        students.remove(student);
    }

    public void printGroupDetails() {
        System.out.println("Studenci: ");
    }
}
