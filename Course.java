import java.util.HashMap;

abstract class Course {
    String ostad;
    String dars;
    int [] emtahan = new int[7];
    int code;
    int zarfiat;
    int vahed;
    HashMap <String , Integer[]> time;

    public Course(String ostad, String dars, int[] emtahan, int code, int zarfiat, int vahed, HashMap<String, Integer[]> time) {
        this.ostad = ostad;
        this.dars = dars;
        this.emtahan = emtahan;
        this.code = code;
        this.zarfiat = zarfiat;
        this.vahed = vahed;
        this.time = time;
    }
}
