public class Teacher {

    public String fname;
    public String lname;
    public String indexNumber;

    public Teacher(String fname, String lname, String indexNumber, String email, String address, int grades ){
        this.fname = fname;
        this.lname =lname;
        this.indexNumber = indexNumber;

    }

    public void printTeacherDetails() {
        System.out.println("Imie: " + fname + ", Nazwisko: "+ lname +", Numer indexu: "+indexNumber);
    }
}
