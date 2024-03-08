import java.util.ArrayList;

public class College {

    public College( ArrayList<General> general, ArrayList<Professional> professionals , String name ){
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

    public ArrayList<General> generals;
    public ArrayList<Professional> professionals;
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

        System.out.println("professionals :");
        System.out.println();
        for (int i = 0; i < professionals.size(); i++) {
            Course course = professionals.get(i);
            course.Tostring();
        }
    }

}
