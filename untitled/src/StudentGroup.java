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

    public double averageGroupGrade(){
        if (students.isEmpty()){
            return 0;
        }
        double sum = 0;
        for (Student student : students){
            sum += student.averageGrade();
        }
        return sum / students.size();
    }

}
