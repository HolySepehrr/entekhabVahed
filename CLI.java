import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;

public class CLI {

    public CLI() {
        HashMap<String, LocalTime[]> Set = new HashMap<>();

        General riazi1 = new General("moghadasi", "riazi1", "1403/04/03", "08:00", "11:00", 3069, 100, 4);
        riazi1.tabdil("shanbe", "08:00", "10:00");
        riazi1.tabdil("doshanbe", "08:00", "10:00");

        Professional riazi2 = new Professional("pornaki", "riazi2", "1403/04/03", "08:00", "11:00", 3070, 100, 4);
        riazi2.tabdil("shanbe", "15:00", "17:00");
        riazi2.tabdil("doshanbe", "15:00", "17:00");

        Professional bp = new Professional("tofighi", "bp", "1403/04/10", "08:00", "11:00", 2077, 30, 4);
        bp.tabdil("yekshanbe", "08:00", "10:00");
        bp.tabdil("seshanbe", "08:00", "10:00");


        ArrayList<General> MathGenerals = new ArrayList<>();
        ArrayList<Professional> MathProfessionals = new ArrayList<>();

        MathGenerals.add(riazi1);
        MathProfessionals.add(riazi2);
        MathProfessionals.add(bp);
        College Math = new College(MathGenerals, MathProfessionals);



        Professional physics2 = new Professional("ali", "physics2", "1403/04/04", "08:00", "11:00", 2022, 100, 3);
        physics2.tabdil("shanbe", "10:00", "12:00");
        physics2.tabdil("doshanbe", "10:00", "12:00");

        General physics1 = new General("pornaki", "physics1", "1403/04/04", "08:00", "11:00", 2021, 100, 3);
        physics1.tabdil("shanbe", "10:00", "12:00");
        physics1.tabdil("doshanbe", "10:00", "12:00");

        Professional azphysics2 = new Professional("kianoosh", "azphysics2", "1403/04/11", "08:00", "11:00", 1001, 40, 1);
        azphysics2.tabdil("yekshanbe", "12:00", "14:00");
        azphysics2.tabdil("seshanbe", "12:00", "14:00");


        ArrayList<General> PhysicsGenerals = new ArrayList<>();
        ArrayList<Professional> PhysicsProfessionals = new ArrayList<>();

        PhysicsGenerals.add(physics1);
        PhysicsProfessionals.add(physics2);
        PhysicsProfessionals.add(azphysics2);
        College Physics = new College(MathGenerals, MathProfessionals);



        General chemistry1 = new General("jesse", "chemistry1", "1403/04/05", "08:00", "11:00", 4001, 100, 3);
        chemistry1.tabdil("shanbe", "08:00", "10:00");
        chemistry1.tabdil("doshanbe", "08:00", "10:00");

        Professional chemistry2 = new Professional("Heisenberg", "chemistry2", "1403/04/05", "08:00", "11:00", 4002, 30, 3);
        chemistry2.tabdil("shanbe", "08:00", "10:00");
        chemistry2.tabdil("doshanbe", "08:00", "10:00");

        Professional masaleh = new Professional("bana", "masaleh", "1403/04/12", "08:00", "11:00", 4235, 30, 3);
        masaleh.tabdil("yekshanbe", "17:00", "18:00");
        masaleh.tabdil("seshanbe", "17:00", "18:00");


        ArrayList<General> ChemistryGenerals = new ArrayList<>();
        ArrayList<Professional> ChemistryProfessionals = new ArrayList<>();

        ChemistryGenerals.add(chemistry1);
        ChemistryProfessionals.add(chemistry2);
        ChemistryProfessionals.add(masaleh);
        College Chemistry = new College(MathGenerals, MathProfessionals);



        General zaban1 = new General("ostad arian", "zaban1", "1403/04/15", "15:00", "17:00", 9896, 40, 3);
        zaban1.tabdil("shanbe", "17:00", "18:30");
        zaban1.tabdil("doshanbe", "17:00", "18:30");

        General zaban2 = new General("iraj maleki", "zaban2", "1403/04/15", "15:00", "17:00", 9897, 40, 3);
        zaban2.tabdil("shanbe", "17:00", "18:30");
        zaban2.tabdil("doshanbe", "17:00", "18:30");

        General adabiat1 = new General("kamali", "adabiat1", "1403/04/15", "15:00", "17:00", 9856, 40, 3);
        adabiat1.tabdil("yekshanbe", "12:00", "14:00");
        adabiat1.tabdil("seshanbe", "12:00", "14:00");


        ArrayList<General> ZabanhaGenerals = new ArrayList<>();
        ArrayList<Professional> ZabanhaProfessionals = new ArrayList<>();

        ZabanhaGenerals.add(adabiat1);
        ZabanhaGenerals.add(zaban1);
        ZabanhaGenerals.add(zaban2);
        College Zabanha = new College(MathGenerals, MathProfessionals);
    }


}
