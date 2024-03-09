import java.util.ArrayList;

public class College {

    public College( ArrayList<Course> general, ArrayList<Course> professionals , String name ){
        this.generals = general;
        this.professionals = professionals;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Course> generals;
    public ArrayList<Course> professionals;
    String name;

    public void addcourse(Course course){
        if (course.getType().equals("General")) {
            generals.add((General) course);
        } else if (course.getType().equals("Professional")) {
            professionals.add((Professional) course);
        }
    }

    public void Tostring(){
        System.out.println("generals :");
        System.out.println();
        for (int i = 0; i < generals.size(); i++) {
            Course course = generals.get(i);
            course.Tostring();
        }
        System.out.println();
        System.out.println("professionals :");
        System.out.println();
        for (int i = 0; i < professionals.size(); i++) {
            Course course = professionals.get(i);
            course.Tostring();
        }
    }

}
