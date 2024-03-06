import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

abstract class Course {
    String ostad;
    String Type;
    String dars;
    String tarikhemtahan;

    public int getTedaddaaneshjoo() {
        return tedaddaaneshjoo;
    }

    public void setTedaddaaneshjoo(int tedaddaaneshjoo) {
        this.tedaddaaneshjoo = tedaddaaneshjoo;
    }

    LocalTime[] timeemtahan;
    int code;
    int zarfiat;
    int vahed;
    int tedaddaaneshjoo;
    HashMap<String, LocalTime[]> time;

    public void Course(String roz , String Shorouemtahan , String Payanemtahan){

    }

    public void tabdil (String rooz , String shorokelas , String payankelas){

        LocalTime[] set = new LocalTime[2];
        set[0] = LocalTime.parse(shorokelas);
        set[1] = LocalTime.parse(payankelas);

        time.put(rooz, set);
    }
    public Course(String ostad, String dars, String tarikhemtahan, String Shorouemtahan, String Payanemtahan, int code, int zarfiat, int vahed,String type) {
        this.ostad = ostad;
        this.dars = dars;
        this.timeemtahan = new LocalTime[2];
        timeemtahan[0] = LocalTime.parse(Shorouemtahan);
        timeemtahan[1] = LocalTime.parse(Payanemtahan);
        this.tarikhemtahan = tarikhemtahan;
        this.code = code;
        this.zarfiat = zarfiat;
        this.vahed = vahed;
        this.Type=type;
        this.time = new HashMap<>();
    }

    public HashMap<String, LocalTime[]> getTime() {
        return time;
    }

    public void setTime(HashMap<String, LocalTime[]> time) {
        this.time = time;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }
    public void Tostring(){
        System.out.println("Course name: \""+this.dars+"\"");
        System.out.println("Course teacher: \""+this.ostad+"\"");
        String t = "";
        for (Map.Entry<String, LocalTime[]> entry : time.entrySet()){
            t += entry.getKey() + ": " + Arrays.toString(entry.getValue()) + "\t";
        }
        System.out.println("Course class time: \""+t+"\"");
        System.out.println("Course exam time: \""+this.tarikhemtahan+"\""+"\""+ Arrays.toString(this.timeemtahan) +"\"");
        System.out.println("Course type : \""+this.Type+"\"");
        System.out.println("Course lesson capacity: \""+this.zarfiat+"\"");
        System.out.println("Course units: \""+this.vahed+"\"");
        System.out.println("Course Lesson code: \""+this.code+"\"");
        System.out.println();
    }
}
