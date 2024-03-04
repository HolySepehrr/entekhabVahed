import java.util.ArrayList;

public class College {

    public College( ArrayList<General> general, ArrayList<Professional> professionals ){
        this.generals = general;
        this.professionals = professionals;
    }


    ArrayList<General> generals;
    ArrayList<Professional> professionals;

    public void addcourse(Course course){
        if (course.getType().equals("General")) {
            generals.add((General) course);
        } else if (course.getType().equals("Professional")) {
            professionals.add((Professional) course);
        }
    }
}
