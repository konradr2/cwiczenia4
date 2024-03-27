import java.util.ArrayList;

public class Student{
    public String fname;
    public String lname;
    public String indexNumber;
    public String email;
    public String address;
    public ArrayList<Integer> grades;
    public ArrayList<String> group;

    public Student(String fname, String lname, String indexNumber, String email, String address ){
        this.fname = fname;
        this.lname =lname;
        this.indexNumber = indexNumber;
        this.email = email;
        this.address = address;
        this.grades = new ArrayList<>();

    }

    public void addGrade(int grade) {
        grades.add(grade);
    }
    public double averageGrade(){
        if (grades.isEmpty()){
            return 0;
        }
        double sum = 0;
        for (int grade : grades){
            sum += grade;
        }
        return sum / grades.size();
    }

    public void printStudentDetails() {
        System.out.println("Imie: " + fname + ", Nazwisko: "+ lname +", Numer indexu: "+indexNumber+", Email: "+email +", Adres: "+address +", Oceny: " + grades);
    }


}
