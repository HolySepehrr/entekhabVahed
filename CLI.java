import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;

public class CLI {

    public CLI() {
        HashMap<String, LocalTime[]> Set = new HashMap<>();

        General riazi1 = new General("moghadasi", "riazi1", "1403/04/03", "08:00", "11:00", 3069, 100, 4);
        riazi1.tabdil("shanbe", "08:00", "10:00");
        riazi1.tabdil("doshanbe", "08:00", "10:00");


        ArrayList<General> MathGenerals = new ArrayList<>();
        ArrayList<Professional> MathProfessionals = new ArrayList<>();

        MathGenerals.add(riazi1);
        College Math = new College(MathGenerals, MathProfessionals);
    }


}
