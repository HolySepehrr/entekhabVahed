import java.util.ArrayList;

public class Student extends User{
    public Student(String username, String password){
        super(username, password);
        this.courses = new ArrayList<>();
    }

    ArrayList<Course> courses;
    int vahed;
    int generalvahed;

}
