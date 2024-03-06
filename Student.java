import java.util.ArrayList;

public class Student extends User{
    public Student(String username, String password){
        super(username, password);
        this.courses = new ArrayList<>();
    }

    public int getVahed() {
        return vahed;
    }

    public void setVahed(int vahed) {
        this.vahed = vahed;
    }

    public int getGeneralvahed() {
        return generalvahed;
    }

    public void setGeneralvahed(int generalvahed) {
        this.generalvahed = generalvahed;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    ArrayList<Course> courses;
    int vahed;
    int generalvahed;

}
